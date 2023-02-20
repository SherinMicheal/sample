package com.mydearmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class firstpage extends AppCompatActivity {
    Button Customer;
    Button Mechanic;
    Button CallCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        Customer = findViewById(R.id.button);
        Mechanic = findViewById(R.id.button1);
        CallCenter= findViewById(R.id.button2);
        Customer.setOnClickListener(view -> {
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
        });

    }
}