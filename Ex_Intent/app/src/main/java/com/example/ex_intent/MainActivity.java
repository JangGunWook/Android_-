package com.example.ex_intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import com.example.ex_intent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 1. btnWeb 버튼 사용하기
        binding.btnWeb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                // 화면을 움직이기 위한 액션을 주기 위해서는 Intent를 사용해야한다!
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"));

                // intent가 실행될 수 있는 명령!
                startActivity(intent);
            }
        });

        binding.btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });

        binding.btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dial 화면 띄우기
                //Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-1234"));
                //startActivity(intent);

                // cal 화면 띄우기
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:010-1234-1234"));

                // 전화 기능에 대한 권한을 승인을 받아야 사용할 수 있다!
                if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED){
                    // 해당하는 기능에 대한 권한을 요청한다!
                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[]{Manifest.permission.CALL_PHONE}, 0);
                }
                startActivity(intent);




            }
        });



    }
}