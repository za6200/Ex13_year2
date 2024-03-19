package com.example.ex13_year2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.spinner);
        String[] countries = {"USA", "China", "India", "Brazil", "Russia", "Japan", "Germany"};
        String[] capitals = {"Washington D.C.", "Beijing", "New Delhi", "Brasília", "Moscow", "Tokyo", "Berlin"};
        String[] populations = {"331M", "1441M", "138M", "214M", "146M", "126M", "83M"};
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, )
    }
}