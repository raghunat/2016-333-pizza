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
    int pizzaCount = 0;
    protected void addPizza(View view) {
        TextView counter = (TextView)findViewById(R.id.counter);
        pizzaCount += 1;
        counter.setText("" + pizzaCount);

    }
}
