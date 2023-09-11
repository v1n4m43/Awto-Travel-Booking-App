package com.example.awto;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button customerButton;
    Button driverButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customerButton = findViewById(R.id.btnCustomer);
        customerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertActIntent = new Intent(MainActivity.this, CustomerActivity.class);
                MainActivity.this.startActivity(insertActIntent);
            }
        });

        driverButton = findViewById(R.id.btnDriver);
        driverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertActIntent = new Intent(MainActivity.this, DriverApplicationForm.class);
                MainActivity.this.startActivity(insertActIntent);
            }
        });
    }
}