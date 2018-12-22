package com.mohan1614044.day7sharedpreferancesapiexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SharedPreferanceConfig preferanceConfig;
    private EditText Username,userpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferanceConfig = new SharedPreferanceConfig(getApplicationContext());
        Username =findViewById(R.id.txtuser);
        userpassword =findViewById(R.id.txtpwd);

       if(preferanceConfig.readLoginStatus()){
          startActivity(new Intent(this,SuccessActivity.class));
          finish();
       }

    }

    public void loginUser(View view){
        String username = Username.getText().toString();
        String password = userpassword.getText().toString();

        if(username.equals(getResources().getString(R.string.user_name)) && password.equals(getResources().getString(R.string.user_password )))
            {
                startActivity(new Intent(this,SuccessActivity.class));
                preferanceConfig.writeLoginStatus(true);
                finish();


        }
        else
        {
            Toast.makeText(this, "Login Failed .. Try again", Toast.LENGTH_SHORT).show();
            Username.setText("");
            userpassword.setText("");
        }


    }
}
