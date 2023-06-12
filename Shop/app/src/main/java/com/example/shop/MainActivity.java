package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    EditText e4;
    TextView e0,e1,e2,e3;
    AutoCompleteTextView autoView;

    HashMap<String,Double>dic_Item;
    private static final DecimalFormat df=new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoView=findViewById(R.id.autoView);
        dic_Item=new HashMap<>();
        dic_Item.put("Ragi 1kg",24.00);
        dic_Item.put("Rice 1kg",20.00);
        dic_Item.put("Radish 1kg",25.00);
        dic_Item.put("water melon 1kg",20.00);
        dic_Item.put("Wheat 1kg",30.00);
        dic_Item.put("Onion 1kg",20.00);
        dic_Item.put("Tomato 1kg",120.00);
        dic_Item.put("Tomato sauce 1 liter",120.00);
        dic_Item.put("Tabaco 1kg",120.00);
        dic_Item.put("Cocaine 1kg",120.00);

        dic_Item.put("Lays 1pac",20.00);
        ArrayAdapter<String>itAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,getkey());
        autoView.setAdapter(itAdapter);
//        TODO:bugs in autocompleteTextview
        autoView.setThreshold(1);
        e4=findViewById(R.id.e4);
        e0=findViewById(R.id.e0);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);

        autoView.addTextChangedListener(fillOther);
        e4.addTextChangedListener(fillOther);

    }
    private TextWatcher fillOther=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            try {

                String auto=autoView.getText().toString();
                double qty=Double.parseDouble(e4.getText().toString());
                double cost=dic_Item.get(auto)*qty;
                double cgst=cost*.09;
                double sgst=cost*.09;
                double total=cost+sgst+cgst;
                if (dic_Item.containsKey(auto) && qty>0)
                {
                    e0.setText(" Cost:"+df.format(cost));
                    e1.setText(" CGST:"+df.format(cgst));

                    e2.setText(" SGST:"+df.format(sgst));
                    e3.setText(" Total:"+df.format(total));

                }
                else if (TextUtils.isEmpty(autoView.getText().toString())||TextUtils.isEmpty(e4.getText().toString())) {
                    e0.setText(" Cost:");
                    e1.setText(" CGST:");
                    e2.setText(" SGST:");
                    e3.setText(" Total:");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid data", Toast.LENGTH_SHORT).show();
                    e0.setText(" Cost:");
                    e1.setText(" CGST:");
                    e2.setText(" SGST:");
                    e3.setText(" Total:");
                }

            }
            catch (NumberFormatException|NullPointerException e)
            {
                if(e instanceof NumberFormatException)
                {
                    if (TextUtils.isEmpty(autoView.getText().toString())||TextUtils.isEmpty(e4.getText().toString())) {
                        e0.setText(" Cost:");
                        e1.setText(" CGST:");
                        e2.setText(" SGST:");
                        e3.setText(" Total:");
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Invalid data", Toast.LENGTH_SHORT).show();
                    }
                }

            }



        }
    };
    public String[] getkey()
    {
        return dic_Item.keySet().toArray(new String[0]);
    }
}