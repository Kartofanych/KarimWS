package com.example.myapplicati;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Search extends Activity {
    Drawable dr1,dr2;
    private TextView t1, t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        dr1 = getDrawable(R.drawable.back_for_search_black);
        dr2 = getDrawable(R.drawable.edit_back);
        t1 = findViewById(R.id.f1);
        t2 = findViewById(R.id.f2);
        t3 = findViewById(R.id.f3);
        t1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                t1.setBackground(dr1);
                t2.setBackground(dr2);
                t3.setBackground(dr2);
                t1.setTextColor(Color.parseColor("#FFFFFF"));
                t2.setTextColor(R.color.black);
                t3.setTextColor(R.color.black);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                t2.setBackground(dr1);
                t1.setBackground(dr2);
                t3.setBackground(dr2);
                t2.setTextColor(Color.parseColor("#FFFFFF"));
                t1.setTextColor(R.color.black);
                t3.setTextColor(R.color.black);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                t3.setBackground(dr1);
                t2.setBackground(dr2);
                t1.setBackground(dr2);
                t3.setTextColor(Color.parseColor("#FFFFFF"));
                t2.setTextColor(R.color.black);
                t1.setTextColor(R.color.black);
            }
        });

    }
}
