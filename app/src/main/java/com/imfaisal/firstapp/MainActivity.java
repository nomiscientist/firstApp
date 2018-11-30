package com.imfaisal.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Error","Critical Failure!");
        Log.i("Information","Main Activity Layout Started!");
        Log.d("Debug","Currently, we are in debugging mode.");
    }
}
