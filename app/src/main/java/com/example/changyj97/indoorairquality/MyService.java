package com.example.changyj97.indoorairquality;

import android.app.*;
import android.content.*;
import android.os.*;
import android.util.*;

public class MyService extends Service {

    NotificationManager nManager;
    ServiceThread thread;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("service","onCreate 실행");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("service","onStartCommand 실행");
        nManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        thread = new ServiceThread(handler);
        thread.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.d("service","onDestroy 실행");
        thread.stopForever();
        thread = null;
    }

    Handler handler = new Handler() {

    };
}