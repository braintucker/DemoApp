package com.briantucker.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void submitFunction(View view){


        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);

        Toast.makeText(MainActivity.this, "Hi there, " + nameEditText.getText().toString() + "!", Toast.LENGTH_LONG).show();

        Log.i("Name", nameEditText.getText().toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
