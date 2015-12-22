package com.synovergetest.otcmobilestore;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.adapters.CustomAdapter;


public class CustomerScreen extends OTCBaseActivity implements View.OnClickListener {

    ImageView refreshView,addImage,downArrowImage,searchImage;
    Context mContext;
    ListView listView;
    public static String[] id_ = {"1", "2", "3", "4", "5"};
    public static String[] names_ = {"sudatt", "rahul", "Aniket", "Chirag", "Shraddha"};
    public static String[] lastnames_ = {"Dave", "Dravid", "Sananse", "Singhania", "Samrat"};
    public static String[] postal_ = {"678", "67567", "657567", "6678", "98745"};
    public static String[] phone_ = {"9878787878", "100", "7896456", "987456123", "9712386301"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_screen);


        initializeViews();
    }

    private void initializeViews() {


        mContext = this;
        refreshView = (ImageView) findViewById(R.id.refreshView);
        refreshView.setOnClickListener(this);

        addImage = (ImageView)findViewById(R.id.plusArrow);
        addImage.setOnClickListener(this);

        downArrowImage = (ImageView)findViewById(R.id.downArrow);
        downArrowImage.setOnClickListener(this);

        searchImage  = (ImageView)findViewById(R.id.searchView);
        searchImage.setOnClickListener(this);


        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomAdapter(this, id_));

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
