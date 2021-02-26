package com.example.softwareproject.kitchenkorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class OrderHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);
        Toast.makeText(this, "Please wait for new update", Toast.LENGTH_SHORT).show();
    }
}
