package com.practical.location;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void task1(View view) {
        Intent intent = new Intent(this, GetCurrentLocation.class);
        startActivity(intent);
    }

    public void task2(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void task3(View view) {
        Intent intent = new Intent(this, FindNearbyPlaces.class);
        startActivity(intent);
    }
}