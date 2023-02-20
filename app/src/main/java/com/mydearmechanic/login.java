package com.mydearmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class login extends AppCompatActivity {
    TextView loginhere;
    TextView registrationhere;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginhere=findViewById(R.id.login);
        registrationhere=findViewById(R.id.register);
        loginhere.setOnClickListener(view -> {
            Intent intent=new Intent(this,customerlogin.class);
            startActivity(intent);
        });
        registrationhere.setOnClickListener(view -> {
            Intent intent = new Intent(this, customerregistration.class);
            startActivity(intent);
        });
    }
}