package com.example.zad4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvGimnazija;
    TextView tvOdeljenje;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvGimnazija=(TextView)findViewById(R.id.idGimnazija);
        tvOdeljenje=(TextView)findViewById(R.id.idOdeljenja);
    }

    public void onClickGimnazija(View view){
        tvGimnazija.setText("radi");

    }
    public void onClickOdeljenje(View view){
        tvOdeljenje.setText("III5");
    }



}