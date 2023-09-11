package com.example.awto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerActivity extends AppCompatActivity {

    Button signIn1Button;
    Button signUp1Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        signUp1Button = findViewById(R.id.btnSignUp1);
        signUp1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertActIntent = new Intent(CustomerActivity.this, SignUpCustomerActivity.class);
                CustomerActivity.this.startActivity(insertActIntent);
            }
        });


        signIn1Button = findViewById(R.id.btnSignIn1);
        signIn1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertActIntent = new Intent(CustomerActivity.this, LandingPage.class);
                CustomerActivity.this.startActivity(insertActIntent);
            }
        });
    }
}