package com.example.ShopSwift.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ShopSwift.R;

public class LogIn extends AppCompatActivity {
    EditText name,password;
    Button Login , Signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        name = findViewById(R.id.editTextText);
        password = findViewById(R.id.editTextTextPassword);
        Login = findViewById(R.id.Login);
        Signin = findViewById(R.id.signin);

        // as the log page is connected to local database I will check if the user empty or and validate
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username= name.getText().toString();
                String userPassword = password.getText().toString();

                if (username.isEmpty()||userPassword.isEmpty()){
                    Toast.makeText(LogIn.this, "Enter valid input", Toast.LENGTH_SHORT).show();
                    Toast.makeText(LogIn.this, "Create account if you don't have", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(LogIn.this, "Logged In Successfuly ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LogIn.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }
            }
        });

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SignIntent = new Intent(LogIn.this,SignIn.class);
                startActivity(SignIntent);
            }
        });

    }
}