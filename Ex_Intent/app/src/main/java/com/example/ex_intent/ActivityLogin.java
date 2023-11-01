package com.example.ex_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ex_intent.databinding.ActivityLoginBinding;

public class ActivityLogin extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        // Login Button
        binding.Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // 입력받은 값
              // ID: test, pw:1234
              String id = String.valueOf(binding.IDInput.getText());
              String pw = String.valueOf(binding.PWInput.getText());


                // 계정 정보 넘기기
                if(id.equals("test") && pw.equals("1234")){
                    //페이지 이동
                    Intent intent = new Intent(getApplicationContext(),ActivitySuccess.class);
                    intent.putExtra("id",id);
                    intent.putExtra("pw",pw);
                    startActivity(intent);

                    finish();

                }else{
                    // 로그인 실패 ->Toast 뛰우기
                    // getApplicationContext() == this 키워드 대체 가능
                    Toast.makeText(getApplicationContext(),"로그인 실패",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}