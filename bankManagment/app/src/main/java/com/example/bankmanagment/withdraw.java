package com.example.bankmanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class withdraw extends AppCompatActivity {
    EditText eam;
    EditText ep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);
        eam=findViewById(R.id.eAmt);
        ep=findViewById(R.id.ePin);
    }
    public void withBtn(View view)
    {
        try {
            Integer a=Integer.parseInt(eam.getText().toString());
            Integer p=Integer.parseInt(ep.getText().toString());
            if(a<=MainActivity.bal&&p==1234&&a>0)
            {
                MainActivity.bal=MainActivity.bal-a;
                try {
                    Toast.makeText(this, "Successfully Withdraw", Toast.LENGTH_SHORT).show();
                    Thread.sleep(1000);
                    Intent i=new Intent(getApplicationContext(),Menu.class);
                    startActivity(i);

                }
                catch (InterruptedException e)
                {
                    Toast.makeText(this, "Interrupt error", Toast.LENGTH_SHORT).show();
                }


            }
            else {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            }
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        }
    }


        }

