package com.synovergetest.otcmobilestore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class AdminScreen extends OTCBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_screen);

        settingUpActionBarView();


    }

    private void settingUpActionBarView() {

        LayoutInflater infalInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View mView = infalInflater.inflate(R.layout.app_bar_admin, null);

        getSupportActionBar().setCustomView(mView);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setBackgroundDrawable(
                getResources().getDrawable(R.drawable.action_bar_image));



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

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
