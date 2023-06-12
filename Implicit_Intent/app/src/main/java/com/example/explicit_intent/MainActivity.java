package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText we,pe,le,te,se;
    Intent i,j,k,n,m;
    Button wb,pb,lb,tb,sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wb=findViewById(R.id.wb);
        pb=findViewById(R.id.pb);
        lb=findViewById(R.id.lb);
        tb=findViewById(R.id.tb);
        sb=findViewById(R.id.sb);
        we=findViewById(R.id.we);
        pe=findViewById(R.id.pe);
        le=findViewById(R.id.le);
        te=findViewById(R.id.te);
        se=findViewById(R.id.se);
        wb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url=Uri.parse(we.getText().toString());
                i=new Intent(Intent.ACTION_VIEW, url);
                startActivity(i);

            }

        });
        pb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url=Uri.parse("tel:"+pe.getText().toString());
                j=new Intent(Intent.ACTION_DIAL, url);
                startActivity(j);

            }
        });
        lb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url=Uri.parse("geo:0,0?q="+le.getText().toString());
                k=new Intent(Intent.ACTION_VIEW, url);
                startActivity(k);

            }
        });
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShareCompat.IntentBuilder
                        .from(MainActivity.this)
                        .setType("text/plain")
                        .setText(te.getText().toString())
                        .startChooser();
            }
        });
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url=Uri.fromParts("sms","0020840842",null);
                m=new Intent(Intent.ACTION_VIEW,url);
                m.putExtra("sms_body",se.getText().toString());
                startActivity(m);

            }
        });
    }
}