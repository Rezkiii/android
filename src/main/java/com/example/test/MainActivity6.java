package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button btnRegist = findViewById(R.id.btnRegist);
        TextView btnSignup = findViewById(R.id.btnSignup);

        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigasi ke MainActivity
                Intent intent = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigasi ke MainActivity
                Intent intent = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}