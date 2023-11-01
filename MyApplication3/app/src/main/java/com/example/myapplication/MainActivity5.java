package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMain5Binding;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener{

    ActivityMain5Binding binding;
    // 모든 이미지를 관리할 수 있는 배열 생성
    // 안드로이드는 res 들어가는 모든 정보를 정수형으로 관리한다!
    int[] arr = {
            R.drawable.before,
            R.drawable.after,
            R.drawable.after2
    };

    // 인덱스의 번호를 기억할 수 있는 변수
   int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 버튼이 눌리면 이미지가 변경되도록 만들기
        // 이미지1, 이미지2, 이미지3
        binding.btnNext.setOnClickListener(this);
        binding.btnPre.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==binding.btnNext.getId()){  //다음버튼
            if(index==2){
                index=0;
            }else{
                index++;
            }
            binding.img.setImageResource(arr[index]);

        }else{  //이전버튼
            if(index==0){
                index=2;
            }else{
                index--;
            }
            binding.img.setImageResource(arr[index]);
        }

    }
}