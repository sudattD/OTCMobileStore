package com.synovergetest.otcmobilestore;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.otc.utility.AppController;
import com.otc.utility.WebServiceCall;
import com.otc.utility.WebserviceResponseListener;

import org.json.JSONException;
import org.json.JSONObject;


public class LoginActivity extends OTCBaseActivity implements WebserviceResponseListener {

    Context mContext;
    private ProgressDialog pDialog;

    private String urlJsonObj = "http://api.androidhive.info/volley/person_object.json";
    // private String urlJsonObj = "http://162.144.92.244:8180/GPSMobileApp.svc/AuthenticateUser/?UserName=mehul.parmar@synoverge.com&Password=Mehul@123";
    //http://162.144.92.244:8180/GPSMobileApp.svc/AuthenticateUser/?UserName=mehul.parmar@synoverge.com&Password=Mehul@123


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        initializeViews();
    }

    private void initializeViews() {

        mContext = this;
        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);

    }

    @Override
    protected void onResume() {
        super.onResume();
        makeJsonObjectRequest();
    }

    public void onClickLogin(View v)
    {
        startActivity(new Intent(getApplicationContext(), DashboardScreen.class));
    }


    /**
     * Method to make json object request where json response starts wtih {
     */
    private void makeJsonObjectRequest() {

        WebServiceCall mWebser = new WebServiceCall(mContext, urlJsonObj, this);
        mWebser.makeJsonObjectRequest();
/*

        showDialog();
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                urlJsonObj, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {

                showToast(mContext, "" + response);

                try {
                    // Parsing json object response
                    // response will be a json object
                    String name = response.getString("name");
                    String email = response.getString("email");
                    JSONObject phone = response.getJSONObject("phone");
                    String home = phone.getString("home");
                    String mobile = phone.getString("mobile");

                 *//*   jsonResponse = "";
                    jsonResponse += "Name: " + name + "\n\n";
                    jsonResponse += "Email: " + email + "\n\n";
                    jsonResponse += "Home: " + home + "\n\n";
                    jsonResponse += "Mobile: " + mobile + "\n\n";

                    txtResponse.setText(jsonResponse);*//*

                } catch (JSONException e) {
                    e.printStackTrace();


                }
                hideDialog();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {*//*
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();*//*
                // hide the progress dialog

                showToast(mContext, error.getMessage());
                hideDialog();
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);*/
    }

    /**
     * Method to make json array request where response starts with [
     */
    private void makeJsonArrayRequest() {

        showDialog();


    }

    private void showDialog() {

        if (!pDialog.isShowing())
            pDialog.show();

    }

    private void hideDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }

    @Override
    public void response(String strresponse) {

        showToast(mContext, "sudatt" + strresponse);
    }

    @Override
    public void onError() {

    }
}
