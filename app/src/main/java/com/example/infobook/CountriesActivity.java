package com.example.infobook;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.example.infobook.adapter.TabPagerAdapter;
import com.example.infobook.fragment.CountryFragment;

public class CountriesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);

        TabPagerAdapter adapter = new TabPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(CountryFragment.newInstance("United Kingdom info", R.drawable.flag_uk), "UK");
        adapter.addFragment(CountryFragment.newInstance("Italy info", R.drawable.flag_italy), "Italy");
        adapter.addFragment(CountryFragment.newInstance("France info", R.drawable.flag_france), "France");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
