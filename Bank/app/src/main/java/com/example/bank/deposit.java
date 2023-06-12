package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class deposit extends AppCompatActivity {
    Button b;
    EditText amt;
    EditText pin;
    private Integer bal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);
        SharedPreferences pref=getSharedPreferences("log",MODE_PRIVATE);
        bal=pref.getInt("bal",0);
        b=findViewById(R.id.button5);
        amt=findViewById(R.id.eAmt);
        pin=findViewById(R.id.ePin);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {Integer a=Integer.parseInt(amt.getText().toString());
                    Integer p=Integer.parseInt(pin.getText().toString());
                    if(a>0&&p==1234)
                    {
                        SharedPreferences pref=getSharedPreferences("log",MODE_PRIVATE);
                        SharedPreferences.Editor editor=pref.edit();
                        editor.putInt("bal",bal+a);
                        editor.apply();
                        try {
                            Toast.makeText(deposit.this, "Succesfully deposited", Toast.LENGTH_SHORT).show();
                            Thread.sleep(1000);
                            Intent i=new Intent(getApplicationContext(),menu.class);
                            startActivity(i);

                        }
                        catch (InterruptedException e)
                        {
                            Toast.makeText(deposit.this, "Interupt", Toast.LENGTH_SHORT).show();
                        }


                    }
                    else {
                        Toast.makeText(deposit.this, "Invalid input", Toast.LENGTH_SHORT).show();
                    }
                }

                catch (NumberFormatException e)
                {
                    Toast.makeText(deposit.this, "Interupt", Toast.LENGTH_SHORT).show();
                }

                }

        });

    }
}