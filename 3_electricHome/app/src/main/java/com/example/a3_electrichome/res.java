package com.example.a3_electrichome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class res extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
        EditText ed=findViewById(R.id.edit);
        ed.setText(getIntent().getStringExtra("cid"));
        Button b=findViewById(R.id.button4);
        EditText e=findViewById(R.id.et2);
        TextView t=findViewById(R.id.textView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Float a=Float.parseFloat(e.getText().toString());
                    if(a>0)
                    {
                        t.setText("Total:"+a+"$" +
                                "");
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"invalid input",Toast.LENGTH_LONG).show();
                    }
                }
                catch (NumberFormatException e)
                {
                    Toast.makeText(getApplicationContext(),"invalid input",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    public void btnbac(View view)
    {
        Intent i=new Intent(getApplicationContext(),electricHome.class);
        startActivity(i);

    }
}