package com.example.infobook;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.example.infobook.adapter.TabPagerAdapter;
import com.example.infobook.fragment.LeaderFragment;

public class LeadersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);

        TabPagerAdapter adapter = new TabPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(LeaderFragment.newInstance("Leader 1 details", R.drawable.leader1), "Leader 1");
        adapter.addFragment(LeaderFragment.newInstance("Leader 2 details", R.drawable.leader2), "Leader 2");
        adapter.addFragment(LeaderFragment.newInstance("Leader 3 details", R.drawable.leader3), "Leader 3");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
