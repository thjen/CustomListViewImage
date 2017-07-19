package com.example.qthjen.customlistviewimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class CustomMonAn extends BaseAdapter {

    public Context myContext;
    public int myLayout;
    public List<MonAn> arrayMonAn;

    public CustomMonAn(Context context, int layout, List<MonAn> listMonAn) {

        myContext = context;
        myLayout = layout;
        arrayMonAn = listMonAn;

    }

    @Override
    public int getCount() {

        return arrayMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = layoutInflater.inflate(myLayout, null);

        TextView tv1 = (TextView) convertView.findViewById(R.id.tv1);
        tv1.setText(arrayMonAn.get(position).mName);

        TextView tv2 = (TextView) convertView.findViewById(R.id.tv2);
        tv2.setText(String.valueOf(arrayMonAn.get(position).mPrice));

        ImageView iv = (ImageView) convertView.findViewById(R.id.iv);
        iv.setImageResource(arrayMonAn.get(position).mImage);

        return convertView;
    }
}
