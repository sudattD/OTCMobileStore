package com.synovergetest.otcmobilestore;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class CustomerScreen extends ActionBarActivity implements View.OnClickListener {

    ImageView refreshView,addImage,downArrowImage,searchImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_screen);


        initializeViews();
    }

    private void initializeViews() {

        refreshView = (ImageView) findViewById(R.id.refreshView);
        refreshView.setOnClickListener(this);

        addImage = (ImageView)findViewById(R.id.plusArrow);
        addImage.setOnClickListener(this);

        downArrowImage = (ImageView)findViewById(R.id.downArrow);
        downArrowImage.setOnClickListener(this);

        searchImage  = (ImageView)findViewById(R.id.searchView);
        searchImage.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_customer_screen, menu);
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

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.refreshView:
                Toast.makeText(getApplicationContext(),"coming soon..",Toast.LENGTH_SHORT).show();
                break;

            case R.id.plusArrow:
                Toast.makeText(getApplicationContext(),"coming soon..",Toast.LENGTH_SHORT).show();
                break;


            case R.id.downArrow:
                Toast.makeText(getApplicationContext(),"coming soon..",Toast.LENGTH_SHORT).show();
                break;

            case R.id.searchView:
                Toast.makeText(getApplicationContext(),"coming soon..",Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }


    }
}
