package com.example.infobook;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.example.infobook.adapter.TabPagerAdapter;
import com.example.infobook.fragment.WonderFragment;

public class WondersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);

        TabPagerAdapter adapter = new TabPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(WonderFragment.newInstance("Great Wall info", R.drawable.great_wall), "Great Wall");
        adapter.addFragment(WonderFragment.newInstance("Petra info", R.drawable.petra), "Petra");
        adapter.addFragment(WonderFragment.newInstance("Machu Picchu info", R.drawable.machu_picchu), "Machu Picchu");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
