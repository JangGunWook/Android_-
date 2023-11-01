package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    // 1. xml 파일을 활용한 event 연결
    ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    // 나만의 event메소드 생성! -> 매개변수 중요!
    // 어떤변수 -> 어떤 뷰에 해당하는 이벤트를 연결할 것인지!
    public  void MyEvent(View view){
        // 이벤트가 감지되었을때 어떠한 처리르 ㄹ수행할 것인지
        // 해당하는 로직을 가지고 있어야 한다!

        // 레이아웃의 배경색 변경
        binding.layout.setBackgroundColor(Color.GRAY);
    }
}