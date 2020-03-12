package com.bdfleet.androidservice;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {

    public static final String CHANNEL_ID = "exampleService";


    @Override
    public void onCreate() {
        super.onCreate();

        createNotificetionChennet();

    }

    private void createNotificetionChennet(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            NotificationChannel serviceChennel = new NotificationChannel(
                    CHANNEL_ID,"Example Service Chennel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(serviceChennel);
        }
    }
}
