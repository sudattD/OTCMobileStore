package com.synovergetest.otcmobilestore;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends OTCBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    protected void onResume() {
        super.onResume();


        // TODO Auto-generated method stub
        super.onResume();



		/*
			This method runs in the background thread and has a 3 seconds pause to show the splash image.

		*/

        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                try {

                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    Log.e("", e.toString());
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void result) {



					/*
					 * The Code below starts another activity which is a screen with PIN in our case .
					*/


                //startActivity(new Intent(SplashScreenActivity.this, CanDetails.class).putExtra("isCheck","Admin" ));

                //startActivity(new Intent(SplashScreenActivity.this, MainActivity.class).putExtra("fora", farmerOrAdmin));
                startActivity(new Intent(MainActivity.this, LoginActivity.class));


                finish();
            }
        }.execute();




    }
}
