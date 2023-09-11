package com.example.awto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class BrowseDriver extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    Button destinationButton;
    Button driver1Button;
    Button driver2Button;
    Button driver3Button;
    Button driver4Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_driver);

        driver1Button = findViewById(R.id.steveBtn);
        driver1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertActIntent =new Intent(BrowseDriver.this, Driver1.class);
                BrowseDriver.this.startActivity(insertActIntent);
            }
        });

        driver2Button = findViewById(R.id.justinBtn);
        driver2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertActIntent =new Intent(BrowseDriver.this, Driver2.class);
                BrowseDriver.this.startActivity(insertActIntent);
            }
        });

        driver3Button = findViewById(R.id.luciferBtn);
        driver3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertActIntent =new Intent(BrowseDriver.this, Driver3.class);
                BrowseDriver.this.startActivity(insertActIntent);
            }
        });

        driver4Button = findViewById(R.id.louisBtn);
        driver4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertActIntent =new Intent(BrowseDriver.this, Driver4.class);
                BrowseDriver.this.startActivity(insertActIntent);
            }
        });

        destinationButton = findViewById(R.id.btn_destination);
        destinationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertActIntent = new Intent(BrowseDriver.this, Destination.class);
                BrowseDriver.this.startActivity(insertActIntent);
            }
        });



        setUpToolbar();
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        Intent intent = new Intent(BrowseDriver.this, LandingPage.class);
                        startActivity(intent);
                        break;

                    case R.id.nav_acc:
                        Intent intent1 = new Intent(BrowseDriver.this, CustomerAccount.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_info:
                        Intent intent2 = new Intent(BrowseDriver.this, AboutUs.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_browse:
                        Intent intent3 = new Intent(BrowseDriver.this, BrowseActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.nav_book:
                        Intent intent4 = new Intent(BrowseDriver.this, BookATrip.class);
                        startActivity(intent4);
                        break;
                    case R.id.nav_searchBookings:
                        Intent intent5 = new Intent(BrowseDriver.this, SearchBookings.class);
                        startActivity(intent5);
                        break;
                }
                return false;
            }
        });
    }

    public void setUpToolbar() {
        drawerLayout = findViewById(R.id.drawerLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);


    }
}
