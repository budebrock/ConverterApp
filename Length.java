package com.glbcapps.unitconverterapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Length extends AppCompatActivity {

    double Kilometer, Meter, Centimeter, Millimeter, Micrometer, Nanometer, Mile, Yard,
            Foot, Inch, NauticalMile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
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
        Kilometer = 0;
        Meter = 0;
        Centimeter = 0;
        Millimeter = 0;
        Micrometer = 0;
        Nanometer = 0;
        Mile = 0;
        Yard = 0;
        Foot = 0;
        Inch = 0;
        NauticalMile = 0;
    }

}
