package com.example.qthjen.customlistviewimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView lv;
    public ArrayList<MonAn> mangMonAn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        mangMonAn = new ArrayList<MonAn>();

        mangMonAn.add(new MonAn("Vợ yêu 1: ", 0, R.drawable.im5));
        mangMonAn.add(new MonAn("Vợ yêu 2: ", 1, R.drawable.im1));
        mangMonAn.add(new MonAn("Vợ yêu 3: ", 2, R.drawable.im2));
        mangMonAn.add(new MonAn("Vợ yêu 4: ", 3, R.drawable.im3));
        mangMonAn.add(new MonAn("Vợ yêu 5: ", 4, R.drawable.im4));

        CustomMonAn customMonAn = new CustomMonAn(
                MainActivity.this,
                R.layout.list_monan,
                mangMonAn);

        lv.setAdapter(customMonAn);


    }
}
