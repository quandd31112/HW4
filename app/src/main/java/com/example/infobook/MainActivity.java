package com.example.infobook;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCountries(View view) {
        startActivity(new Intent(this, CountriesActivity.class));
    }

    public void openLeaders(View view) {
        startActivity(new Intent(this, LeadersActivity.class));
    }

    public void openMuseums(View view) {
        startActivity(new Intent(this, MuseumsActivity.class));
    }

    public void openWonders(View view) {
        startActivity(new Intent(this, WondersActivity.class));
    }
}

