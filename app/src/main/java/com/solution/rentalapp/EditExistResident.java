package com.solution.rentalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;

public class EditExistResident extends AppCompatActivity {
    SearchView searchView;
    Button logout, returnhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_exist_resident);
        logout = (Button) findViewById(R.id.logout);
        returnhome = (Button) findViewById(R.id.btnsubmit);
    }

    public void buttonOnClick(View view) {
        switch (view.getId()) {
            case R.id.logout:
                Intent logout = new Intent(EditExistResident.this, LoginActivity.class);
                startActivity(logout);
                break;
            case R.id.btnsubmit:
                Intent returnhome = new Intent(EditExistResident.this, MainActivity.class);
                startActivity(returnhome);
                break;
        }

       /* searchView=(SearchView) findViewById(R.id.searchView);
        searchView.setQueryHint("Search View");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getBaseContext(), query, Toast.LENGTH_LONG).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Toast.makeText(getBaseContext(), newText, Toast.LENGTH_LONG).show();
                return false;
            }
        });*/
    }
}
