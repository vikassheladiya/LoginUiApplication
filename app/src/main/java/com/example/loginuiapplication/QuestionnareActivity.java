package com.example.loginuiapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuestionnareActivity extends AppCompatActivity {
    AppCompatButton nextbtn,skipbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnare);
        Init();
    }

    private void Init() {
        skipbtn=findViewById(R.id.skipbtn);
        nextbtn=findViewById(R.id.nextbtn);

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(QuestionnareActivity.this,CounsellingActivity.class);
                startActivity(i);
            }
        });
        skipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(QuestionnareActivity.this,CounsellingActivity.class);
                startActivity(in);
            }
        });
    }
}