package com.example.icdscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button logbtn = findViewById(R.id.logbtn);
        EditText pas = findViewById(R.id.pass);

        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pas.getText().toString().equals("2345678") || pas.getText().toString().equals("9051158759")) {

                    SharedPreferences pref =   getSharedPreferences("login",MODE_PRIVATE);
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putBoolean("flag",true);
                    editor.apply();

                    Intent intent3 = new Intent(MainActivity5.this, MainActivity.class);
                    startActivity(intent3);
                    finish();
                }else {

                    Toast.makeText(getApplicationContext(), "Wrong Password",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}