package com.example.mvvm_room_region_24.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvvm_room_region_24.R;
import com.example.mvvm_room_region_24.dao.UserEntity;
import com.example.mvvm_room_region_24.viewModel.MainViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainViewModel.getAllUsers().observe(MainActivity.this, new Observer<List<UserEntity>>() {
                    @Override
                    public void onChanged(List<UserEntity> users) {
                        StringBuilder stringBuilder = new StringBuilder();
                        for (UserEntity user : users) {
                            stringBuilder
                                    .append(user.getId())
                                    .append(" ")
                                    .append(user.getName())
                                    .append(" ")
                                    .append(user.getPswrd())
                                    .append("\n");
                        }
                        textView.setText(stringBuilder);
                    }
                });
            }
        });


    }
}