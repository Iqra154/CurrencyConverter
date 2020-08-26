package com.example.currencycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void OnClick1 (View view){
        //initialise
        EditText country = findViewById(R.id.editText1);
        EditText dollars = findViewById(R.id.editText2);
        TextView output = findViewById(R.id.textview1);

       //currency variables
        int ugsh =3672;
        int ksh= 108;
        int tzsh = 2320;
        //country variables
        String uganda= "uganda";
        String kenya = "kenya";
        String tanzania = "tanzania";

        //conversion
        String FinalCountry = country.getText().toString();
        int finalDollars = Integer.parseInt(dollars.getText().toString());

        //logic
        if(FinalCountry.equals(kenya)){
            int answer1 = finalDollars * ksh;
            output.setText(String.valueOf(answer1));
        }
        else if (FinalCountry.equals(uganda)){
            int answer2= finalDollars * ugsh;
            output.setText(String.valueOf(answer2));
        }
        else if (FinalCountry.equals(tanzania)){
            int answer3 = finalDollars * tzsh;
            output.setText(String.valueOf(answer3));
        }
        else{
            output.setText("Please try again!");
        }


    }
    public void OnClick2(View view){
        Intent intent1 = new Intent(this,Arithmetics.class);
        startActivity(intent1);
    }
}