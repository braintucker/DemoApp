package com.briantucker.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string){
        

    }

    public void guess(View view) {


        EditText guessNum = (EditText) findViewById(R.id.guessEditText);

        int guessInt = Integer.parseInt(guessNum.getText().toString());

        if(guessInt < randomNumber){
            Toast.makeText(MainActivity.this, "Your number is lower!", Toast.LENGTH_SHORT).show();
        }
        else if(guessInt > randomNumber){
            Toast.makeText(MainActivity.this, "Your number is higher!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "You got it! Try Again!", Toast.LENGTH_SHORT).show();

            Random rand = new Random();

            randomNumber = rand.nextInt(20) + 1;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
    }
}
