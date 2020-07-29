package com.dmrysev.api;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestPermissions();
        finish();
    }

    void requestPermissions() {
        requestForDoNotDisturbPermission();
    }

    void requestForDoNotDisturbPermission() {
        NotificationManager notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        if (!notificationManager.isNotificationPolicyAccessGranted()) {
            Intent intent = new Intent(android.provider.Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS);
            startActivityForResult( intent, 0 );
        }
    }
}