package com.dmrysev.api;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

public class Unmute extends IntentService {

    public Unmute() {
        super("Unmute");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        unmute();
    }

    void unmute() {
        AudioManager audioManager = (AudioManager)getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
        audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
    }

}