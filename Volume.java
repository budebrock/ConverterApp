package com.glbcapps.unitconverterapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Volume extends AppCompatActivity {

    double USLiquidGallons, USLiquidQuarts, USLiquidPints, USLegalCups, USFluidOunces, USTablespoons,
            USTeaspoons, CubicMeters, Liters, Milliliters, ImperialQuarts, ImperialPints, ImperialCups,
            ImperialFluidOunces, ImperialTablespoons, ImperialTeaspoons, CubicFeet, CubicInches;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
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
        USLiquidGallons = 0;
        USLiquidQuarts = 0;
        USLiquidPints = 0;
        USLegalCups = 0;
        USFluidOunces = 0;
        USTablespoons = 0;
        USTeaspoons = 0;
        CubicMeters = 0;
        Liters = 0;
        Milliliters = 0;
        ImperialQuarts = 0;
        ImperialPints = 0;
        ImperialCups = 0;
        ImperialFluidOunces = 0;
        ImperialTablespoons = 0;
        ImperialTeaspoons = 0;
        CubicFeet = 0;
        CubicInches = 0;
    }

}
