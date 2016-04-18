package com.solution.rentalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AddExistBuildingActivity extends AppCompatActivity {
    Button logout, returnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityadd_exist_building);
        logout = (Button) findViewById(R.id.logout);
        returnhome = (Button) findViewById(R.id.btnsubmit);
    }

    public void buttonOnClick(View view) {
        switch (view.getId()) {
            case R.id.logout:
                Intent logout = new Intent(AddExistBuildingActivity.this, LoginActivity.class);
                startActivity(logout);
                break;
            case R.id.btnsubmit:
                Intent returnhome = new Intent(AddExistBuildingActivity.this, MainActivity.class);
                startActivity(returnhome);
                break;
        }


    }
}
