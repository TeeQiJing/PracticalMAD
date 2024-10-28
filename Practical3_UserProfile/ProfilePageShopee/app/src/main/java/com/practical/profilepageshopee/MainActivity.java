package com.practical.profilepageshopee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView oriPrice1 = findViewById(R.id.oriPrice1);
        oriPrice1.setPaintFlags(oriPrice1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView oriPrice2 = findViewById(R.id.oriPrice2);
        oriPrice2.setPaintFlags(oriPrice2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView oriPrice3 = findViewById(R.id.oriPrice3);
        oriPrice3.setPaintFlags(oriPrice3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }
}