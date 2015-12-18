package com.synovergetest.otcmobilestore;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class OTCBaseActivity extends ActionBarActivity {

    protected TextView txtHeader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    protected void setHeaderTitle(int resID)
    {

    }


    public void showToast(Context mContext, String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }
}
