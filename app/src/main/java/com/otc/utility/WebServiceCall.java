package com.otc.utility;

import android.app.ProgressDialog;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.synovergetest.otcmobilestore.OTCBaseActivity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by davesuda on 12/18/2015.
 */
public class WebServiceCall extends OTCBaseActivity {

    Context mContext;
    String urlJsonObj;
    WebserviceResponseListener mWebServiceResponseListener;
    private ProgressDialog pDialog;


    public WebServiceCall(Context mContext, String url, WebserviceResponseListener mWebServiceListener) {
        this.mContext = mContext;
        this.urlJsonObj = url;
        this.mWebServiceResponseListener = mWebServiceListener;

        pDialog = new ProgressDialog(mContext);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);
    }


    public void makeJsonObjectRequest() {

        showDialog();
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                urlJsonObj, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {


                //  showToast(mContext, "" + response);

                try {
                    // Parsing json object response
                    // response will be a json object
                    String name = response.getString("name");
                    String email = response.getString("email");
                    JSONObject phone = response.getJSONObject("phone");
                    String home = phone.getString("home");
                    String mobile = phone.getString("mobile");

                 /*   jsonResponse = "";
                    jsonResponse += "Name: " + name + "\n\n";
                    jsonResponse += "Email: " + email + "\n\n";
                    jsonResponse += "Home: " + home + "\n\n";
                    jsonResponse += "Mobile: " + mobile + "\n\n";

                    txtResponse.setText(jsonResponse);*/

                } catch (JSONException e) {
                    e.printStackTrace();


                }
                hideDialog();
                mWebServiceResponseListener.response(response + "");
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {/*
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();*/
                // hide the progress dialog

                // showToast(mContext, error.getMessage());
                hideDialog();
                mWebServiceResponseListener.response(error.getMessage());
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);
    }

    private void showDialog() {

        if (!pDialog.isShowing())
            pDialog.show();

    }

    private void hideDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }

}
