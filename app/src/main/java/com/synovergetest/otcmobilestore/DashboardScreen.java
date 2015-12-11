package com.synovergetest.otcmobilestore;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class DashboardScreen extends OTCBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_screen);
    }




    public void onClickSale(View v)
    {

      //  Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplication(),SaleScreen.class));

    }


    public void onClickRefund(View v)
    {

        Toast.makeText(getApplicationContext(),"coming soon...",Toast.LENGTH_SHORT).show();


    }


    public void onClickCustomers(View v)
    {

        //Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplication(),CustomerScreen.class));


    }



    public void onClickProducts(View v)
    {

       // Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplication(),ProductsScreen.class));


    }

    public void onClickAdmin(View v)
    {

        //Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplication(),AdminScreen.class));


    }


    public void onClickReports(View v)
    {

       // Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplication(),ReportScreen.class));


    }




    public void onClickConnect(View v)
    {

        Toast.makeText(getApplicationContext(),"coming soon...",Toast.LENGTH_SHORT).show();


    }


    public void onClickScanner(View v)
    {

        Toast.makeText(getApplicationContext(),"coming soon...",Toast.LENGTH_SHORT).show();


    }

    //onClickSync

    public void onClickSync(View v)
    {

        Toast.makeText(getApplicationContext(),"coming soon...",Toast.LENGTH_SHORT).show();


    }



}
