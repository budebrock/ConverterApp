package com.glbcapps.unitconverterapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Speed extends AppCompatActivity {

    double MilesPerHour, FeetPerSecond,	MetersPerSecond, KilometersPerHour, Knots;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
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
        MilesPerHour = 0;
        FeetPerSecond = 0;
        MetersPerSecond = 0;
        KilometersPerHour = 0;
        Knots = 0;

    }

}
