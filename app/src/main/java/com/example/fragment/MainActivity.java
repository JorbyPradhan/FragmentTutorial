package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    FrameLayout layout;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.content_body);
        fragment = new HomeFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction =manager.beginTransaction();
        transaction.replace(R.id.content_body,fragment).addToBackStack("Home").commit();


    }
}
