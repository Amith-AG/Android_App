package com.example.a3_electrichome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class com extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com);
        EditText e=findViewById(R.id.edt);
        EditText e1=findViewById(R.id.edit3);
        TextView t=findViewById(R.id.tx);
        e.setText(getIntent().getStringExtra("cid"));
        Button b=findViewById(R.id.button3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Float a=Float.parseFloat(e1.getText().toString());
                    if(a<100&&a>0)
                    {
                        t.setText("Total:"+a+"$");
                    }
                    else if(a>100)
                    {
                        Float b=3*(a-100);
                        Float c=100+b;
                        t.setText("Total:"+c+"$");

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"invalid unit value",Toast.LENGTH_LONG).show();

                    }
                   }
                catch (NumberFormatException e)
                {
                    Toast.makeText(getApplicationContext(),"invalid unit value",Toast.LENGTH_LONG).show();
                }


            }
        });
    }
    public void btnBack(View view)
    {
        Intent i =new Intent(getApplicationContext(),electricHome.class);
        startActivity(i);
    }
}