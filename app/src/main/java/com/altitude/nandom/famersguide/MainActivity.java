package com.altitude.nandom.famersguide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.altitude.nandom.famersguide.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        PrefManager prefManager = new PrefManager(getApplicationContext());
//
//        // make first time launch TRUE
//        prefManager.setFirstTimeLaunch(true);
//
//        startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
//        finish();

    }
}
