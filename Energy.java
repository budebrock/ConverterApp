package com.glbcapps.unitconverterapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Energy extends AppCompatActivity {

    double Joule, Kilojoule, GramCalorie, Kilocalorie, WattHour, Electronvolt, BritishThermalUnit, USTherm, FootPound;
    int UserSelection;
    String UserDropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy);
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
        Joule = 0;
        Kilojoule = 0;
        GramCalorie = 0;
        Kilocalorie = 0;
        WattHour = 0;
        Electronvolt = 0;
        BritishThermalUnit = 0;
        USTherm = 0;
        FootPound = 0;

    }

    /* selection codes:
    Joule = 1
    Kilojoule = 2
    GramCalorie = 3
    Kilocalorie = 4
    WattHour = 5
    Electronvolt = 6
    BritishThermalUnit = 7
    USTherm = 8
    FootPound = 9
     */
    public void onGo() {
        if (UserDropdown == "Joules")
            UserSelection = 1;
        else if (UserDropdown == "Kilojoules")
            UserSelection = 2;
        else if (UserDropdown == "GramCalorie")
            UserSelection = 3;
        else if (UserDropdown == "Kilocalorie")
            UserSelection = 4;
        else if (UserDropdown == "WattHour")
            UserSelection = 5;
        else if (UserDropdown == "Electronvolt")
            UserSelection = 6;
        else if (UserDropdown == "BritishThermalUnit")
            UserSelection = 7;
        else if (UserDropdown == "USTherm")
            UserSelection = 8;
        else if (UserDropdown == "FootPound")
            UserSelection = 9;
        else
            System.out.print("Error");
//start here: have to add the switch statement for each userdropdown
    }
}
