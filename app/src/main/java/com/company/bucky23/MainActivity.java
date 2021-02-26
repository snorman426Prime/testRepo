package com.company.bucky23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bottom)
    {
        BottomPictureFragment bottomFragment = (BottomPictureFragment) getSupportFragmentManager().
                findFragmentById(R.id.fragment2);

        bottomFragment.setMemeText(top, bottom);
    }
}