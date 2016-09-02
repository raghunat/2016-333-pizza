package com.example.android.pizzatime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pizzaCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void addPizza(View view)
    {
        TextView counter = (TextView)findViewById(R.id.counter);
        pizzaCount ++;
        counter.setText("" + pizzaCount);
    }
}
