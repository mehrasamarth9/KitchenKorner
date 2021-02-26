package com.example.softwareproject.kitchenkorner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

    public class chawlago extends BaseAdapter {

        String item[] = {"Chicken Curry", "Chicken Butter Masala", "Chilly Chicken", "Meat Masala", "Kadhai Chicken"};
        String price[] = {"8.00 $", "9.00 $", "15.00 $", "15.00 $", "17.00 $"};
        Context c;

        chawlago(Context c) {
            this.c = c;

        }

        @Override
        public int getCount() {
            return item.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            LayoutInflater li = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = li.inflate(R.layout.veg_listview, null);
            TextView name = (TextView) convertView.findViewById(R.id.textname);
            TextView iprice = (TextView) convertView.findViewById(R.id.textPrice);
            name.setText(item[position]);
            iprice.setText(price[position]);
            return convertView;
        }
    }
