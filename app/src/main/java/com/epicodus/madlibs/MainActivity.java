package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mMadLibsButton;
    private EditText mUsernameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUsernameEditText = (EditText) findViewById(R.id.usernameEditText);
        mMadLibsButton = (Button) findViewById(R.id.madLibsButton);
        mMadLibsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String location = mUsernameEditText.getText().toString();
                Log.d(TAG, location);
                Intent intent = new Intent(MainActivity.this, MadLibsActivity.class);
                startActivity(intent);
            }
        });
    }
}