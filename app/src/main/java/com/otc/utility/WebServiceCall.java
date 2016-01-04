package com.otc.utility;

import android.app.ProgressDialog;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.synovergetest.otcmobilestore.OTCBaseActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

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
                    /*String name = response.getString("name");
                    String email = response.getString("email");
                    JSONObject phone = response.getJSONObject("phone");
                    String home = phone.getString("home");
                    String mobile = phone.getString("mobile");*/

                 /*   jsonResponse = "";
                    jsonResponse += "Name: " + name + "\n\n";
                    jsonResponse += "Email: " + email + "\n\n";
                    jsonResponse += "Home: " + home + "\n\n";
                    jsonResponse += "Mobile: " + mobile + "\n\n";

                    txtResponse.setText(jsonResponse);*/
                    hideDialog();
                    mWebServiceResponseListener.response(response + "");

                } catch (Exception e) {
                    e.printStackTrace();


                }

            }
        }, new ErrorListener() {

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


    //Example URL
    //http://www.androidhive.info/2014/09/android-json-parsing-using-volley/

    //volley tuts
    //http://code.tutsplus.com/tutorials/an-introduction-to-volley--cms-23800


    //found the code for post request here/
    //http://stackoverflow.com/questions/31288480/how-to-send-json-post-request-using-volley-in-android-in-the-given-tutorial


    public void makeJsonPOSTRequest() {
        showDialog();

        JSONObject jsonBody = new JSONObject();

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, urlJsonObj, jsonBody, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {

                // Log.e(TAG, "Response " + jsonObject.toString());
                mWebServiceResponseListener.response(jsonObject.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

                mWebServiceResponseListener.response(volleyError.getMessage());
            }
        });

        StringRequest postRequest = new StringRequest(Request.Method.POST, urlJsonObj,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {

                            hideDialog();
                            mWebServiceResponseListener.response(response);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        hideDialog();
                        mWebServiceResponseListener.response(error.getMessage());
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                // the POST parameters:
                params.put("site", "code");
                params.put("network", "tutsplus");
                return params;
            }
        };

        Volley.newRequestQueue(this).add(postRequest);


    }

}
