package com.synovergetest.otcmobilestore;

import android.app.ActionBar;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class SaleScreen extends OTCBaseActivity {

    ImageView search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale_screen);

        // ActionBar actionBar = getSupportActionBar();

        settingUpActionBarView();
        // initializeViews();
        //settingUpActionBar(R.layout.app_bar_sale);

        //  getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_image));
    }


    private void settingUpActionBarView() {
        LayoutInflater infalInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View mView = infalInflater.inflate(R.layout.app_bar_sale, null);

        getSupportActionBar().setCustomView(mView);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setBackgroundDrawable(
                getResources().getDrawable(R.drawable.action_bar_image));


        search = (ImageView) mView.findViewById(R.id.searchView);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showToast(getApplicationContext(), "Search clicked");
                Log.d(SaleScreen.class.getSimpleName(), "SEARCH CLICKED");
            }
        });


    }


    private void initializeViews() {
        LayoutInflater infalInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View mView = infalInflater.inflate(R.layout.app_bar_sale, null);


        search = (ImageView) mView.findViewById(R.id.searchView);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showToast(getApplicationContext(), "Search clicked");
                Log.d(SaleScreen.class.getSimpleName(), "SEARCH CLICKED");
            }
        });


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
}
