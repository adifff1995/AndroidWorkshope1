package com.app.androidworkshop1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.app.androidworkshop1.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        int type = intent.getIntExtra("type", -1);
        if (type == 1) {
            binding.editTextTextPersonName.setHint("Enter student name");
            binding.editTextTextPersonName2.setHint("Enter student id");
        } else {
            binding.editTextTextPersonName.setHint("Enter Teacher name");
            binding.editTextTextPersonName2.setHint("Enter Teacher id");
        }

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent();
                String name = binding.editTextTextPersonName.getText().toString();
                String id = binding.editTextTextPersonName2.getText().toString();
                intent1.putExtra("data", name + " " + id);
                if (type == 1)
                    setResult(100, intent1);
                else
                    setResult(200, intent1);

                finish();

            }
        });

    }
}