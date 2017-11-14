package com.example.vinod.dottedprogresstwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zl.reik.dilatingdotsprogressbar.DilatingDotsProgressBar;

public class MainActivity extends AppCompatActivity {

    DilatingDotsProgressBar mDilatingDotsProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDilatingDotsProgressBar = (DilatingDotsProgressBar) findViewById(R.id.progress);
        mDilatingDotsProgressBar.showNow();

    }
}
