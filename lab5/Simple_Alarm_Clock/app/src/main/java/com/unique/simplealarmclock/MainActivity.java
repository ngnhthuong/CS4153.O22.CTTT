package com.unique.simplealarmclock;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import android.os.Build;


public class MainActivity extends Application {
    public static final String CHANNEL_ID = "ALARM_SERVICE_CHANNEL";
    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannnel();
    }

    private void createNotificationChannnel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel serviceChannel = new NotificationChannel(
                    CHANNEL_ID,
                    getString(R.string.app_name)+"Service Channel",
                    NotificationManager.IMPORTANCE_HIGH
            );

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(serviceChannel);
        }
    }
}
