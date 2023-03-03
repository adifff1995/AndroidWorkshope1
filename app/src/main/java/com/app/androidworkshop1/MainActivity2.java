package com.app.androidworkshop1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {
    int price = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FloatingActionButton fb_add = findViewById(R.id.fb_add);
        FloatingActionButton fb_minus = findViewById(R.id.fb_minus);
        TextView tv_amount = findViewById(R.id.tv_amount);
        TextView tv_total = findViewById(R.id.tv_total);

        tv_total.setText(price+"");
        fb_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int amount  = Integer.parseInt(tv_amount.getText().toString());
               int newAmount  = amount+1;
               tv_amount.setText(newAmount+"");
               int total_price = price*newAmount;
               tv_total.setText(total_price+"");

            }
        });

    }
}