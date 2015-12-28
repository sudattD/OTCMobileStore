package com.synovergetest.otcmobilestore;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class SaleScreen extends OTCBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale_screen);

        // ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_image));
    }


}
