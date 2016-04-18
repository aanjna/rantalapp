package com.solution.rentalapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "Login";
    Button btnlogin;
    EditText et_username, et_password;
    TextView tv_forgetpass;
    SharedPreferences loginPref;
    SharedPreferences.Editor loginEditor;
    String userName, password;
    private final static String USERNAME_KEY = "username";
    private final static String PASSWORD_KEY = "password";
    private final static String SAVED_KEY = "saved";
    private boolean isSaved = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        init();
       /* isSaved = loginPref.getBoolean(SAVED_KEY, false);
        if (isSaved) {
            fillData();
        }*/
    }

    private void init() {
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        btnlogin = (Button) findViewById(R.id.b_login);
        tv_forgetpass = (TextView) findViewById(R.id.tv_forgetpass);

        loginPref = getSharedPreferences("loginPrefs", MODE_PRIVATE);
        loginEditor = loginPref.edit();

        btnlogin.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                           /* userName = et_username.getText().toString();
                                            password = et_password.getText().toString();
                                            saveDate(userName, password);
                                            login();*/

                                            Intent login = new Intent(LoginActivity.this, MainActivity.class);
                                            startActivity(login);
                                        }
                                    }

        );
        tv_forgetpass.setOnClickListener(new View.OnClickListener()

                                         {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent i = new Intent(LoginActivity.this, MainActivity.class);
                                                 startActivity(i);
                                             }
                                         }
        );
    }

    private void fillData() {
        userName = loginPref.getString(USERNAME_KEY, "username");
        password = loginPref.getString(PASSWORD_KEY, "password");
        et_password.setText(password);
        et_username.setText(userName);
    }

    private void saveDate(String userName, String password) {
        loginEditor.putString(USERNAME_KEY, userName);
        loginEditor.putString(PASSWORD_KEY, password);
        loginEditor.putBoolean(SAVED_KEY, isSaved);
        loginEditor.commit();
    }

    private void login() {
        Log.d(TAG, "Login");

        if (!validate()) {
            onLoginFailed();
            return;
        }

        btnlogin.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this,
                R.style.AppTheme);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();

        String email = et_username.getText().toString();
        String password = et_password.getText().toString();

        // TODO: Implement your own authentication logic here.

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onLoginSuccess or onLoginFailed
                        onLoginSuccess();
                        // onLoginFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
    }

    public void onLoginSuccess() {
        btnlogin.setEnabled(true);
        finish();
    }

    public void onLoginFailed() {
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();

        btnlogin.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String email = et_username.getText().toString();
        String password = et_password.getText().toString();

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            et_username.setError("enter a valid email address");
            valid = false;
        } else {
            et_username.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            et_password.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            et_password.setError(null);
        }

        return valid;
    }
}


