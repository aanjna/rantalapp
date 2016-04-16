package com.solution.rentalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class RentRecivedActivity extends AppCompatActivity {
    TextView rname, address;
    Button returnhome, logout, notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_recived);

        rname = (TextView) findViewById(R.id.tv_rname);
        address = (TextView) findViewById(R.id.tv_address);
        notification = (Button) findViewById(R.id.notification);
        returnhome = (Button) findViewById(R.id.btnsubmit);
        logout = (Button) findViewById(R.id.logout);
    }
}
