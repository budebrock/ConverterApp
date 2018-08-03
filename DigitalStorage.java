package com.glbcapps.unitconverterapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DigitalStorage extends AppCompatActivity {

    double Bits, Kilobits, Kibibits, Megabits, Mebibits, Gigabits, Gibibits, Terabits, Tebibits, Petabits, Pebibits,
            Bytes, Kilobytes, Kibibytes, Megabytes, Mebibytes, Gigabytes, Gibibytes, Terabytes, Tebibytes, Petabytes, Pebibytes;
    String UserDropdown;
    double UserEntry;
    int UserSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_storage);
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
        Bits = 0;
        Kilobits = 0;
        Kibibits = 0;
        Megabits = 0;
        Mebibits = 0;
        Gigabits = 0;
        Gibibits = 0;
        Terabits = 0;
        Tebibits = 0;
        Petabits = 0;
        Pebibits = 0;
        Bytes = 0;
        Kilobytes = 0;
        Kibibytes = 0;
        Megabytes = 0;
        Mebibytes = 0;
        Gigabytes = 0;
        Gibibytes = 0;
        Terabytes = 0;
        Tebibytes = 0;
        Petabytes = 0;
        Pebibytes = 0;
    }

    /*
   Selection codes:
   Bits = 1
   Kilobits = 2
   Kibibits = 3
   Megabits = 4
   Mebibits = 5
   Gigabits = 6
   Gibibits = 7
   Terabits = 8
   Tebibits = 9
   Petabits = 10
   Pebibits = 11
   Bytes = 12
   Kilobytes = 13
   Kibibytes = 14
   Megabytes = 15
   Mebibytes = 16
   Gigabytes = 17
   Gibibytes = 18
   Terabytes = 19
   Tebibytes = 20
   Petabytes = 21
   Pebibytes = 22
   */
    public void onGo() {
        if (UserDropdown == "Bits")
            UserSelection = 1;
        else if (UserDropdown == "Kilobits")
            UserSelection = 2;
        else if (UserDropdown == "Kibibits")
            UserSelection = 3;
        else if (UserDropdown == "Megabits")
            UserSelection = 4;
        else if (UserDropdown == "Mebibits")
            UserSelection = 5;
        else if (UserDropdown == "Gigabits")
            UserSelection = 6;
        else if (UserDropdown == "Gibibits")
            UserSelection = 7;
        else if (UserDropdown == "Terabits")
            UserSelection = 8;
        else if (UserDropdown == "Tebibits")
            UserSelection = 9;
        else if (UserDropdown == "Petabits")
            UserSelection = 10;
        else if (UserDropdown == "Pebibits")
            UserSelection = 11;
        else if (UserDropdown == "Bytes")
            UserSelection = 12;
        else if (UserDropdown == "Kilobytes")
            UserSelection = 13;
        else if (UserDropdown == "Kibibytes")
            UserSelection = 14;
        else if (UserDropdown == "Megabytes")
            UserSelection = 15;
        else if (UserDropdown == "Mebibytes")
            UserSelection = 16;
        else if (UserDropdown == "Gigabytes")
            UserSelection = 17;
        else if (UserDropdown == "Gibibytes")
            UserSelection = 18;
        else if (UserDropdown == "Terabytes")
            UserSelection = 19;
        else if (UserDropdown == "Tebibytes")
            UserSelection = 20;
        else if (UserDropdown == "Petabytes")
            UserSelection = 21;
        else if (UserDropdown == "Pebibytes")
            UserSelection = 22;
        else
            System.out.print("Error");

        switch (UserSelection) {
            case 1: UserDropdown = "Bits";
                Bits = UserEntry * 1;
                Kilobits = UserEntry * 0.001;
                Kibibits = UserEntry * 0.000976563;
                Megabits = UserEntry * 0.000001;
                Mebibits = UserEntry * 0.0000009537;
                Gigabits = UserEntry * 0.000000001;
                Gibibits = UserEntry * 0.00000000093132;
                Terabits = UserEntry * 0.000000000001;
                Tebibits = UserEntry * 0.00000000000090949;
                Petabits = UserEntry * 0.000000000000001;
                Pebibits = UserEntry * 0.00000000000000088818;
                Bytes = UserEntry * 0.125;
                Kilobytes = UserEntry * 0.000125;
                Kibibytes = UserEntry * 0.00012207;
                Megabytes = UserEntry * 0.000000125;
                Mebibytes = UserEntry * 0.00000011921;
                Gigabytes = UserEntry * 0.000000000125;
                Gibibytes = UserEntry * 0.00000000011642;
                Terabytes = UserEntry * 0.000000000000125;
                Tebibytes = UserEntry * 0.00000000000011369;
                Petabytes = UserEntry * 0.000000000000000125;
                Pebibytes = UserEntry * 0.00000000000000011102;
            case 2: UserDropdown = "Kilobits";
                Bits = UserEntry * 1000;
                Kilobits = UserEntry * 1;
                Kibibits = UserEntry * 0.976563;
                Megabits = UserEntry * 0.001;
                Mebibits = UserEntry * 0.000953674;
                Gigabits = UserEntry * 0.000001;
                Gibibits = UserEntry * 0.00000093132;
                Terabits = UserEntry * 0.000000001;
                Tebibits = UserEntry * 0.00000000090949;
                Petabits = UserEntry * 0.000000000001;
                Pebibits = UserEntry * 0.00000000000088818;
                Bytes = UserEntry * 125;
                Kilobytes = UserEntry * 0.125;
                Kibibytes = UserEntry * 0.12207;
                Megabytes = UserEntry * 0.000125;
                Mebibytes = UserEntry * 0.000119209;
                Gigabytes = UserEntry * 0.000000125;
                Gibibytes = UserEntry * 0.00000011642;
                Terabytes = UserEntry * 0.000000000125;
                Tebibytes = UserEntry * 0.00000000011369;
                Petabytes = UserEntry * 0.000000000000125;
                Pebibytes = UserEntry * 0.00000000000011102;
            case 3: UserDropdown = "Kibibits";
                Bits = UserEntry * 1024;
                Kilobits = UserEntry * 1.024;
                Kibibits = UserEntry * 1;
                Megabits = UserEntry * 0.001024;
                Mebibits = UserEntry * 0.000976563;
                Gigabits = UserEntry * 0.000001024;
                Gibibits = UserEntry * 0.00000095367;
                Terabits = UserEntry * 0.000000001024;
                Tebibits = UserEntry * 0.00000000093132;
                Petabits = UserEntry * 0.000000000001024;
                Pebibits = UserEntry * 0.00000000000090949;
                Bytes = UserEntry * 128;
                Kilobytes = UserEntry * 0.128;
                Kibibytes = UserEntry * 0.125;
                Megabytes = UserEntry * 0.000128;
                Mebibytes = UserEntry * 0.00012207;
                Gigabytes = UserEntry * 0.000000128;
                Gibibytes = UserEntry * 0.00000011921;
                Terabytes = UserEntry * 0.000000000128;
                Tebibytes = UserEntry * 0.00000000011642;
                Petabytes = UserEntry * 0.000000000000128;
                Pebibytes = UserEntry * 0.00000000000011369;
            case 4: UserDropdown = "Megabits";
                Bits = UserEntry * 1000000;
                Kilobits = UserEntry * 1000;
                Kibibits = UserEntry * 976.563;
                Megabits = UserEntry * 1.00;
                Mebibits = UserEntry * 0.953674;
                Gigabits = UserEntry * 0.001;
                Gibibits = UserEntry * 0.00093132;
                Terabits = UserEntry * 0.000001;
                Tebibits = UserEntry * 0.00000090949;
                Petabits = UserEntry * 0.000000001;
                Pebibits = UserEntry * 0.00000000088818;
                Bytes = UserEntry * 125000;
                Kilobytes = UserEntry * 125;
                Kibibytes = UserEntry * 122.07;
                Megabytes = UserEntry * 0.125;
                Mebibytes = UserEntry * 0.119209;
                Gigabytes = UserEntry * 0.000125;
                Gibibytes = UserEntry * 0.000116415;
                Terabytes = UserEntry * 0.000000125;
                Tebibytes = UserEntry * 0.00000011369;
                Petabytes = UserEntry * 0.000000000125;
                Pebibytes = UserEntry * 0.00000000011102;
            case 5: UserDropdown = "Mebibits";
                Bits = UserEntry * 1049000;
                Kilobits = UserEntry * 1048.58;
                Kibibits = UserEntry * 1024;
                Megabits = UserEntry * 1.04858;
                Mebibits = UserEntry * 1.00;
                Gigabits = UserEntry * 0.00104858;
                Gibibits = UserEntry * 0.000976563;
                Terabits = UserEntry * 0.0000010486;
                Tebibits = UserEntry * 0.00000095367;
                Petabits = UserEntry * 0.0000000010486;
                Pebibits = UserEntry * 0.00000000093132;
                Bytes = UserEntry * 131072;
                Kilobytes = UserEntry * 131.072;
                Kibibytes = UserEntry * 128;
                Megabytes = UserEntry * 0.131072;
                Mebibytes = UserEntry * 0.125;
                Gigabytes = UserEntry * 0.000131072;
                Gibibytes = UserEntry * 0.00012207;
                Terabytes = UserEntry * 0.00000013107;
                Tebibytes = UserEntry * 0.00000011921;
                Petabytes = UserEntry * 0.00000000013107;
                Pebibytes = UserEntry * 0.00000000011642;
            case 6: UserDropdown = "Gigabits";
                Bits = UserEntry * 1000000000;
                Kilobits = UserEntry * 1000000;
                Kibibits = UserEntry * 976563;
                Megabits = UserEntry * 1000;
                Mebibits = UserEntry * 953.674;
                Gigabits = UserEntry * 1;
                Gibibits = UserEntry * 0.931323;
                Terabits = UserEntry * 0.001;
                Tebibits = UserEntry * 0.000909495;
                Petabits = UserEntry * 0.000001;
                Pebibits = UserEntry * 0.00000088818;
                Bytes = UserEntry * 125000000;
                Kilobytes = UserEntry * 125000;
                Kibibytes = UserEntry * 122070;
                Megabytes = UserEntry * 125;
                Mebibytes = UserEntry * 119.209;
                Gigabytes = UserEntry * 0.125;
                Gibibytes = UserEntry * 0.116415;
                Terabytes = UserEntry * 0.000125;
                Tebibytes = UserEntry * 0.000113687;
                Petabytes = UserEntry * 0.000000125;
                Pebibytes = UserEntry * 0.00000011102;
            case 7: UserDropdown = "Gibibits";
                Bits = UserEntry * 1074000000;
                Kilobits = UserEntry * 1074000;
                Kibibits = UserEntry * 1049000;
                Megabits = UserEntry * 1073.74;
                Mebibits = UserEntry * 1024;
                Gigabits = UserEntry * 1.07374;
                Gibibits = UserEntry * 1;
                Terabits = UserEntry * 0.00107374;
                Tebibits = UserEntry * 0.000976563;
                Petabits = UserEntry * 0.0000010737;
                Pebibits = UserEntry * 0.00000095367;
                Bytes = UserEntry * 134200000;
                Kilobytes = UserEntry * 134218;
                Kibibytes = UserEntry * 131072;
                Megabytes = UserEntry * 134.218;
                Mebibytes = UserEntry * 128;
                Gigabytes = UserEntry * 0.134218;
                Gibibytes = UserEntry * 0.125;
                Terabytes = UserEntry * 0.000134218;
                Tebibytes = UserEntry * 0.00012207;
                Petabytes = UserEntry * 0.00000013422;
                Pebibytes = UserEntry * 0.00000011921;
            case 8: UserDropdown = "Terabits";
                long BitMultiplierForTerabits = 1000000000000L;
                Bits = UserEntry * BitMultiplierForTerabits;
                Kilobits = UserEntry * 1000000000;
                Kibibits = UserEntry * 976600000;
                Megabits = UserEntry * 1000000;
                Mebibits = UserEntry * 953674;
                Gigabits = UserEntry * 1000;
                Gibibits = UserEntry * 931.323;
                Terabits = UserEntry * 1;
                Tebibits = UserEntry * 0.909495;
                Petabits = UserEntry * 0.001;
                Pebibits = UserEntry * 0.000888178;
                long ByteMultiplierForTerabits = 125000000000L;
                Bytes = UserEntry * ByteMultiplierForTerabits;
                Kilobytes = UserEntry * 125000000;
                Kibibytes = UserEntry * 122100000;
                Megabytes = UserEntry * 125000;
                Mebibytes = UserEntry * 119209;
                Gigabytes = UserEntry * 125;
                Gibibytes = UserEntry * 116.415;
                Terabytes = UserEntry * 0.125;
                Tebibytes = UserEntry * 0.113687;
                Petabytes = UserEntry * 0.000125;
                Pebibytes = UserEntry * 0.000111022;
            case 9: UserDropdown = "Tebibits";
                    long BitMultiplierForTebibits = 1100000000000L;
                Bits = UserEntry * BitMultiplierForTebibits;
                Kilobits = UserEntry * 1100000000;
                Kibibits = UserEntry * 1074000000;
                Megabits = UserEntry * 1100000;
                Mebibits = UserEntry * 1049000;
                Gigabits = UserEntry * 1099.51;
                Gibibits = UserEntry * 1024;
                Terabits = UserEntry * 1.09951;
                Tebibits = UserEntry * 1;
                Petabits = UserEntry * 0.00109951;
                Pebibits = UserEntry * 0.000976563;
                    long ByteMultiplierForTebibits = 137400000000L;
                Bytes = UserEntry * ByteMultiplierForTebibits;
                Kilobytes = UserEntry * 137400000;
                Kibibytes = UserEntry * 134200000;
                Megabytes = UserEntry * 137439;
                Mebibytes = UserEntry * 131072;
                Gigabytes = UserEntry * 137.439;
                Gibibytes = UserEntry * 128;
                Terabytes = UserEntry * 0.137439;
                Tebibytes = UserEntry * 0.125;
                Petabytes = UserEntry * 0.000137439;
                Pebibytes = UserEntry * 0.00012207;
            case 10: UserDropdown = "Petabits";
                    long BitMultiplierForPetabits = 1000000000000000L;
                Bits = UserEntry * BitMultiplierForPetabits;
                    long KilobitMultiplierForPetabits = 1000000000000L;
                Kilobits = UserEntry * KilobitMultiplierForPetabits;
                    long KibibitMultiplierForPetabits = 976600000000L;
                Kibibits = UserEntry * KibibitMultiplierForPetabits;
                Megabits = UserEntry * 1000000000;
                Mebibits = UserEntry * 953700000;
                Gigabits = UserEntry * 1000000;
                Gibibits = UserEntry * 931323;
                Terabits = UserEntry * 1000;
                Tebibits = UserEntry * 909.495;
                Petabits = UserEntry * 1;
                Pebibits = UserEntry * 0.888178;
                    long ByteMultiplierForPetabits = 125000000000000L;
                Bytes = UserEntry * ByteMultiplierForPetabits;
                    long KilobyteMultiplierForPetabits = 125000000000L;
                Kilobytes = UserEntry * KilobyteMultiplierForPetabits;
                    long KibibyteMultiplierForPetabits = 122100000000L;
                Kibibytes = UserEntry * KibibyteMultiplierForPetabits;
                Megabytes = UserEntry * 125000000;
                Mebibytes = UserEntry * 119200000;
                Gigabytes = UserEntry * 125000;
                Gibibytes = UserEntry * 116415;
                Terabytes = UserEntry * 125;
                Tebibytes = UserEntry * 113.687;
                Petabytes = UserEntry * 0.125;
                Pebibytes = UserEntry * 0.111022;
            case 11: UserDropdown = "Pebibits";
                    long BitMultiplierForPebibits = 1126000000000000L;
                Bits = UserEntry * BitMultiplierForPebibits;
                    long KilobitMultiplierForPebibits = 1126000000000L;
                Kilobits = UserEntry * KilobitMultiplierForPebibits;
                    long KibibitMultiplierForPebibits = 1100000000000L;
                Kibibits = UserEntry * KibibitMultiplierForPebibits;
                Megabits = UserEntry * 1126000000;
                Mebibits = UserEntry * 1074000000;
                Gigabits = UserEntry * 1126000;
                Gibibits = UserEntry * 1049000;
                Terabits = UserEntry * 1125.9;
                Tebibits = UserEntry * 1024;
                Petabits = UserEntry * 1.1259;
                Pebibits = UserEntry * 1;
                    long ByteMultiplierForPebibits = 140700000000000L;
                Bytes = UserEntry * ByteMultiplierForPebibits;
                    long KilobyteMultiplierForPebibits = 140700000000L;
                Kilobytes = UserEntry * KilobyteMultiplierForPebibits;
                    long KibibyteMultiplierForPebibits = 137400000000L;
                Kibibytes = UserEntry * KibibyteMultiplierForPebibits;
                Megabytes = UserEntry * 140700000;
                Mebibytes = UserEntry * 134200000;
                Gigabytes = UserEntry * 140737;
                Gibibytes = UserEntry * 131072;
                Terabytes = UserEntry * 140.737;
                Tebibytes = UserEntry * 128;
                Petabytes = UserEntry * 0.140737;
                Pebibytes = UserEntry * 0.125;
            case 12: UserDropdown = "Bytes";
                Bits = UserEntry * 8;
                Kilobits = UserEntry * 0.008;
                Kibibits = UserEntry * 0.0078125;
                Megabits = UserEntry * 0.000008;
                Mebibits = UserEntry * 0.0000076294;
                Gigabits = UserEntry * 0.000000008;
                Gibibits = UserEntry * 0.0000000074506;
                Terabits = UserEntry * 0.000000000008;
                Tebibits = UserEntry * 0.000000000007276;
                Petabits = UserEntry * 0.000000000000008;
                Pebibits = UserEntry * 0.0000000000000071054;
                Bytes = UserEntry * 1;
                Kilobytes = UserEntry * 0.001;
                Kibibytes = UserEntry * 0.000976563;
                Megabytes = UserEntry * 0.000001;
                Mebibytes = UserEntry * 0.00000095367;
                Gigabytes = UserEntry * 0.000000001;
                Gibibytes = UserEntry * 0.00000000093132;
                Terabytes = UserEntry * 0.000000000001;
                Tebibytes = UserEntry * 0.00000000000090949;
                Petabytes = UserEntry * 0.000000000000001;
                Pebibytes = UserEntry * 0.00000000000000088818;
            case 13: UserDropdown = "Kilobytes";
                Bits = UserEntry * 8000;
                Kilobits = UserEntry * 8;
                Kibibits = UserEntry * 7.8125;
                Megabits = UserEntry * 0.008;
                Mebibits = UserEntry * 0.00762939;
                Gigabits = UserEntry * 0.000008;
                Gibibits = UserEntry * 0.0000074506;
                Terabits = UserEntry * 0.000000008;
                Tebibits = UserEntry * 0.000000007276;
                Petabits = UserEntry * 0.000000000008;
                Pebibits = UserEntry * 0.0000000000071054;
                Bytes = UserEntry * 1000;
                Kilobytes = UserEntry * 1;
                Kibibytes = UserEntry * 0.976563;
                Megabytes = UserEntry * 0.001;
                Mebibytes = UserEntry * 0.000953674;
                Gigabytes = UserEntry * 0.000001;
                Gibibytes = UserEntry * 0.00000093132;
                Terabytes = UserEntry * 0.000000001;
                Tebibytes = UserEntry * 0.00000000090949;
                Petabytes = UserEntry * 0.000000000001;
                Pebibytes = UserEntry * 0.00000000000088818;
            case 14: UserDropdown = "Kibibytes";
                Bits = UserEntry * 8192;
                Kilobits = UserEntry * 8.192;
                Kibibits = UserEntry * 8;
                Megabits = UserEntry * 0.008192;
                Mebibits = UserEntry * 0.0078125;
                Gigabits = UserEntry * 0.000008192;
                Gibibits = UserEntry * 0.0000076294;
                Terabits = UserEntry * 0.000000008192;
                Tebibits = UserEntry * 0.0000000074506;
                Petabits = UserEntry * 0.000000000008192;
                Pebibits = UserEntry * 0.000000000007276;
                Bytes = UserEntry * 1024;
                Kilobytes = UserEntry * 1.024;
                Kibibytes = UserEntry * 1;
                Megabytes = UserEntry * 0.001024;
                Mebibytes = UserEntry * 0.000976563;
                Gigabytes = UserEntry * 0.000001024;
                Gibibytes = UserEntry * 0.00000095367;
                Terabytes = UserEntry * 0.000000001024;
                Tebibytes = UserEntry * 0.00000000093132;
                Petabytes = UserEntry * 0.000000000001024;
                Pebibytes = UserEntry * 0.00000000000090949;
            case 15: UserDropdown = "Megabytes";
                Bits = UserEntry * 8000000;
                Kilobits = UserEntry * 8000;
                Kibibits = UserEntry * 7812.5;
                Megabits = UserEntry * 8;
                Mebibits = UserEntry * 7.62939;
                Gigabits = UserEntry * 0.008;
                Gibibits = UserEntry * 0.00745058;
                Terabits = UserEntry * 0.000008;
                Tebibits = UserEntry * 0.000007276;
                Petabits = UserEntry * 0.000000008;
                Pebibits = UserEntry * 0.0000000071054;
                Bytes = UserEntry * 1000000;
                Kilobytes = UserEntry * 1000;
                Kibibytes = UserEntry * 976.563;
                Megabytes = UserEntry * 1;
                Mebibytes = UserEntry * 0.953674;
                Gigabytes = UserEntry * 0.001;
                Gibibytes = UserEntry * 0.000931323;
                Terabytes = UserEntry * 0.000001;
                Tebibytes = UserEntry * 0.00000090949;
                Petabytes = UserEntry * 0.000000001;
                Pebibytes = UserEntry * 0.00000000088818;
            case 16: UserDropdown = "Mebibytes";
                Bits = UserEntry * 8389000;
                Kilobits = UserEntry * 8388.61;
                Kibibits = UserEntry * 8192;
                Megabits = UserEntry * 8.38861;
                Mebibits = UserEntry * 8;
                Gigabits = UserEntry * 0.00838861;
                Gibibits = UserEntry * 0.0078125;
                Terabits = UserEntry * 0.0000083886;
                Tebibits = UserEntry * 0.0000076294;
                Petabits = UserEntry * 0.0000000083886;
                Pebibits = UserEntry * 0.0000000074506;
                Bytes = UserEntry * 1049000;
                Kilobytes = UserEntry * 1048.58;
                Kibibytes = UserEntry * 1024;
                Megabytes = UserEntry * 1.04858;
                Mebibytes = UserEntry * 1;
                Gigabytes = UserEntry * 0.00104858;
                Gibibytes = UserEntry * 0.000976563;
                Terabytes = UserEntry * 0.0000010486;
                Tebibytes = UserEntry * 0.00000095367;
                Petabytes = UserEntry * 0.0000000010486;
                Pebibytes = UserEntry * 0.00000000093132;
            case 17: UserDropdown = "Gigabytes";
                    long BitMultiplierForGigabytes = 8000000000L;
                Bits = UserEntry * BitMultiplierForGigabytes;
                Kilobits = UserEntry * 8000000;
                Kibibits = UserEntry * 7813000;
                Megabits = UserEntry * 8000;
                Mebibits = UserEntry * 7629.39;
                Gigabits = UserEntry * 8;
                Gibibits = UserEntry * 7.45058;
                Terabits = UserEntry * 0.008;
                Tebibits = UserEntry * 0.00727596;
                Petabits = UserEntry * 0.000008;
                Pebibits = UserEntry * 0.0000071054;
                Bytes = UserEntry * 1000000000;
                Kilobytes = UserEntry * 1000000;
                Kibibytes = UserEntry * 976563;
                Megabytes = UserEntry * 1000;
                Mebibytes = UserEntry * 953.674;
                Gigabytes = UserEntry * 1;
                Gibibytes = UserEntry * 0.931323;
                Terabytes = UserEntry * 0.001;
                Tebibytes = UserEntry * 0.000909495;
                Petabytes = UserEntry * 0.000001;
                Pebibytes = UserEntry * 0.00000088818;
            case 18: UserDropdown = "Gibibytes";
                    long BitMultiplierForGibibytes = 8590000000L;
                Bits = UserEntry * BitMultiplierForGibibytes;
                Kilobits = UserEntry * 8590000;
                Kibibits = UserEntry * 8389000;
                Megabits = UserEntry * 8589.93;
                Mebibits = UserEntry * 8192;
                Gigabits = UserEntry * 8.58993;
                Gibibits = UserEntry * 8;
                Terabits = UserEntry * 0.00858993;
                Tebibits = UserEntry * 0.0078125;
                Petabits = UserEntry * 0.0000085899;
                Pebibits = UserEntry * 0.0000076294;
                Bytes = UserEntry * 1074000000;
                Kilobytes = UserEntry * 1074000;
                Kibibytes = UserEntry * 1049000;
                Megabytes = UserEntry * 1073.74;
                Mebibytes = UserEntry * 1024;
                Gigabytes = UserEntry * 1.07374;
                Gibibytes = UserEntry * 1;
                Terabytes = UserEntry * 0.00107374;
                Tebibytes = UserEntry * 0.000976563;
                Petabytes = UserEntry * 0.0000010737;
                Pebibytes = UserEntry * 0.00000095367;
            case 19: UserDropdown = "Terabytes";
                    long BitMultiplierForTerabytes = 8000000000000L;
                Bits = UserEntry * BitMultiplierForTerabytes;
                    long KilobitMultiplierForTerabytes = 8000000000L;
                Kilobits = UserEntry * KilobitMultiplierForTerabytes;
                    long KibikitMultiplierForTerabytes = 7813000000L;
                Kibibits = UserEntry * KibikitMultiplierForTerabytes;
                Megabits = UserEntry * 8000000;
                Mebibits = UserEntry * 7629000;
                Gigabits = UserEntry * 8000;
                Gibibits = UserEntry * 7450.58;
                Terabits = UserEntry * 8;
                Tebibits = UserEntry * 7.27596;
                Petabits = UserEntry * 0.008;
                Pebibits = UserEntry * 0.00710543;
                    long ByteMultiplierForTerabytes = 1000000000000L;
                Bytes = UserEntry * ByteMultiplierForTerabytes;
                Kilobytes = UserEntry * 1000000000;
                Kibibytes = UserEntry * 976600000;
                Megabytes = UserEntry * 1000000;
                Mebibytes = UserEntry * 953674;
                Gigabytes = UserEntry * 1000;
                Gibibytes = UserEntry * 931.323;
                Terabytes = UserEntry * 1;
                Tebibytes = UserEntry * 0.909495;
                Petabytes = UserEntry * 0.001;
                Pebibytes = UserEntry * 0.000888178;
            case 20: UserDropdown = "Tebibytes";
                    long BitMultiplierForTebibytes = 8796000000000L;
                Bits = UserEntry * BitMultiplierForTebibytes;
                    long KilobitMultiplierForTebibytes = 8796000000L;
                Kilobits = UserEntry * KilobitMultiplierForTebibytes;
                    long KibibitMultiplierForTebibytes = 8590000000L;
                Kibibits = UserEntry * KibibitMultiplierForTebibytes;
                Megabits = UserEntry * 8796000;
                Mebibits = UserEntry * 8389000;
                Gigabits = UserEntry * 8796.09;
                Gibibits = UserEntry * 8192;
                Terabits = UserEntry * 8.79609;
                Tebibits = UserEntry * 8;
                Petabits = UserEntry * 0.00879609;
                Pebibits = UserEntry * 0.0078125;
                    long ByteMultiplierForTebibytes = 1100000000000L;
                Bytes = UserEntry * ByteMultiplierForTebibytes;
                Kilobytes = UserEntry * 1100000000;
                Kibibytes = UserEntry * 1074000000;
                Megabytes = UserEntry * 1100000;
                Mebibytes = UserEntry * 1049000;
                Gigabytes = UserEntry * 1099.51;
                Gibibytes = UserEntry * 1024;
                Terabytes = UserEntry * 1.09951;
                Tebibytes = UserEntry * 1;
                Petabytes = UserEntry * 0.00109951;
                Pebibytes = UserEntry * 0.000976563;
            case 21: UserDropdown = "Petabytes";
                    long BitMultiplierForPetabytes = 8000000000000000L;
                Bits = UserEntry * BitMultiplierForPetabytes;
                    long KilobitMultiplierForPetabytes = 8000000000000L;
                Kilobits = UserEntry * KilobitMultiplierForPetabytes;
                    long KibibitMultiplierForPetabytes = 7813000000000L;
                Kibibits = UserEntry * KibibitMultiplierForPetabytes;
                    long MegabitMultiplierForPetabytes = 8000000000L;
                Megabits = UserEntry * MegabitMultiplierForPetabytes;
                    long MebibitMultiplierForPetabytes = 7629000000L;
                Mebibits = UserEntry * MebibitMultiplierForPetabytes;
                Gigabits = UserEntry * 8000000;
                Gibibits = UserEntry * 7451000;
                Terabits = UserEntry * 8000;
                Tebibits = UserEntry * 7275.96;
                Petabits = UserEntry * 8;
                Pebibits = UserEntry * 7.10543;
                    long ByteMultiplierForPetabytes = 1000000000000000L;
                Bytes = UserEntry * ByteMultiplierForPetabytes;
                    long KilobyteMultiplierForPetabytes = 1000000000000L;
                Kilobytes = UserEntry * KilobyteMultiplierForPetabytes;
                    long KibibyteMultiplierForPetabytes = 976600000000L;
                Kibibytes = UserEntry * KibibyteMultiplierForPetabytes;
                Megabytes = UserEntry * 1000000000;
                Mebibytes = UserEntry * 953700000;
                Gigabytes = UserEntry * 1000000;
                Gibibytes = UserEntry * 931323;
                Terabytes = UserEntry * 1000;
                Tebibytes = UserEntry * 909.495;
                Petabytes = UserEntry * 1;
                Pebibytes = UserEntry * 0.888178;
            case 22: UserDropdown = "Pebibytes";
                    long BitMultiplierForPebibytes = 9007000000000000L;
                Bits = UserEntry * BitMultiplierForPebibytes;
                    long KilobitMultiplierForPebibytes = 9007000000000L;
                Kilobits = UserEntry * KilobitMultiplierForPebibytes;
                    long KibibitMultiplierForPebibytes = 8796000000000L;
                Kibibits = UserEntry * KibibitMultiplierForPebibytes;
                    long MegabitMultiplierForPebibytes = 9007000000L;
                Megabits = UserEntry * MegabitMultiplierForPebibytes;
                    long MebibitMultiplierForPebibytes = 8590000000L;
                Mebibits = UserEntry * MebibitMultiplierForPebibytes;
                Gigabits = UserEntry * 9007000;
                Gibibits = UserEntry * 8389000;
                Terabits = UserEntry * 9007.2;
                Tebibits = UserEntry * 8192;
                Petabits = UserEntry * 9.0072;
                Pebibits = UserEntry * 8;
                    long ByteMultiplierForPebibytes = 1126000000000000L;
                Bytes = UserEntry * ByteMultiplierForPebibytes;
                    long KilobyteMultiplierForPebibytes = 1126000000000L;
                Kilobytes = UserEntry * KilobyteMultiplierForPebibytes;
                    long KibibyteMultiplierForPebibytes = 1100000000000L;
                Kibibytes = UserEntry * KibibyteMultiplierForPebibytes;
                Megabytes = UserEntry * 1126000000;
                Mebibytes = UserEntry * 1074000000;
                Gigabytes = UserEntry * 1126000;
                Gibibytes = UserEntry * 1049000;
                Terabytes = UserEntry * 1125.9;
                Tebibytes = UserEntry * 1024;
                Petabytes = UserEntry * 1.1259;
                Pebibytes = UserEntry * 1;
                //test test

        }
    }
}