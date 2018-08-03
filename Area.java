package com.glbcapps.unitconverterapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Area extends AppCompatActivity {

    double sqKilometer, sqMeter, sqMile, sqYard, sqFoot, sqInch, Hectare, Acre;
    String UserDropdown;
    double UserEntry;
    int UserSelection;
    long SquareInchMultiplierForMiles = 4014000000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
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
        sqKilometer = 0;
        sqMeter = 0;
        sqMile = 0;
        sqYard = 0;
        sqFoot = 0;
        sqInch = 0;
        Hectare = 0;
        Acre = 0;
    }

    /*
    Selection codes:
    Square Kilometers = 1
    Square Meters = 2
    Square Miles = 3
    Square Yards = 4
    Square Feet = 5
    Square Inches = 6
    Hectares = 7
    Acres = 8
     */
    public void onGo() {
        if (UserDropdown == "Square Kilometers")
            UserSelection = 1;
        else if (UserDropdown == "Square Meters")
            UserSelection = 2;
        else if (UserDropdown == "Square Miles")
            UserSelection = 3;
        else if (UserDropdown == "Square Yards")
            UserSelection = 4;
        else if (UserDropdown == "Square Feet")
            UserSelection = 5;
        else if (UserDropdown == "Square Inches")
            UserSelection = 6;
        else if (UserDropdown == "Hectares")
            UserSelection = 7;
        else if (UserDropdown == "Acres")
            UserSelection = 8;
        else
            System.out.println("Error!");

        switch (UserSelection) {
            case 1:
                UserDropdown = "Square Kilometers";
                sqKilometer = UserEntry * 1;
                sqMeter = UserEntry * 1000000;
                sqMile = UserEntry * 0.386102;
                sqYard = UserEntry * 1196000;
                sqFoot = UserEntry * 10760000;
                sqInch = UserEntry * 1549440000;
                Hectare = UserEntry * 100;
                Acre = UserEntry * 247.105;
            case 2:
                UserDropdown = "Square Meters";
                sqKilometer = UserEntry * 0.000001;
                sqMeter = UserEntry * 1;
                sqMile = UserEntry * 0.0000003861;
                sqYard = UserEntry * 1.19599;
                sqFoot = UserEntry * 10.7639;
                sqInch = UserEntry * 1550;
                Hectare = UserEntry * 0.0001;
                Acre = UserEntry * 0.000247105;
            case 3:
                UserDropdown = "Square Miles";
                sqKilometer = UserEntry * 2.58999;
                sqMeter = UserEntry * 2590000;
                sqMile = UserEntry * 1;
                sqYard = UserEntry * 3098000;
                sqFoot = UserEntry * 27880000;
                sqInch = UserEntry * SquareInchMultiplierForMiles;
                Hectare = UserEntry * 259.00;
                Acre = UserEntry * 640;
            case 4:
                UserDropdown = "Square Yards";
                sqKilometer = UserEntry * 0.00000083613;
                sqMeter = UserEntry * 0.836127;
                sqMile = UserEntry * 0.00000032283;
                sqYard = UserEntry * 1;
                sqFoot = UserEntry * 9.00;
                sqInch = UserEntry * 1296;
                Hectare = UserEntry * 0.000083613;
                Acre = UserEntry * 0.000206612;
            case 5:
                UserDropdown = "Square Feet";
                sqKilometer = UserEntry * 0.000000092903;
                sqMeter = UserEntry * 0.092903;
                sqMile = UserEntry * 0.00000003587;
                sqYard = UserEntry * 0.111111;
                sqFoot = UserEntry * 1;
                sqInch = UserEntry * 144;
                Hectare = UserEntry * 0.0000092903;
                Acre = UserEntry * 0.000022957;
            case 6:
                UserDropdown = "Square Inches";
                sqKilometer = UserEntry * 0.00000000064516;
                sqMeter = UserEntry * 0.00064516;
                sqMile = UserEntry * 0.0000000002491;
                sqYard = UserEntry * 0.000771605;
                sqFoot = UserEntry * 0.00694444;
                sqInch = UserEntry * 1;
                Hectare = UserEntry * 0.000000064516;
                Acre = UserEntry * 0.00000015942;
            case 7:
                UserDropdown = "Hectares";
                sqKilometer = UserEntry * 0.01;
                sqMeter = UserEntry * 10000;
                sqMile = UserEntry * 0.00386102;
                sqYard = UserEntry * 11959.9;
                sqFoot = UserEntry * 107639;
                sqInch = UserEntry * 15500000;
                Hectare = UserEntry * 1;
                Acre = UserEntry * 2.47;
            case 8:
                UserDropdown = "Acres";
                sqKilometer = UserEntry * 0.00404686;
                sqMeter = UserEntry * 4046.86;
                sqMile = UserEntry * 0.0015625;
                sqYard = UserEntry * 4840;
                sqFoot = UserEntry * 43560;
                sqInch = UserEntry * 6273000;
                Hectare = UserEntry * 0.404686;
                Acre = UserEntry * 1;
        }
    }


}
