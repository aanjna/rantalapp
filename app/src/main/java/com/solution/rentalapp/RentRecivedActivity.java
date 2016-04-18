package com.solution.rentalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RentRecivedActivity extends AppCompatActivity {
    TextView rname, address;
    Button returnhome, notification, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_recived);

        rname = (TextView) findViewById(R.id.tv_rname);
        address = (TextView) findViewById(R.id.tv_address);
        notification = (Button) findViewById(R.id.notification);
        returnhome = (Button) findViewById(R.id.btnsubmit);
        logout = (Button) findViewById(R.id.logout);
        returnhome = (Button) findViewById(R.id.btnsubmit);
        notification = (Button)findViewById(R.id.notification);
    }

    public void buttonOnClick(View view) {
        switch (view.getId()) {
            case R.id.notification:
                Toast.makeText(this, "Resident xyz just paid xx$. Is this correct?", Toast.LENGTH_SHORT).show();
               // Intent notify = new Intent(RentRecivedActivity.this, MainActivity.class);
               // startActivity(notify);
                break;
            case R.id.logout:
                Intent logout = new Intent(RentRecivedActivity.this, LoginActivity.class);
                startActivity(logout);
                break;
            case R.id.btnsubmit:
                Intent returnhome = new Intent(RentRecivedActivity.this, MainActivity.class);
                startActivity(returnhome);
                break;
        }
    }
}
