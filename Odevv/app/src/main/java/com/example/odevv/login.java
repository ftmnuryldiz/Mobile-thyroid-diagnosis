package com.example.odevv;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    private FirebaseAuth auth;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        getSupportActionBar().setCustomView(R.layout.activity_actionbar);

    }



            public void signInClicked (View v) {

                auth = FirebaseAuth.getInstance();
                TextView textMail = findViewById(R.id.mail_et);
                String email = textMail.getText().toString();

                TextView textPassword = findViewById(R.id.password_et);
                String password = textPassword.getText().toString();
                if (email.equals("") || password.equals("")) {
                    Toast.makeText(login.this, "Enter email and password", Toast.LENGTH_LONG).show();
                }else {
                    auth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            Intent intent=new Intent(login.this, home.class);
                            startActivity(intent);
                            finish();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(login.this,e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        }
                    });
                }}
}





