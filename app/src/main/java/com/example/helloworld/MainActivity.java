package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Arkaitz", "Debugeatzen");
        Log.d("MainActivity", "Hello World Debug Message");
        Log.i("MainActivity", "Hello World Info Message");
        Log.w("MainActivity", "Hello World Warning Message");
        Log.e("MainActivity", "Hello World Error Message");
        Log.v("MainActivity", "Hello World Verbose Message");
    }
}