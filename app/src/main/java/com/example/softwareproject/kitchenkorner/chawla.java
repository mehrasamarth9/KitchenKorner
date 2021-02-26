package com.example.softwareproject.kitchenkorner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class chawla extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chawla);

        ListView mListView = (ListView)findViewById(R.id.chawlaListView);

        mListView.setAdapter(new chawlago(this));

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0)
                {
                    Intent o = new Intent(chawla.this, checkout.class);
                    o.putExtra("name", "Chicken Curry");
                    o.putExtra("price", "8.00 $");
                    startActivity(o);
                }
                if(position==1)
                {
                    Intent o = new Intent(chawla.this, checkout.class);
                    o.putExtra("name", "Chicken Butter Masala");
                    o.putExtra("price", "9.00 $");
                    startActivity(o);
                }
                if(position==2)
                {
                    Intent o = new Intent(chawla.this, checkout.class);
                    o.putExtra("name",  "Chilly Chicken");
                    o.putExtra("price", "15.00 $");
                    startActivity(o);
                }
                if(position==3)
                {
                    Intent o = new Intent(chawla.this, checkout.class);
                    o.putExtra("name", "Meat Masala");
                    o.putExtra("price", "15.00 $");
                    startActivity(o);
                }
                if(position==4)
                {
                    Intent o = new Intent(chawla.this, checkout.class);
                    o.putExtra("name", "Kadhai Chicken");
                    o.putExtra("price", "17.00 $");
                    startActivity(o);
                }
            }
        });


    }
}