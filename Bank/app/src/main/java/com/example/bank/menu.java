package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.button2:
                Intent i=new Intent(getApplicationContext(),deposit.class);
                startActivity(i);
                break;
            case R.id.button3:
                Intent a=new Intent(getApplicationContext(),withdraw.class);
                startActivity(a);
                break;
            case R.id.button4:
                Intent s=new Intent(getApplicationContext(),balance.class);
                startActivity(s);
                break;
            case R.id.button6:
                SharedPreferences pref=getSharedPreferences("log",MODE_PRIVATE);
                SharedPreferences.Editor editor= pref.edit();
                editor.putBoolean("flag",false);
                editor.apply();
                Intent f=new Intent(menu.this,login.class);
                startActivity(f);
                break;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button b1=findViewById(R.id.button2);
        Button b2=findViewById(R.id.button3);
        Button b3=findViewById(R.id.button4);
        Button b4=findViewById(R.id.button6);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }
}