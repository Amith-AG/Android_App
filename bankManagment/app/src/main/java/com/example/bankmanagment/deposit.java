package com.example.bankmanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class deposit extends AppCompatActivity {
    EditText eam;
    EditText ep ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);
        eam= findViewById(R.id.eam);
        ep= findViewById(R.id.ep);
    }

    public void bacBtn(View view) {
        if(eam.getText().toString().equals("null")&&ep.getText().toString().equals("null"))
        {
            Integer a=0;
            Integer p=0;
        }
        else
        {
            try {
                Integer a=Integer.parseInt(eam.getText().toString());
                Integer p=Integer.parseInt(ep.getText().toString());
                if(a>0&&p==1234)
                {
                    MainActivity.bal=MainActivity.bal+a;
                    try {
                        Toast.makeText(this, "Successfully deposited", Toast.LENGTH_SHORT).show();
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
}