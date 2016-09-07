package com.example.android.pizzatime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pizzaCount = 0;
    private int cheeseCount = 0;
    private int pepCount = 0;
    private int soyCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void addPizza(View view){
        TextView counter = (TextView)findViewById(R.id.counter);
        pizzaCount += 1;
        counter.setText("" + pizzaCount);
    }

    protected void addCheese(View view){
        TextView counter = (TextView)findViewById(R.id.cheese_counter);
        cheeseCount += 1;
        counter.setText("" + cheeseCount);
    }

    protected void addPepperoni(View view){
        TextView counter = (TextView)findViewById(R.id.pep_counter);
        pepCount += 1;
        counter.setText("" + pepCount);
    }

    protected void addSoy(View view){
        TextView counter = (TextView)findViewById(R.id.soy_counter);
        soyCount += 1;
        counter.setText("" + soyCount);
    }




}
