package com.mochen.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity_caidan extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3;
    FragmentManager manager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caidan);

        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);

        //添加一个Fragment
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.add(R.id.frame1, new HomeFragment());
        transaction.commit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.b1:
                //替换
                transaction = manager.beginTransaction();
                transaction.replace(R.id.frame1, new Caidan2Activity());
                transaction.commit();
                break;
            case R.id.b2:
                transaction = manager.beginTransaction();
                transaction.replace(R.id.frame1, new Caidan2Activity());
                transaction.commit();
                break;
            case R.id.b3:
                transaction = manager.beginTransaction();
                transaction.replace(R.id.frame1, new Caidan2Activity());
                transaction.commit();
                break;
        }
    }
}

