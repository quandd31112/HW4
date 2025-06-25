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
        adapter.addFragment(CountryFragment.newInstance("United Kingdom infoAndroid Studio is the official IDE for Android development, and includes everything you need to build Android apps.\n" +
                "\n" +
                "This page lists new features and improvements in the latest version in the stable channel, Android Studio Narwhal. You can download it here or update to it inside Android Studio by clicking Help > Check for updates (Android Studio > Check for updates on macOS)\n" +
                "\n" +
                "This is a stable release of Android Studio. Note that patches might contain new minor features and bug fixes. See Android Studio release names to understand Android Studio version naming.\n" +
                "\n" +
                "To see what's been fixed in this version of Android Studio, see the closed issues.\n" +
                "\n" +
                "To view the release notes for older versions of Android Studio, see Past releases.\n" +
                "\n" +
                "For early access to upcoming features and improvements, see the Preview builds of Android Studio.\n" +
                "\n" +
                "If you encounter problems in Android Studio, check the Known issues or Troubleshoot page.\n" +
                "\n" +
                "\n" +
                "Android Gradle plugin and Android Studio compatibility\n" +
                "The Android Studio build system is based on Gradle, and the Android Gradle plugin (AGP) adds several features that are specific to building Android apps. The following table lists which version of AGP is required for each version of Android Studio.", R.drawable.flag_uk), "UK");
        adapter.addFragment(CountryFragment.newInstance("Italy info", R.drawable.flag_italy), "Italy");
        adapter.addFragment(CountryFragment.newInstance("France info", R.drawable.flag_france), "France");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
