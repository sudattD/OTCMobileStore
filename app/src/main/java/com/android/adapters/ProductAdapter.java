package com.android.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.synovergetest.otcmobilestore.R;

/**
 * Created by davesuda on 12/23/2015.
 */
public class ProductAdapter extends BaseAdapter {

    String[] result;
    Context mContext;
    private static LayoutInflater inflater = null;

    public ProductAdapter(Activity act, String[] list) {
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
        TextView tv1, tv2, tv3;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.listview_production_item, null);
        holder.tv1 = (TextView) rowView.findViewById(R.id.tvListItem1);
        holder.tv2 = (TextView) rowView.findViewById(R.id.tvListItem2);
        holder.tv3 = (TextView) rowView.findViewById(R.id.tvListItem3);


        return rowView;
    }
}
