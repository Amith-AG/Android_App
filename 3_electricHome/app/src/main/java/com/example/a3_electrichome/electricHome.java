package com.example.a3_electrichome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class electricHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnhome(View view){
        EditText ed1=findViewById(R.id.e1);
        EditText ed2=findViewById(R.id.e2);
        if(ed1.getText().toString().equals("admin") && ed2.getText().toString().equals("root")) {
            Intent i = new Intent(getApplicationContext(),com_res.class);
            startActivity(i);

        }
        else {
            Toast.makeText(getApplicationContext(),"invalid username and password",Toast.LENGTH_LONG).show();
        }
    }
}