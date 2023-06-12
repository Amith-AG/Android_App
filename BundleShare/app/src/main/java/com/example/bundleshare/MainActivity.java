package com.example.bundleshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText er,en,ec;
    Intent i;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        er=findViewById(R.id.er);
        en=findViewById(R.id.en);
        ec=findViewById(R.id.ec);
        b=findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer roll=Integer.parseInt(er.getText().toString());
                String name=en.getText().toString();
                String clas=ec.getText().toString();
                i=new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("roll",roll);
                i.putExtra("name",name);
                i.putExtra("clas",clas);
                startActivity(i);

            }
        });
    }
}