package com.example.arrayadapterspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}