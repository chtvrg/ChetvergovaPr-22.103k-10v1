package com.example.chetvergovapr_22103k_10v1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Steps  extends AppCompatActivity implements View.OnClickListener{
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, map.class));
    }
}