package com.glbcapps.unitconverterapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Time extends AppCompatActivity {

    double Nanoseconds, Microseconds, Milliseconds, Seconds, Minutes, Hours, Days, Weeks, Months, Years, Decades, Centuries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //When the activity opens, all variables are initiated to zero
        Nanoseconds = 0;
        Microseconds = 0;
        Milliseconds = 0;
        Seconds = 0;
        Minutes = 0;
        Hours = 0;
        Days = 0;
        Weeks = 0;
        Months = 0;
        Years = 0;
        Decades = 0;
        Centuries = 0;
    }

}
