package com.ebookfrenzy.roomdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ebookfrenzy.roomdemo.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {
    //comment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}