package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMain2Binding;
import com.example.myapplication.databinding.ActivityMain3Binding;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    // 2. 리스너 인터페이스를 class에 구현하는 방식
    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 사용하고자 하는 버튼에 이벤트 리스너 연결하기
        // this -> onClick
        binding.btnR.setOnClickListener(this);
        binding.btnG.setOnClickListener(this);
        binding.btnB.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        //매개변수로 전달받은 view가 어떤 버튼인지 판단하기!
        if(view.getId() == binding.btnR.getId()){

            binding.layout2.setBackgroundColor(Color.RED);
        } else if (view.getId() == binding.btnB.getId()) {
            binding.layout2.setBackgroundColor(Color.BLUE);

        }else{
            binding.layout2.setBackgroundColor(Color.GREEN);
        }
    }
}