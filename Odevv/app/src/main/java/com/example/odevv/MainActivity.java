package com.example.odevv;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends Languages {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getApplicationContext();
        getIntent();






        ImageButton lang = (ImageButton)findViewById(R.id.languages);

        Button logup=(Button)findViewById(R.id.logup);


       ;

        logup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentt=new Intent(v.getContext(), login.class);


            }
        });


        lang.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override

            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Languages.class);
                MainActivity.super.startActivity(myIntent);
            }

        });





    }



}