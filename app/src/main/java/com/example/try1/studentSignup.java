package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class studentSignup extends AppCompatActivity {
    EditText regName, regUsername, regEmail, regPhoneNo, regPassword;
    Button regBtn, regToLoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_signup);
        getSupportActionBar().hide();

        regName=findViewById(R.id.reg_PatientName);
        regUsername=findViewById(R.id.reg_username);
        regEmail=findViewById(R.id.reg_email);
        regPhoneNo=findViewById(R.id.reg_phoneNo);
        regPassword=findViewById(R.id.reg_password);

        regBtn=findViewById(R.id.reg_button);

        regBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                FirebaseDatabase rootNode= FirebaseDatabase.getInstance();
                DatabaseReference ref=rootNode.getReference("patients");

                //get all the values
                String name=regName.getEditableText().toString();
                String username=regUsername.getEditableText().toString();
                String email=regEmail.getEditableText().toString();
                String phoneNo=regPhoneNo.getEditableText().toString();
                String password=regPassword.getEditableText().toString();


                UserHelperClass helperClass=new UserHelperClass(name,username,password,phoneNo,email);


                ref.child(username).setValue(helperClass);



                finish();
                startActivity(getIntent());
                Toast.makeText(getBaseContext(), "Added SuccessFully" , Toast.LENGTH_SHORT ).show();

            }

        });
    }
}