package com.example.shivani.dynamicfragments;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FragmentAdder extends AppCompatActivity {
    Button androidBtn, iphoneBtn, blackbBtn;

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private String[] titles = {"iPhone", "Android", "BlackBerry", "Nokia", "Samsung"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_adder);


    }

}
