package com.bdfleet.androidservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent serviceIntent = new Intent(this,ExampleServices.class);
        serviceIntent.putExtra("IntentExtra","My Notification");
        ContextCompat.startForegroundService(this, serviceIntent);

    }
}
