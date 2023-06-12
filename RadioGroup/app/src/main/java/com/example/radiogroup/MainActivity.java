package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    ImageView i;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=findViewById(R.id.rg);
        i=findViewById(R.id.i);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id)
                {
                    case R.id.r1:
                        i.setImageResource(R.drawable.acer_1);
                        break;
                    case R.id.r2:
                        i.setImageResource(R.drawable.acer_2);
                        break;
                    case R.id.r3:
                        i.setImageResource(R.drawable.planet9);

                }
            }
        });
    }
}