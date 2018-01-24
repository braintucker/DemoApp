package com.briantucker.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollarEditText = (EditText) findViewById(R.id.dollarEditText);

        Double dollarAmountDouble = Double.parseDouble(dollarEditText.getText().toString());

        Double poundAmount = dollarAmountDouble * 0.7;

        Toast.makeText(MainActivity.this, "£" + poundAmount.toString(), Toast.LENGTH_SHORT).show();

        Log.i("amount", dollarEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
