package com.example.softwareproject.kitchenkorner;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;

    private HomeFragment homeFragment;
    private SearchFragment searchFragment;
    private OrderFragment orderFragment;
    private AccountFragment accountFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        homeFragment = new HomeFragment();
        searchFragment = new SearchFragment();
        orderFragment = new OrderFragment();
        accountFragment = new AccountFragment();

        setFragment(homeFragment);

        frameLayout = (FrameLayout) findViewById(R.id.flContainer);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch(item.getItemId()){
                    case R.id.navigation_home:
                        setFragment(homeFragment);
                        return true;
                    case R.id.navigation_search:
                        setFragment(searchFragment);
                        return true;
                    case R.id.navigation_order:
                        Toast.makeText(MenuActivity.this, "Please Wait for Next Update", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.navigation_account:
                        setFragment(accountFragment);
                        return true;
                    default:
                        return true;
                }
            }
        });
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.flContainer, fragment);
        fragmentTransaction.commit();
    }
}
