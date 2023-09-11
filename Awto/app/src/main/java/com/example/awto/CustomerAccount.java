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

import com.google.android.material.navigation.NavigationView;

public class CustomerAccount extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_account);



        setUpToolbar();
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        Intent intent = new Intent(CustomerAccount.this, LandingPage.class);
                        startActivity(intent);
                        break;

                    case R.id.nav_acc:
                        Intent intent1 = new Intent(CustomerAccount.this, CustomerAccount.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_info:
                        Intent intent2 = new Intent(CustomerAccount.this, AboutUs.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_browse:
                        Intent intent3 = new Intent(CustomerAccount.this, BrowseCustomerActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_book:
                        Intent intent4 = new Intent(CustomerAccount.this, BookATrip.class);
                        startActivity(intent4);
                        break;
                    case R.id.nav_searchBookings:
                        Intent intent5 = new Intent(CustomerAccount.this, SearchBookings.class);
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


