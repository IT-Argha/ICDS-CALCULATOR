package com.example.icdscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref = getSharedPreferences("login",MODE_PRIVATE);
                Boolean ckeck = pref.getBoolean("flag",false);
                Intent intent3;
                if (ckeck.equals(false)){
                   intent3 = new Intent(MainActivity6.this, MainActivity5.class);
                }else{
                     intent3 = new Intent(MainActivity6.this, MainActivity.class);
                }
                // Intent is used to switch from one activity to another.

                startActivity(intent3);
                 finish();
            }
        }, 5000);
    }
}