package com.mohan1614044.day7sharedpreferancesapiexample;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferanceConfig {


    private SharedPreferences sharedPreferences;
    private Context context;


    public SharedPreferanceConfig(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.login_preferances_), Context.MODE_PRIVATE);
    }

    public void writeLoginStatus(boolean status) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.login_status_preferances_), status);
        editor.commit();

    }

    public boolean readLoginStatus() {
        boolean status = false;
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.login_status_preferances_), false);
        return status;
    }

}
