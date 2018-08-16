package com.altitude.nandom.famersguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.altitude.nandom.famersguide.fragments.HomeFragment;

public class Dashboard extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    private Fragment selectedFragment;

    private String fragmentStatus;

    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        selectedFragment = HomeFragment.newInstance();
                        fragmentStatus = "home";
                        break;
                    case R.id.navigation_dashboard:
                        selectedFragment = HomeFragment.newInstance();
                        fragmentStatus = "explore";
                        break;
                    case R.id.navigation_notifications:
                        selectedFragment = HomeFragment.newInstance();
                        fragmentStatus = "balance";
                        break;

                }
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, selectedFragment);
                transaction.commit();
                return true;
            }
        });
        //Manually displaying the first fragment - one time only
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, HomeFragment.newInstance());
        transaction.commit();




    }

}
