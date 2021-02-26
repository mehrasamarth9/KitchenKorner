package com.example.softwareproject.kitchenkorner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class veggo extends BaseAdapter {

    String  item[]={"Paneer Butter Masala","Mushroom Butter Masala","Malai Kofta","Dal Makhni","Kadhai Paneer"};
    String price[]={"7.00 $","7.00 $","13.00 $","13.00 $","13.00 $"};
    Context c;
    veggo(Context c)
    {
        this.c=c;

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
        LayoutInflater li=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=li.inflate(R.layout.veg_listview,null);
        TextView name=(TextView)convertView.findViewById(R.id.textname);
        TextView iprice=(TextView)convertView.findViewById(R.id.textPrice);
        name.setText(item[position]);
        iprice.setText(price[position]);
        return convertView;
    }
}
