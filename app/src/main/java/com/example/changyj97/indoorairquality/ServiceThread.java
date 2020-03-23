package com.example.changyj97.indoorairquality;

import android.os.Handler;

public class ServiceThread extends Thread {
    Handler handler;
    boolean isRun = true;

    public ServiceThread(Handler handler) {
        this.handler = handler;
    }
    public void stopForever(){
        synchronized (this) {
            this.isRun = false;
            notify();
        }
    }

    public void run(){
        while (isRun) {
        }
    }
}
