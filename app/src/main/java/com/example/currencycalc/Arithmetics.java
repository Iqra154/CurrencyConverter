package com.example.currencycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Arithmetics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetics);
    }
    public void OnClick3(View view){
        //initialise
        EditText money = findViewById(R.id.editTextPerson);
        TextView output = findViewById(R.id.textView);
        //accept input
        int FinMoney = Integer.parseInt(money.getText().toString());
        //logic
        if(FinMoney >=1000){
            double total = FinMoney * 0.86;
            output.setText(String.valueOf(total));
        }
        else{
            double total1 = FinMoney * 0.98;
            output.setText(String.valueOf(total1));
        }
    }
}