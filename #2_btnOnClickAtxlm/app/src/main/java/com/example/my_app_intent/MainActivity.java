package com.example.my_app_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void btn(View view){
        TextView txt3=findViewById(R.id.t3);
        EditText ed1=findViewById(R.id.ed1);
        EditText ed2=findViewById(R.id.ed2);
        txt3.setText("Welcome "+ed1.getText()+"!!!.We have sent you a mail to "+ed2.getText());
        Toast.makeText(getApplicationContext(),"successfull sumbitted",Toast.LENGTH_LONG).show();


    }
}