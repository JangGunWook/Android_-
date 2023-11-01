package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import com.example.myapplication.databinding.ActivityMain4Binding;

public class MainActivity4 extends AppCompatActivity {

    ActivityMain4Binding binding;


    // 3. 익명 클래스를 사용하는 이벤트 연결
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 1. 버튼이 눌리는 것을 감지
        binding.btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 2. 입력되는 창에 입력된 내용을 가지고 오기
                String msg = String.valueOf(binding.edtMsg.getText());

                // 3. 가지고온 텍스트 값을 TextView에 뛰우기
                binding.tvTitle.setText(msg);

                // 4. 수정된 내용을 사용한 이후 tvTitle 초기화 하기
                binding.edtMsg.setText("");
            }
        });

        // 키보드의 이벤트 연결하기 -> enter 눌렸을때 이벤트 진행
        binding.edtMsg.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(keyCode == keyEvent.KEYCODE_ENTER){
                    // 엔터키가 눌림을 감지 할 수 있는 코드

                    // 2. 입력되는 창에 입력된 내용을 가지고 오기
                    String msg = String.valueOf(binding.edtMsg.getText());

                    // 3. 가지고온 텍스트 값을 TextView에 뛰우기
                    binding.tvTitle.setText(msg);

                    // 4. 수정된 내용을 사용한 이후 tvTitle 초기화 하기
                    binding.edtMsg.setText("");
                }
                // 리스너에 대한 이벤트를 다음 리스너에게 전달할 것인지 여부 결정하는 키워드!
                // true : 다음 리스너에 이벤트 전달 X
                // false : 다음 리스너에 이벤트 전달 O
                return false;
            }
        });

    }
}