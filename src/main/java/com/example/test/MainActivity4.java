package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    // Get the username from SharedPreferences
   // SharedPreferences sharedPreferences = getSharedPreferences("MySharedPreferences", MODE_PRIVATE);
    //String username = sharedPreferences.getString("username", "");

    // Set the text of the TextView to the username
    //TextView userTv = findViewById(R.id.userTv);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //sharedPreferences = getSharedPreferences("MySharedPreferences", MODE_PRIVATE);
       // username = sharedPreferences.getString("username", "");

       // userTv = findViewById(R.id.userTv);
        // Set the text of the TextView to the username
       // userTv.setText(username);
    }
    public void navigateToMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this, view, "layout_transition").toBundle());
    }

    public void navigateToMainActivity5(View view){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this, view, "layout_transition").toBundle());
    }
}