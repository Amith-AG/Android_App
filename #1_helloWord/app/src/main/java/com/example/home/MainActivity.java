package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn(View view){
        TextView txt=findViewById(R.id.T3);
        txt.setText("Other Page");
        Toast.makeText(getApplicationContext(),"Home page changed into Other page",Toast.LENGTH_LONG).show();
}
}
