package com.example.bankmanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static Integer bal=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void logBtn(View view)
    {
        EditText e1=findViewById(R.id.e1);
        EditText e2=findViewById(R.id.e2);
        if(e1.getText().toString().equals("admin")&& e2.getText().toString().equals("root"))
        {
            Intent i=new Intent(getApplicationContext(),Menu.class);
            startActivity(i);

        }
        else
        {
            Toast.makeText(getApplicationContext(),"login failed",Toast.LENGTH_LONG).show();
        }


    }

}