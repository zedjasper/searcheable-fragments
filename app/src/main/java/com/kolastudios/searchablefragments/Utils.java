package com.kolastudios.searchablefragments;

import android.util.Log;

public class Utils {
    static String LOG_TAG = "SEARCHEABLE";

    public static void log(String msg){
        if(msg == null){
            return;
        }
        int maxLogSize = 1000;
        for(int i = 0; i <= msg.length() / maxLogSize; i++) {
            int start = i * maxLogSize;
            int end = (i + 1) * maxLogSize;
            end = end > msg.length() ? msg.length() : end;
            Log.d(LOG_TAG, msg.substring(start, end));
        }
    }

    public static void logE(String msg){
        android.util.Log.e(LOG_TAG, msg);
    }
}
