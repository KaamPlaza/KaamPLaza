package com.gmail.plaza.kaam.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.gmail.plaza.kaam.R;
import com.gmail.plaza.kaam.adapters.AllTabAdapters;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabs;
    private ViewPager containerAll;
    private AllTabAdapters viewPagerAdapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = findViewById(R.id.tabs);
        containerAll = findViewById(R.id.containerAll);
        viewPagerAdapters =new AllTabAdapters(getSupportFragmentManager());
        containerAll.setAdapter(viewPagerAdapters);
        tabs.setupWithViewPager(containerAll);

    }
}