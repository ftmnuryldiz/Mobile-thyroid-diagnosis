package com.example.odevv;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import com.google.android.material.button.MaterialButton;

import java.util.Locale;

public class Languages extends AppCompatActivity {


    private void setlang(Activity activity, String localeCode){
        Locale locale = new Locale(localeCode);
        Locale.setDefault(locale);
        Resources resources = activity.getResources();
        Configuration conf = resources.getConfiguration();
        conf.setLocale(locale);
        resources.updateConfiguration(conf,resources.getDisplayMetrics());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
        getApplicationContext();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.activity_actionbar);




        AppCompatImageButton goback = (AppCompatImageButton) findViewById(R.id.backbutton1);
        MaterialButton eng =  findViewById(R.id.language_en);
        MaterialButton tr =  findViewById(R.id.language_tr);

        goback.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override

            public void onClick(View v) {
                // finish();
                onBackPressed();

            }

        });

        eng.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                setlang(Languages.this,"en");
                Intent myIntent = new Intent(v.getContext(), MainActivity.class);
                // myIntent.setAction(Intent.ACTION_SEND);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(myIntent);
            }

        });


        tr.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                setlang(Languages.this,"tr");
                Intent myIntent = new Intent(v.getContext(), MainActivity.class);
                // myIntent.setAction(Intent.ACTION_SEND);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(myIntent);
            }

        });

    }
}