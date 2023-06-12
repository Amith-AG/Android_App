package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import java.util.concurrent.Delayed;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref=getSharedPreferences("log",MODE_PRIVATE);
                Boolean check=pref.getBoolean("flag",false);
                Intent i;
                if(check)
                {
                    i=new Intent(MainActivity.this,menu.class);
                }
                else
                {
                    i=new Intent(MainActivity.this,login.class);
                }
                startActivity(i);

            }
        },4000);

}}