package com.synovergetest.otcmobilestore;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class CustomerScreen extends OTCBaseActivity implements View.OnClickListener {

    ImageView refreshView,addImage,downArrowImage,searchImage;
    Context mContext;
    ListView listView;
    EditText edt_id, edt_first_name, edt_last_name, edt_post_code, edt_phone_num;
    public static String[] id_ = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public static String[] names_ = {"sudatt", "rahul", "Aniket", "Chirag", "Shraddha", "Akhil", "Rana", "Diwaan", "Bajirao", "Rahim"};
    public static String[] lastnames_ = {"Dave", "Dravid", "Sananse", "Singhania", "Samrat", "Hiranandani", "Sehgal", "Mohammad", "Khan", "Kumar"};
    public static String[] postal_ = {"678", "67567", "657567", "6678", "98745", "5676", "7878", "5634", "4321", "8908"};
    public static String[] phone_ = {"9878787878", "100", "7896456", "987456123", "9712386301", "5768576", "75645", "4321", "23456", "8979"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_screen);


        initializeViews();
        settingUpActionBarView();
    }

    private void settingUpActionBarView() {

        LayoutInflater infalInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View mView = infalInflater.inflate(R.layout.app_bar_customers, null);

        getSupportActionBar().setCustomView(mView);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setBackgroundDrawable(
                getResources().getDrawable(R.drawable.action_bar_image));
    }

    private void initializeViews() {


        mContext = this;
       /* refreshView = (ImageView) findViewById(R.id.refreshView);
        refreshView.setOnClickListener(this);

        addImage = (ImageView)findViewById(R.id.plusArrow);
        addImage.setOnClickListener(this);

        downArrowImage = (ImageView)findViewById(R.id.downArrow);
        downArrowImage.setOnClickListener(this);

        searchImage  = (ImageView)findViewById(R.id.searchView);
        searchImage.setOnClickListener(this);*/


        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomAdapter(this, id_));


        edt_id = (EditText) findViewById(R.id.edtId);
        edt_first_name = (EditText) findViewById(R.id.edtFirstName);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_customer_screen, menu);
        return true;
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

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            /*case R.id.refreshView:
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
                break;*/
        }


    }

    class CustomAdapter extends BaseAdapter {

        String[] result;
        Context mContext;
        private LayoutInflater inflater = null;

        public CustomAdapter(Activity act, String[] list) {
            this.mContext = act;
            this.result = list;
            inflater = (LayoutInflater) act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return result.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public class Holder {
            TextView tv1, tv2, tv3, tv4, tv5;
        }


        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            Holder holder = new Holder();
            View rowView;
            rowView = inflater.inflate(R.layout.list_view_customer_item, null);
            holder.tv1 = (TextView) rowView.findViewById(R.id.tvListItem1);
            holder.tv2 = (TextView) rowView.findViewById(R.id.tvListItem2);
            holder.tv3 = (TextView) rowView.findViewById(R.id.tvListItem3);
            holder.tv4 = (TextView) rowView.findViewById(R.id.tvListItem4);
            holder.tv5 = (TextView) rowView.findViewById(R.id.tvListItem5);


            holder.tv1.setText(result[position]);
            holder.tv2.setText(CustomerScreen.names_[position]);
            holder.tv3.setText(CustomerScreen.lastnames_[position]);
            holder.tv4.setText(CustomerScreen.postal_[position]);
            holder.tv5.setText(CustomerScreen.phone_[position]);

            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Toast.makeText(mContext, "CLICKED" + result[position].toString() + "name:-" + CustomerScreen.names_[position].toString(), Toast.LENGTH_SHORT).show();
                    edt_first_name.setText(CustomerScreen.names_[position].toString());

                }
            });


            return rowView;
        }
    }
}
