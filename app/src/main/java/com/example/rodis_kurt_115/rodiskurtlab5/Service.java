package com.example.rodis_kurt_115.rodiskurtlab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class Service extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public Service() {
        super("Service");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITG", "Service is Running");
    }
}
