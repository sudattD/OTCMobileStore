package com.android.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.synovergetest.otcmobilestore.CustomerScreen;
import com.synovergetest.otcmobilestore.R;

/**
 * Created by davesuda on 12/22/2015.
 */
public class CustomAdapter extends BaseAdapter {

    String[] result;
    Context mContext;
    private static LayoutInflater inflater = null;

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

                Toast.makeText(mContext, "CLICKED" + result[position], Toast.LENGTH_SHORT).show();
            }
        });


        return rowView;
    }
}
