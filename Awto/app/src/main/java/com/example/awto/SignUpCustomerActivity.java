package com.example.awto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpCustomerActivity extends AppCompatActivity {

    Button signIn2Button;
    Button signUp2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_customer);

        signUp2Button = findViewById(R.id.btnSignUp2);
        signUp2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertActIntent = new Intent(SignUpCustomerActivity.this, LandingPage.class);
                SignUpCustomerActivity.this.startActivity(insertActIntent);
            }
        });


        signIn2Button = findViewById(R.id.btnSignIn2);
        signIn2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertActIntent = new Intent(SignUpCustomerActivity.this, CustomerActivity.class);
                SignUpCustomerActivity.this.startActivity(insertActIntent);
            }
        });



    }
}