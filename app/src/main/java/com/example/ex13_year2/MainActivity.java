package com.example.ex13_year2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView textView;
    Spinner spinner;

    String[] countries = {"USA", "China", "India", "Brazil", "Russia", "Japan", "Germany"};
    String[] capitals = {"Washington D.C.", "Beijing", "New Delhi", "Brasília", "Moscow", "Tokyo", "Berlin"};
    String[] populations = {"331M", "1441M", "138M", "214M", "146M", "126M", "83M"};
    int[] flags = {R.drawable.usa, R.drawable.china, R.drawable.india, R.drawable.brazil, R.drawable.russia, R.drawable.japan, R.drawable.germany};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.spinner);

        SpinnerAdapt adp = new SpinnerAdapt(this, flags, countries, capitals);
        spinner.setAdapter(adp);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        textView.setText("Country Name: " + countries[i] + "\nCountry Capital: " + capitals[i] + "\nCountry Population: " + populations[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // Handle case when nothing is selected
    }
}
