package com.synovergetest.otcmobilestore;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.android.adapters.ProductAdapter;


public class ProductsScreen extends OTCBaseActivity {


    Context mContext;
    ListView listView;
    public static String[] id_ = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public static String[] sku_ = {"1asfer", "2aserd", "3tyrfd", "sku4", "sku5", "sku6", "sku7", "sku8", "sku9", "sku10"};
    public static String[] title_ = {"Naagraj Venkat", "Dinesh Mathur", "Sreeraj Maali", "Dharmesh P.", "Nayan Mongia", "Sourav Ganguly", "Mohd. Azharuddin", "Venkatesh Prasad", "Rahul Dravid", "Mahendra Dhoni"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_screen);


        initializeViews();
        settingUpActionBarView();
    }

    private void settingUpActionBarView() {

        LayoutInflater infalInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View mView = infalInflater.inflate(R.layout.app_bar_products, null);

        getSupportActionBar().setCustomView(mView);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setBackgroundDrawable(
                getResources().getDrawable(R.drawable.action_bar_image));
    }

    private void initializeViews() {

        mContext = this;
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ProductAdapter(this, id_));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_products_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
