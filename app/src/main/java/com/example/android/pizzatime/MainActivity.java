package com.example.android.pizzatime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*private int pizzaCount = 0;
    protected void addPizza(View view) {
        TextView counter = (TextView)findViewById(R.id.counter);
        pizzaCount += 1;
        counter.setText("" + pizzaCount);
    }
    */
    private int pepperoniCount = 0;
    protected void addPepperoni(View view) {
        TextView counter = (TextView)findViewById(R.id.pepperoni_counter);
        pepperoniCount += 1;
        counter.setText("" + pepperoniCount);

    }
    private int mushroomCount = 0;
    protected void addMushroom(View view) {
        TextView counter = (TextView)findViewById(R.id.mushroom_counter);
        mushroomCount += 1;
        counter.setText("" + mushroomCount);

    }
    private int supremeCount = 0;
    protected void addSupreme(View view) {
        TextView counter = (TextView)findViewById(R.id.supreme_counter);
        supremeCount += 1;
        counter.setText("" + supremeCount);

    }

    protected void calculateOrder(View view){
        int pepperoniPrice = 6;
        int mushroomPrice = 7;
        int supremePrice = 8;

        int total = pepperoniPrice * pepperoniCount;
        total += mushroomPrice * mushroomCount;
        total += supremePrice * supremeCount;

        TextView totalTextView = (TextView)findViewById(R.id.order_total);
        totalTextView.setText("" + total);
    }
}
