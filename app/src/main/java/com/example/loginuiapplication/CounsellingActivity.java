package com.example.loginuiapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.concurrent.ConcurrentSkipListMap;

public class CounsellingActivity extends AppCompatActivity {
    AppCompatButton nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselling);
        Init();
    }

    private void Init() {
        nextbtn=findViewById(R.id.nextbtn);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CounsellingActivity.this,SignupActivity.class);
                startActivity(i);
            }
        });

    }

}