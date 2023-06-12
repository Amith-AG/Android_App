package com.example.a3_electrichome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class com_res extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com_res);
    }
    public void btnRes(View view)
    {
        EditText ed=findViewById(R.id.ed3);
        String s=ed.getText().toString();
        Intent in=new Intent(getApplicationContext(),res.class);
        in.putExtra("cid",s);
        startActivity(in);

    }
    public void btnCom(View view)
    {
        EditText ed=findViewById(R.id.ed3);
        String s=ed.getText().toString();
        Intent intent=new Intent(getApplicationContext(),com.class);
        intent.putExtra("cid",s);
        startActivity(intent);

    }
}