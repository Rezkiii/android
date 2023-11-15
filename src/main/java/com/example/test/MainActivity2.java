package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void navigateToMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this, view, "layout_transition").toBundle());
    }

    public void navigateToMainActivity3(View view){
        Intent intent1 = new Intent(this, MainActivity3.class);
        startActivity(intent1, ActivityOptions.makeSceneTransitionAnimation(this, view, "layout_transition").toBundle());
    }

    public void navigateToMainActivity4(View view){
        Intent intent2 = new Intent(this, MainActivity4.class);
        startActivity(intent2, ActivityOptions.makeSceneTransitionAnimation(this, view, "layout_transition").toBundle());
    }

}