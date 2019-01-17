package com.example.consultants.serviceimplementation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button startBtn, stopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn=findViewById(R.id.startBtn);
        stopBtn=findViewById(R.id.stopBtn);

        startBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v==startBtn){
            startService(new Intent(this, MyService.class));


        }
        else if(v==stopBtn){
            stopService(new Intent(this,MyService.class));


        }

    }
}
