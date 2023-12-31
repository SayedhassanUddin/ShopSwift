package com.example.ShopSwift.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ShopSwift.R;

public class SignIn extends AppCompatActivity {
    EditText userNme , userPassword , useEmail , userPhone;
    Button SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        userNme = findViewById(R.id.usename);
        userPassword = findViewById(R.id.usepass);
        useEmail = findViewById(R.id.useEmail);
        userPhone = findViewById(R.id.usePhone);

        SignUp = findViewById(R.id.button2);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = userNme.getText().toString();
                String pass = userPassword.getText().toString();
                String email = useEmail.getText().toString();
                String phone = userPhone.getText().toString();

                if (name.isEmpty() || pass.isEmpty()||email.isEmpty()||phone.isEmpty()){
                    Toast.makeText(SignIn.this, "Enter Valid Input"+":)", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(SignIn.this, "Signed Up Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignIn.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}