package com.example.qthjen.customlistviewimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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

    /** sử dụng view holder để tối tư tránh việc ánh xạ nhiều lần (có thể không cần dùng nếu ít dữ liệu)**/
    private class ViewHolder {
        ImageView iv;
        TextView tv1;
        TextView tv2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        if ( convertView == null ) {

            LayoutInflater layoutInflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(myLayout, null);
            /** Ánh xạ **/
            viewHolder.tv1 = (TextView) convertView.findViewById(R.id.tv1);
            viewHolder.tv2 = (TextView) convertView.findViewById(R.id.tv2);
            viewHolder.iv = (ImageView) convertView.findViewById(R.id.iv);
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        /** gán giá trị **/
        viewHolder.tv1.setText(arrayMonAn.get(position).mName);
        viewHolder.tv2.setText(String.valueOf(arrayMonAn.get(position).mPrice));
        viewHolder.iv.setImageResource(arrayMonAn.get(position).mImage);

        return convertView;
    }
}
