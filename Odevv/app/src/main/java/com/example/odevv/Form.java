package com.example.odevv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;



public class Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        AppCompatButton diagnose = (AppCompatButton)findViewById(R.id.diagnose);


        diagnose.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override

            public void onClick(View v) {

                //bu butona tıklayınca girdiği değerleri if else yapısına sokup hiper mi hipo mu normal mi kontrol et sonra da alttaki toast'ı hepsine uyarla
             // hipertiroit için   Toast.makeText(Form.this,R.string.hiper,Toast.LENGTH_SHORT).show();
              //hipotiroit için   Toast.makeText(Form.this,R.string.hipo,Toast.LENGTH_SHORT).show();
              // normal için  Toast.makeText(Form.this,R.string.normal,Toast.LENGTH_SHORT).show();


            }

        });
    }
}

