package com.example.odevv;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {
    private FirebaseAuth auth;
    Button logup2;
    EditText name, email,password,surname;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        getSupportActionBar().setCustomView(R.layout.activity_actionbar);

        email = findViewById(R.id.login_mail);
        password = findViewById(R.id.login_password);
        name=findViewById(R.id.login_name);
        surname=findViewById(R.id.login_surname);

    }


        public void signUpClicked(View view){
            auth= FirebaseAuth.getInstance();
            String userName=name.getText().toString();
            String userSurname=surname.getText().toString();
            String userPassword=password.getText().toString();
            String userEmail=email.getText().toString();

      if(TextUtils.isEmpty(userName)){
          Toast.makeText(this,"Enter Name!", Toast.LENGTH_LONG ).show();
     return;
      }
            if(TextUtils.isEmpty(userSurname)){
                Toast.makeText(this,"Enter Surname!", Toast.LENGTH_LONG ).show();
          return;
            }
            if(TextUtils.isEmpty(userEmail)){
                Toast.makeText(this,"Enter Email Adress!", Toast.LENGTH_LONG ).show();
           return;
            }
            if(TextUtils.isEmpty(userPassword)){
                Toast.makeText(this,"Enter Password!", Toast.LENGTH_LONG ).show();
            return;
            }
if(userPassword.length()<6){
    Toast.makeText(this, "Password too short, enter minimum 6 characters",Toast.LENGTH_LONG).show();
}



        auth.createUserWithEmailAndPassword(userEmail, userPassword).addOnCompleteListener(register.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(register.this, "Sucessfully Register.",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(register.this, "Registration Failed."+task.getException(),Toast.LENGTH_LONG).show();


                }
            }
        });



    }
    }
