package com.app.androidworkshop1;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.app.androidworkshop1.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {

    ActivityProfileBinding binding;
    String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ActivityResultLauncher<Intent> resultLauncher =
                registerForActivityResult(new
                                ActivityResultContracts.StartActivityForResult(),
                        new ActivityResultCallback<ActivityResult>() {
                            @Override
                            public void onActivityResult(ActivityResult result) {
                                Intent intent = result.getData();
                                if (result.getResultCode() == 100) {
                                    str += "Student : " + intent.getStringExtra("data") + "\n";
                                    binding.tvTitle.setText(str);
                                } else {
                                    str += "Teacher : " + intent.getStringExtra("data") + "\n";
                                    binding.tvTitle.setText(str);

                                }

                            }
                        });
        binding.btnAddNewStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(ProfileActivity.this, SecondActivity.class);
//                intent.putExtra("type", 1);
//                resultLauncher.launch(intent);
                showPopUp(view);
            }
        });

        binding.btnAddNewTeachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, SecondActivity.class);
                intent.putExtra("type", 2);
                resultLauncher.launch(intent);
            }
        });


    }

    private void showPopUp(View v){
        PopupMenu popupMenu = new PopupMenu(ProfileActivity.this,v);
        MenuInflater menuInflater = popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menu_add_std:
                        Toast.makeText(ProfileActivity.this, "Student", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_add_teach:
                        Toast.makeText(ProfileActivity.this, "Teacher", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
        popupMenu.show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_add_std:
                Toast.makeText(this, "Student", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_add_teach:
                Toast.makeText(this, "Teacher", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}