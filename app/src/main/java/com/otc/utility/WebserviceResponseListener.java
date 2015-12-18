package com.otc.utility;

/**
 * Created by davesuda on 12/18/2015.
 */
public interface WebserviceResponseListener {


    /**
     * method to catch response
     *
     * @param strresponse response get from any web-service
     */
    public void response(String strresponse);

    /***
     * If Error or Exception occured
     */
    public void onError();
}
