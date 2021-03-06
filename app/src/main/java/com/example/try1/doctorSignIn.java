package com.example.try1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class doctorSignIn extends AppCompatActivity {
    Button doclogin_btn2, moveToSignUp2;
    EditText username2, password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_sign_in);
        getSupportActionBar().hide();

        moveToSignUp2 = findViewById(R.id.docsignup_screen);
        moveToSignUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToDoctorSignPage();
            }
        });
    }

    public void loginUser(View view) {
        isUser();
    }

    private void isUser() {
        username2=findViewById(R.id.doclogin_username);
        password2=findViewById(R.id.doclogin_password);
        final String userEnteredUsername = username2.getEditableText().toString().trim();
        final String userEnteredPassword = password2.getEditableText().toString().trim();



        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("doctor");
        Query checkUser = reference.orderByChild("docusername").equalTo(userEnteredUsername);

        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    username2.setError(null);

                    String passwordFromDB = dataSnapshot.child(userEnteredUsername).child("docpassword").getValue(String.class);

                    if (Objects.equals(passwordFromDB, userEnteredPassword)) {
                        username2.setError(null);
                        //username.setErrorEnabled(false);
//
//                        doclogin_btn2 = findViewById(R.id.docbtnLogin);
//
//                        doclogin_btn2.setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                moveToDashPage();
//
//                            }
//                        });
                        Intent intent=new Intent(doctorSignIn.this,doctorSide.class);
                        startActivity(intent);
                        finish();
                    }
                    else {
                        password2.setError("Wrong Password");
                        password2.requestFocus();
                    }
                } else {
                    username2.setError("No such User exist");
                    username2.requestFocus();
                }
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
    private void moveToDoctorSignPage(){
        Intent intent=new Intent(doctorSignIn.this,doctorSignUp.class);
        //  finish();
        startActivity(intent);
//        Toast.makeText(getBaseContext(), "Sign in successfully" , Toast.LENGTH_SHORT ).show();

    }

    private void moveToDashPage(){
        Intent intent=new Intent(doctorSignIn.this,doctorSide.class);
        startActivity(intent);
    }

}