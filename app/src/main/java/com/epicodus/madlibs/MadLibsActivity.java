package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibsActivity extends AppCompatActivity {
    private TextView mUsernameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs);
        mUsernameEditText = (TextView) findViewById(R.id.usernameTextView);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        mUsernameEditText.setText("Here are your words" + " " + username);
    }
}