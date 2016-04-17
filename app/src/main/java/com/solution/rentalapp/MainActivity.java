package com.solution.rentalapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button newresident, newbuilding, editresident, editbuilding, editrentinfo, rentreciev;
    SharedPreferences loginPref;
    TextView welcomeMessage;
    String userName, password, displayMessage;
    private final static String USERNAME_KEY = "username";
    private final static String SAVED_KEY = "saved";
    private boolean isSaved = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /*   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        isSaved = loginPref.getBoolean(SAVED_KEY, false);
        userName = loginPref.getString(USERNAME_KEY, "");
        displayMessage = "Welcome Back " + userName;
        if (isSaved) {
            welcomeMessage.setText(displayMessage);
        }

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
                Intent inewresident = new Intent(getApplicationContext(), AddResidentActivity.class);
                startActivity(inewresident);
                break;

            case R.id.newbuilding:

                Intent inewbuilding = new Intent(getApplicationContext(), NewBuldAddActivity.class);
                startActivity(inewbuilding);
                break;

            case R.id.edit_resident:

                Intent ieditresident = new Intent(getApplicationContext(), EditExistResident.class);
                startActivity(ieditresident);
                break;

            case R.id.edit_building:
                Intent ieditbuilding = new Intent(getApplicationContext(), EditExistResident.class);
                startActivity(ieditbuilding);
                break;

            case R.id.security_deposit:
                // Code for button 3 click
                Intent ideposit = new Intent(getApplicationContext(), SecurityDeposityActivity.class);
                startActivity(ideposit);
                break;

            case R.id.rent_received:

                Intent irentreceive = new Intent(getApplicationContext(), RentRecivedActivity.class);
                startActivity(irentreceive);
                break;
        }
    }
}

