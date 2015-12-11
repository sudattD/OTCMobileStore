package com.synovergetest.otcmobilestore;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class AdminScreen extends OTCBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_screen);
    }


    public void onClickSettings(View v)
    {

        startActivity(new Intent(getApplicationContext(), SettingsScreen.class));

    }

    public void onClickSupportScreen(View v)
    {
        startActivity(new Intent(getApplicationContext(),SupportScreen.class));
    }


    public void onClickLogViewer(View v)
    {

        startActivity(new Intent(getApplicationContext(),LogViewerScreen.class));

    }
}
