package com.synovergetest.otcmobilestore;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class LoginActivity extends OTCBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }



    public void onClickLogin(View v)
    {
        startActivity(new Intent(getApplicationContext(),DashboardScreen.class));
    }
}
