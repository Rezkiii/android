package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.test.MainActivity;

public class MainActivity5 extends AppCompatActivity {

    //deklarasi variabel penghubung
    EditText etUsername,etPassword;
    Button btnlogin;
    TextView tvHasilInput;

    //deklarasi variable penampung input
    String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //menghubungkan java dengan tampilan
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnlogin = findViewById(R.id.btnLogin);
        tvHasilInput= findViewById(R.id.tvHasilInput);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = etUsername.getText().toString();
                password = etPassword.getText().toString();

                Intent dashboard;
                dashboard = new Intent(MainActivity5.this, MainActivity.class);
                dashboard.putExtra("uname",username);
                dashboard.putExtra("pass",password);
                startActivity(dashboard);

                // Save the username to SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPreferences", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username", username);
                editor.commit();

                //tvHasilInput.setText("username: "+username+"password: "+password);
                //Toast.makeText(MainActivity.this,  "username: "+username+"password: "+password, Toast.LENGTH_SHORT).show();
            }
        });

        TextView redirectSignup = findViewById(R.id.redirectSignup);
        redirectSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}