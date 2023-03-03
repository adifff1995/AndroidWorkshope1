package com.app.androidworkshop1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fb_add = findViewById(R.id.fb_add);
        FloatingActionButton fb_mult = findViewById(R.id.fb_multiply);
        FloatingActionButton fb_minus = findViewById(R.id.fb_minus);
        FloatingActionButton fb_clear = findViewById(R.id.fb_clear);
        TextView tv_result = findViewById(R.id.tv_total);
        EditText ed_num1 = findViewById(R.id.ed_num1);
        EditText ed_num2 = findViewById(R.id.ed_num2);

        fb_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = ed_num1.getText().toString();
                String s2 = ed_num2.getText().toString();
               if (s1.isEmpty()){
                   ed_num1.setError("Fill Feilds");
                   Toast.makeText(MainActivity.this, "plese enter first number", Toast.LENGTH_SHORT).show();
               }else  if ( s2.isEmpty()){
                   ed_num2.setError("Fill Feilds");
                   Toast.makeText(MainActivity.this, "please enter second number", Toast.LENGTH_SHORT).show();
               }

               else{
                   int num1 = Integer.parseInt(ed_num1.getText().toString());
                   int num2 = Integer.parseInt(ed_num2.getText().toString());
                   int sum = num1 + num2;
                   tv_result.setText(sum + "");
               }


            }
        });

        fb_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = ed_num1.getText().toString();
                String s2 = ed_num2.getText().toString();
                if (s1.isEmpty()){
                    ed_num1.setError("Fill Feilds");
                    Toast.makeText(MainActivity.this, "plese enter first number", Toast.LENGTH_SHORT).show();
                }else  if ( s2.isEmpty()){
                    ed_num2.setError("Fill Feilds");
                    Toast.makeText(MainActivity.this, "please enter second number", Toast.LENGTH_SHORT).show();
                }

                else{
                    int num1 = Integer.parseInt(ed_num1.getText().toString());
                    int num2 = Integer.parseInt(ed_num2.getText().toString());
                    int sum = num1 - num2;
                    tv_result.setText(sum + "");
                };
            }
        });

        fb_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = ed_num1.getText().toString();
                String s2 = ed_num2.getText().toString();
                if (s1.isEmpty()){
                    ed_num1.setError("Fill Feilds");
                    Toast.makeText(MainActivity.this, "plese enter first number", Toast.LENGTH_SHORT).show();
                }else  if ( s2.isEmpty()){
                    ed_num2.setError("Fill Feilds");
                    Toast.makeText(MainActivity.this, "please enter second number", Toast.LENGTH_SHORT).show();
                }

                else{
                    int num1 = Integer.parseInt(ed_num1.getText().toString());
                    int num2 = Integer.parseInt(ed_num2.getText().toString());
                    int sum = num1 * num2;
                    tv_result.setText(sum + "");
                }
            }
        });


        fb_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ed_num1.setText("");
               ed_num2.setText("");
               tv_result.setText("");
            }
        });

    }
}