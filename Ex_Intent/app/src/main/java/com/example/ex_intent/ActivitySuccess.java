package com.example.ex_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ex_intent.databinding.ActivitySuccessBinding;

public class ActivitySuccess extends AppCompatActivity {

    ActivitySuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String id = getIntent().getStringExtra("id");
        String pw = getIntent().getStringExtra("pw");
        System.out.println(id);
        System.out.println(pw);

        if (id.equals("test") && pw.equals("1234")) {

            binding.id.setText(id);
            binding.pw.setText(pw);
            binding.hello.setText(id + "님 환영합니다");
        } else {
            binding.hello.setText("계정을 찾지 못했습니다.");
        }
    }
}