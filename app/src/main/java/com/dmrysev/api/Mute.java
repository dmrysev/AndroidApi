package com.dmrysev.api;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

public class Mute extends IntentService {

    public Mute() {
        super("Mute");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        mute();
    }
    
    void mute() {
        AudioManager audioManager = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
        audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
    }
}