package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class withdraw extends AppCompatActivity {
    EditText amt;
    EditText pin;
    Button b;
    private Integer bal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);
        amt=findViewById(R.id.amt);
        pin=findViewById(R.id.pin);
        b=findViewById(R.id.button7);
        SharedPreferences pref=getSharedPreferences("log",MODE_PRIVATE);
        bal=pref.getInt("bal",0);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Integer a=Integer.parseInt(amt.getText().toString());
                    Integer p=Integer.parseInt(pin.getText().toString());
                    if(a<=bal&&p==1234&&a>0)
                    {
                        SharedPreferences pref=getSharedPreferences("log",MODE_PRIVATE);
                        SharedPreferences.Editor editor=pref.edit();
                        editor.putInt("bal",bal-a);
                        editor.apply();
                        try {
                            Toast.makeText(withdraw.this, "Successfully Withdraw", Toast.LENGTH_SHORT).show();
                            Thread.sleep(1000);
                            Intent i=new Intent(getApplicationContext(),menu.class);
                            startActivity(i);

                        }
                        catch (InterruptedException e)
                        {
                            Toast.makeText(withdraw.this, "Interrupt error", Toast.LENGTH_SHORT).show();
                        }


                    }
                    else {
                        Toast.makeText(withdraw.this, "Invalid input", Toast.LENGTH_SHORT).show();
                    }
                }
                catch (NumberFormatException e)
                {
                    Toast.makeText(withdraw.this, "Invalid input", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}