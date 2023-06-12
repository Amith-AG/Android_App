package com.example.bundleshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t=findViewById(R.id.t);
        Intent i=getIntent();
        Integer roll=i.getIntExtra("roll",0);
        String name=i.getStringExtra("name");
        String clas=i.getStringExtra("clas");
        t.setText("Roll No:"+roll.toString()+"\nName:"+name+"\nclass:"+clas);
    }
}