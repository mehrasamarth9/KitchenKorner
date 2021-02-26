package com.example.softwareproject.kitchenkorner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class success extends AppCompatActivity {
Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        bt1 = (Button) findViewById(R.id.checkout);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(success.this, MenuActivity.class);
                startActivity(i);
            }
        });
    }
}