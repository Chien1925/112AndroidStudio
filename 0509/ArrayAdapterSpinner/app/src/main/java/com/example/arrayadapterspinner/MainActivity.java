package com.example.arrayadapterspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner drink,temp;
    private TextView txv;
    private String[] tempset1={"冰","去冰","溫"};
    private String[] tempset2={"冰","去冰"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv=(TextView) findViewById(R.id.order);
        temp=(Spinner) findViewById(R.id.temp);

        drink=(Spinner) findViewById(R.id.drink);
        drink.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[]tempSet;
                if(position==3)
                    tempSet=tempset2;
                else
                    tempSet=tempset1;

                ArrayAdapter<String>tempAd=
                        new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,tempSet);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}