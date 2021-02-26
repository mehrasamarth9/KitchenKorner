package com.example.softwareproject.kitchenkorner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class veg extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);


        ListView mListView = (ListView)findViewById(R.id.vegListView);

        mListView.setAdapter(new veggo(this));

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0)
                {
                    Intent o = new Intent(veg.this, checkout.class);
                    o.putExtra("name", "Paneer Butter Masala");
                    o.putExtra("price", "7.00 $");
                    startActivity(o);
                }
                if(position==1)
                {
                    Intent o = new Intent(veg.this, checkout.class);
                    o.putExtra("name", "Mushroom Butter Masala");
                    o.putExtra("price", "7.00 $");
                    startActivity(o);
                }
                if(position==2)
                {
                    Intent o = new Intent(veg.this, checkout.class);
                    o.putExtra("name", "Malai Kofta");
                    o.putExtra("price", "13.00 $");
                    startActivity(o);
                }
                if(position==3)
                {
                    Intent o = new Intent(veg.this, checkout.class);
                    o.putExtra("name", "Dal Makhni");
                    o.putExtra("price", "13.00 $");
                    startActivity(o);
                }
                if(position==4)
                {
                    Intent o = new Intent(veg.this, checkout.class);
                    o.putExtra("name", "Kadhai Paneer");
                    o.putExtra("price", "13.00 $");
                    startActivity(o);
                }
            }
        });


    }
}
