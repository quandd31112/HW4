package com.example.infobook;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.example.infobook.adapter.TabPagerAdapter;
import com.example.infobook.fragment.MuseumFragment;

public class MuseumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);

        TabPagerAdapter adapter = new TabPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(MuseumFragment.newInstance("Louvre info", R.drawable.louvre), "Louvre");
        adapter.addFragment(MuseumFragment.newInstance("British Museum info", R.drawable.british_museum), "British Museum");
        adapter.addFragment(MuseumFragment.newInstance("Met Museum info", R.drawable.met), "Met");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
