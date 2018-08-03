package com.glbcapps.unitconverterapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DataTransferRate extends AppCompatActivity {

    double bitPerSecond, KilobitPerSecond, KilobytePerSecond, KibibitPerSecond, MegabitPerSecond,
            MegabytePerSecond, MebibitPerSecond, GigabitPerSecond, GigabytePerSecond,
            GibibitPerSecond, TerabitPerSecond, TerabytePerSecond, TebibitPerSecond;
    String UserDropdown;
    double UserEntry;
    int UserSelection;
    long BitMultiplierForGigabytes = 8000000000L;
    long BitMultiplierForTerabits = 1000000327900L;
    long BitMultiplierForTerabytes = 8000000000000L;
    long KilobitMultiplierForTerabytes = 8000000000L;
    long KibibitMultiplierForTerabytes = 7813000000L;
    long BitMultiplierForTebibits = 1100000000000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_transfer_rate);
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
        bitPerSecond = 0;
        KilobitPerSecond = 0;
        KilobytePerSecond = 0;
        KibibitPerSecond = 0;
        MegabitPerSecond = 0;
        MegabytePerSecond = 0;
        MebibitPerSecond = 0;
        GigabitPerSecond = 0;
        GigabytePerSecond = 0;
        GibibitPerSecond = 0;
        TerabitPerSecond = 0;
        TerabytePerSecond = 0;
        TebibitPerSecond = 0;

    }

    /*
    Selection codes:
    bitPerSecond = 1
    KilobitPerSecond = 2
    KilobytePerSecond = 3
    KibibitPerSecond = 4
    MegabitPerSecond = 5
    MegabytePerSecond= 6
    MebibitPerSecond = 7
    GigabitPerSecond = 8
    GigabytePerSecond = 9
    GibibitPerSecond = 10
    TerabitPerSecond = 11
    TerabytePerSecond = 12
    TebibitPerSecond = 13
    */
    public void onGo() {
        if (UserDropdown == "Bits per second")
            UserSelection = 1;
        else if (UserDropdown == "Kilobits per second")
            UserSelection = 2;
        else if (UserDropdown == "Kilobytes per second")
            UserSelection = 3;
        else if (UserDropdown == "Kibibits per second")
            UserSelection = 4;
        else if (UserDropdown == "Megabits per second")
            UserSelection = 5;
        else if (UserDropdown == "Megabytes per second")
            UserSelection = 6;
        else if (UserDropdown == "Mebibits per second")
            UserSelection = 7;
        else if (UserDropdown == "Gigabits per second")
            UserSelection = 8;
        else if (UserDropdown == "Gigabytes per second")
            UserSelection = 9;
        else if (UserDropdown == "Gibibits per second")
            UserSelection = 10;
        else if (UserDropdown == "Terabits per second")
            UserSelection = 11;
        else if (UserDropdown == "Terabytes per second")
            UserSelection = 12;
        else if (UserDropdown == "Tebibits per second")
            UserSelection = 13;
        else
            System.out.print("Error");

        switch (UserSelection) {
            case 1:
                UserDropdown = "Bits per second";
                bitPerSecond = UserEntry * 1;
                KilobitPerSecond = UserEntry * 0.001;
                KilobytePerSecond = UserEntry * 0.000125;
                KibibitPerSecond = UserEntry * 0.000976563;
                MegabitPerSecond = UserEntry * 0.000001;
                MegabytePerSecond = UserEntry * 0.000000125;
                MebibitPerSecond = UserEntry * 0.00000095367;
                GigabitPerSecond = UserEntry * 0.000000001;
                GigabytePerSecond = UserEntry * 0.000000000125;
                GibibitPerSecond = UserEntry * 0.00000000093132;
                TerabitPerSecond = UserEntry * 0.000000000001;
                TerabytePerSecond = UserEntry * 0.000000000000125;
                TebibitPerSecond = UserEntry * 0.00000000000090949;
            case 2:
                UserDropdown = "Kilobits per second";
                bitPerSecond = UserEntry * 1000;
                KilobitPerSecond = UserEntry * 1;
                KilobytePerSecond = UserEntry * 0.001;
                KibibitPerSecond = UserEntry * 0.976563;
                MegabitPerSecond = UserEntry * 0.001;
                MegabytePerSecond = UserEntry * 0.000125;
                MebibitPerSecond = UserEntry * 0.000953674;
                GigabitPerSecond = UserEntry * 0.000001;
                GigabytePerSecond = UserEntry * 0.000000125;
                GibibitPerSecond = UserEntry * 0.00000093132;
                TerabitPerSecond = UserEntry * 0.000000001;
                TerabytePerSecond = UserEntry * 0.000000000125;
                TebibitPerSecond = UserEntry * 0.00000000090949;
            case 3:
                UserDropdown = "Kilobytes per second";
                bitPerSecond = UserEntry * 8000;
                KilobitPerSecond = UserEntry * 8;
                KilobytePerSecond = UserEntry * 1;
                KibibitPerSecond = UserEntry * 7.8125;
                MegabitPerSecond = UserEntry * 0.008;
                MegabytePerSecond = UserEntry * 0.001;
                MebibitPerSecond = UserEntry * 0.00762939;
                GigabitPerSecond = UserEntry * 0.000008;
                GigabytePerSecond = UserEntry * 0.000001;
                GibibitPerSecond = UserEntry * 0.0000074506;
                TerabitPerSecond = UserEntry * 0.000000008;
                TerabytePerSecond = UserEntry * 0.000000001;
                TebibitPerSecond = UserEntry * 0.000000007276;
            case 4:
                UserDropdown = "Kibibits per second";
                bitPerSecond = UserEntry * 1024;
                KilobitPerSecond = UserEntry * 1.02;
                KilobytePerSecond = UserEntry * 0.128;
                KibibitPerSecond = UserEntry * 1;
                MegabitPerSecond = UserEntry * 0.001024;
                MegabytePerSecond = UserEntry * 0.000128;
                MebibitPerSecond = UserEntry * 0.000976563;
                GigabitPerSecond = UserEntry * 0.000001024;
                GigabytePerSecond = UserEntry * 0.000000128;
                GibibitPerSecond = UserEntry * 0.00000095367;
                TerabitPerSecond = UserEntry * 0.000000001024;
                TerabytePerSecond = UserEntry * 0.000000000128;
                TebibitPerSecond = UserEntry * 0.00000000093132;
            case 5:
                UserDropdown = "Megabits per second";
                bitPerSecond = UserEntry * 1000000;
                KilobitPerSecond = UserEntry * 1000;
                KilobytePerSecond = UserEntry * 125;
                KibibitPerSecond = UserEntry * 976.563;
                MegabitPerSecond = UserEntry * 1;
                MegabytePerSecond = UserEntry * 0.125;
                MebibitPerSecond = UserEntry * 0.953674;
                GigabitPerSecond = UserEntry * 0.001;
                GigabytePerSecond = UserEntry * 0.000125;
                GibibitPerSecond = UserEntry * 0.000931323;
                TerabitPerSecond = UserEntry * 0.000001;
                TerabytePerSecond = UserEntry * 0.000000125;
                TebibitPerSecond = UserEntry * 0.00000090949;
            case 6:
                UserDropdown = "Megabytes per second";
                bitPerSecond = UserEntry * 8000000;
                KilobitPerSecond = UserEntry * 8000;
                KilobytePerSecond = UserEntry * 1000;
                KibibitPerSecond = UserEntry * 7812.5;
                MegabitPerSecond = UserEntry * 8;
                MegabytePerSecond = UserEntry * 1;
                MebibitPerSecond = UserEntry * 7.62939;
                GigabitPerSecond = UserEntry * 0.008;
                GigabytePerSecond = UserEntry * 0.001;
                GibibitPerSecond = UserEntry * 0.01;
                TerabitPerSecond = UserEntry * 0.000008;
                TerabytePerSecond = UserEntry * 0.000001;
                TebibitPerSecond = UserEntry * 0.000007276;
            case 7:
                UserDropdown = "Mebibits per second";
                bitPerSecond = UserEntry * 1049000;
                KilobitPerSecond = UserEntry * 1048.58;
                KilobytePerSecond = UserEntry * 131.072;
                KibibitPerSecond = UserEntry * 1024;
                MegabitPerSecond = UserEntry * 1.04858;
                MegabytePerSecond = UserEntry * 0.131072;
                MebibitPerSecond = UserEntry * 1;
                GigabitPerSecond = UserEntry * 0.00104858;
                GigabytePerSecond = UserEntry * 0.000131072;
                GibibitPerSecond = UserEntry * 0.000976563;
                TerabitPerSecond = UserEntry * 0.0000010486;
                TerabytePerSecond = UserEntry * 0.00000013107;
                TebibitPerSecond = UserEntry * 0.00000095367;
            case 8:
                UserDropdown = "Gigabits per second";
                bitPerSecond = UserEntry * 1000000000;
                KilobitPerSecond = UserEntry * 1000000;
                KilobytePerSecond = UserEntry * 125000;
                KibibitPerSecond = UserEntry * 976563;
                MegabitPerSecond = UserEntry * 1000;
                MegabytePerSecond = UserEntry * 125;
                MebibitPerSecond = UserEntry * 953.67;
                GigabitPerSecond = UserEntry * 1;
                GigabytePerSecond = UserEntry * 0.125;
                GibibitPerSecond = UserEntry * 0.931323;
                TerabitPerSecond = UserEntry * 0.001;
                TerabytePerSecond = UserEntry * 0.000125;
                TebibitPerSecond = UserEntry * 0.000909495;
            case 9:
                UserDropdown = "Gigabytes per second";
                bitPerSecond = UserEntry * BitMultiplierForGigabytes;
                KilobitPerSecond = UserEntry * 8000000;
                KilobytePerSecond = UserEntry * 1000000;
                KibibitPerSecond = UserEntry * 7813000;
                MegabitPerSecond = UserEntry * 8000;
                MegabytePerSecond = UserEntry * 1000;
                MebibitPerSecond = UserEntry * 7629.39;
                GigabitPerSecond = UserEntry * 8;
                GigabytePerSecond = UserEntry * 1;
                GibibitPerSecond = UserEntry * 7.45058;
                TerabitPerSecond = UserEntry * 0.008;
                TerabytePerSecond = UserEntry * 0.001;
                TebibitPerSecond = UserEntry * 0.00727596;
            case 10:
                UserDropdown = "Gibibits per second";
                bitPerSecond = UserEntry * 1074000000;
                KilobitPerSecond = UserEntry * 1074000;
                KilobytePerSecond = UserEntry * 134218;
                KibibitPerSecond = UserEntry * 1049000;
                MegabitPerSecond = UserEntry * 1073.74;
                MegabytePerSecond = UserEntry * 134.218;
                MebibitPerSecond = UserEntry * 1024;
                GigabitPerSecond = UserEntry * 1.07374;
                GigabytePerSecond = UserEntry * 0.134218;
                GibibitPerSecond = UserEntry * 1;
                TerabitPerSecond = UserEntry * 0.00107374;
                TerabytePerSecond = UserEntry * 0.000134218;
                TebibitPerSecond = UserEntry * 0.000976563;
            case 11:
                UserDropdown = "Terabits per second";
                bitPerSecond = UserEntry * BitMultiplierForTerabits;
                KilobitPerSecond = UserEntry * 1000000000;
                KilobytePerSecond = UserEntry * 125000000;
                KibibitPerSecond = UserEntry * 976600000;
                MegabitPerSecond = UserEntry * 1000000;
                MegabytePerSecond = UserEntry * 125000;
                MebibitPerSecond = UserEntry * 953674;
                GigabitPerSecond = UserEntry * 1000;
                GigabytePerSecond = UserEntry * 125.00;
                GibibitPerSecond = UserEntry * 931.323;
                TerabitPerSecond = UserEntry * 1;
                TerabytePerSecond = UserEntry * 0.125;
                TebibitPerSecond = UserEntry * 0.91;
            case 12:
                UserDropdown = "Terabytes per second";
                bitPerSecond = UserEntry * BitMultiplierForTerabytes;
                KilobitPerSecond = UserEntry * KilobitMultiplierForTerabytes;
                KilobytePerSecond = UserEntry * 1000000000;
                KibibitPerSecond = UserEntry * KibibitMultiplierForTerabytes;
                MegabitPerSecond = UserEntry * 8000000;
                MegabytePerSecond = UserEntry * 1000000;
                MebibitPerSecond = UserEntry * 7629000;
                GigabitPerSecond = UserEntry * 8000;
                GigabytePerSecond = UserEntry * 1000;
                GibibitPerSecond = UserEntry * 7450.58;
                TerabitPerSecond = UserEntry * 8.00;
                TerabytePerSecond = UserEntry * 1;
                TebibitPerSecond = UserEntry * 7.27596;
            case 13:
                UserDropdown = "Tebibits per second";
                bitPerSecond = UserEntry * BitMultiplierForTebibits;
                KilobitPerSecond = UserEntry * 1100000000;
                KilobytePerSecond = UserEntry * 137400000;
                KibibitPerSecond = UserEntry * 1074000000;
                MegabitPerSecond = UserEntry * 1100000;
                MegabytePerSecond = UserEntry * 137439;
                MebibitPerSecond = UserEntry * 1049000;
                GigabitPerSecond = UserEntry * 1099.51;
                GigabytePerSecond = UserEntry * 137.439;
                GibibitPerSecond = UserEntry * 1024;
                TerabitPerSecond = UserEntry * 1.09951;
                TerabytePerSecond = UserEntry * 0.137439;
                TebibitPerSecond = UserEntry * 1;
        }

    }
}
