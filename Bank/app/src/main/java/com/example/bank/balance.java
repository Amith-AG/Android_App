package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class balance extends AppCompatActivity {
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);
        SharedPreferences pref=getSharedPreferences("log",MODE_PRIVATE);
        Integer bal= pref.getInt("bal",0);
        textView6=findViewById(R.id.textView6);
        textView6.setText("Balance: "+bal.toString());

    }
}