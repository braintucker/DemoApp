package com.briantucker.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void newPic(View view){

        ImageView image = (ImageView) findViewById(R.id.toolImageView);
        image.setImageResource(R.drawable.firebase);

        Log.i("Test", "Button was clicked");




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
