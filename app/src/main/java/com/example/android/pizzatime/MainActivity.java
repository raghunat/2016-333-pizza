package com.example.android.pizzatime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pizzaCount = 0;
    private int soyCount =0;
    private int pepperoniCount =0;
    private int cheeseCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    protected void addPizza(View view) {
        TextView counter = (TextView)findViewById(R.id.counter);
        pizzaCount +=1;
        counter.setText("" + pizzaCount);
    }

    protected void addCheese(View view) {
        TextView counter = (TextView) findViewById(R.id.counter);
        cheeseCount += 1;
        counter.setText("" + cheeseCount);
    }

    protected void addSoy(View view) {
        TextView counter = (TextView) findViewById(R.id.counter);
        soyCount += 1;
        counter.setText("" + soyCount);
    }

    protected void addPepperoni(View view) {
        TextView counter = (TextView) findViewById(R.id.counter);
        pepperoniCount += 1;
        counter.setText("" + pepperoniCount);
    }

    protected void calculateOrder(View view) {
        int cheesePrice = 5;
        int pepperoniPrice = 6;
        int soyPrice = 7;

        int total = cheesePrice * cheeseCount;
        total += pepperoniPrice * pepperoniPrice;
        total += soyPrice * soyCount;

        TextView totalTextView = (TextView)findViewById(R.id.order_total);
        totalTextView.setText("" + total);
    }
}