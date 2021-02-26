package com.example.softwareproject.kitchenkorner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class checkout extends AppCompatActivity {
TextView dish, itemprice;
EditText name,number,cvv;
Button payment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Intent i=getIntent();
        String item = i.getStringExtra("name");
        String price = i.getStringExtra("price");
        dish = (TextView) findViewById(R.id.itemname);
        name = (EditText) findViewById(R.id.cardname);
        number = (EditText) findViewById(R.id.cardnumber);
        cvv = (EditText) findViewById(R.id.cardcvv);
        itemprice = (TextView) findViewById(R.id.price);
        payment = (Button) findViewById(R.id.checkout);
        dish.setText(item);
        itemprice.setText(price);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = number.getText().toString();
                String nam = name.getText().toString();
                String cv = cvv.getText().toString();
                if (TextUtils.isEmpty(num))
                {
                    Toast.makeText(checkout.this, "Please Enter Card Number", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(nam))
                {
                    Toast.makeText(checkout.this, "Please Enter Card Name", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(cv))
                {
                    Toast.makeText(checkout.this, "Please Enter Cvv", Toast.LENGTH_SHORT).show();
                }
                else
                {
                   Intent i = new Intent(checkout.this, success.class) ;
                   startActivity(i);
                }


            }
        });
    }
}