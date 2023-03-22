package com.app.androidworkshop1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button btn_sign_up = findViewById(R.id.btn_sign_up);
        EditText ed_name = findViewById(R.id.ed_name);
        EditText ed_email = findViewById(R.id.ed_email);
        EditText ed_phone = findViewById(R.id.ed_phone);
        EditText ed_city = findViewById(R.id.ed_city);
        EditText ed_state = findViewById(R.id.ed_state);
        EditText ed_street = findViewById(R.id.ed_street);
        CheckBox cb_address = findViewById(R.id.cb_remember);
        RadioGroup radioGroup = findViewById(R.id.rg);
        LinearLayout linear = findViewById(R.id.linear_address);





    }
}