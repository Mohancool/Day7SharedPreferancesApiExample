package com.mohan1614044.day7sharedpreferancesapiexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SuccessActivity extends AppCompatActivity {
     private SharedPreferanceConfig PreferanceConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);


        PreferanceConfig =new SharedPreferanceConfig(getApplicationContext());
    }

        public void userLogout(View view){

        PreferanceConfig.writeLoginStatus(false);
        startActivity(new Intent(this,MainActivity.class));
        finish();

    }
}
