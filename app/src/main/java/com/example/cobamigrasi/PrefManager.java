package com.example.cobamigrasi;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;

    int PRIVATE_MODE = 0;

    private static final String PRED_NAME = "SESSION";
    private static final String SESSION_KEY = "SESSION_USER";

    public PrefManager(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences(SESSION_KEY, PRIVATE_MODE);
        editor = preferences.edit();
    }

    public void saveSession(){
        editor.putBoolean(SESSION_KEY, true);
        editor.commit();
    }

    public boolean getSession(){
        return preferences.getBoolean(SESSION_KEY, false);
    }

    public void destroySession(){
        editor.putBoolean(SESSION_KEY, false);
        editor.commit();
    }


}
