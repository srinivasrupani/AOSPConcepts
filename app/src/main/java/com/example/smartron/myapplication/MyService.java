package com.example.smartron.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    int c=0,s=0;
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        s=s+1;
        Log.e("onStartCommand", "= "+s);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        c=c+1;
        Log.e("onCreate", "= "+c);
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
