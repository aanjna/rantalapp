package com.solution.rentalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button newresident, newbuilding, editresident, editbuilding, editrentinfo, rentreciev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /*   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        newresident = (Button) findViewById(R.id.newresident);
        newbuilding = (Button) findViewById(R.id.newbuilding);
        editresident = (Button) findViewById(R.id.edit_resident);
        editbuilding = (Button) findViewById(R.id.edit_building);
        editrentinfo = (Button) findViewById(R.id.security_deposit);
        rentreciev = (Button) findViewById(R.id.rent_received);


    }

    public void buttonOnClick(View view) {
        switch (view.getId()) {
            case R.id.newresident:
                // Code for button 1 click
                break;

            case R.id.newbuilding:
                // Code for button 2 click
                break;

            case R.id.edit_resident:
                // Code for button 3 click
                break;

            case R.id.edit_building:
                // Code for button 3 click
                break;

            case R.id.security_deposit:
                // Code for button 3 click
                break;

            case R.id.rent_received:
                // Code for button 3 click
                break;
        }
    }
}

