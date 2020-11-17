package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class treatmentDataP extends AppCompatActivity {

    DatabaseReference reference;
    TextView eMedicineP, eMorningP , eAfternoonP ,eEveningP;
    TextView medicine1P, morning1P, afternoon1P, evening1P;
    TextView medicine2P, morning2P, afternoon2P, evening2P;
    TextView medicine3P, morning3P, afternoon3P, evening3P;
    TextView medicine4P, morning4P, afternoon4P, evening4P;
    TextView medicine5P, morning5P, afternoon5P, evening5P;
    TextView medicine6P, morning6P, afternoon6P, evening6P;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment_data_p);

        eMedicineP = (TextView) findViewById(R.id.medicineP);
        eMorningP = (TextView) findViewById(R.id.morningP);
        eAfternoonP = (TextView) findViewById(R.id.afternoonP);
        eEveningP = (TextView) findViewById(R.id.eveningP);

        medicine1P = (TextView) findViewById(R.id.medicine1P);
        morning1P = (TextView) findViewById(R.id.morning1P);
        afternoon1P = (TextView) findViewById(R.id.afternoon1P);
        evening1P = (TextView) findViewById(R.id.evening1P);

        medicine2P = (TextView) findViewById(R.id.medicine2P);
        morning2P = (TextView) findViewById(R.id.morning2P);
        afternoon2P = (TextView) findViewById(R.id.afternoon2P);
        evening2P = (TextView) findViewById(R.id.evening2P);

        medicine3P = (TextView) findViewById(R.id.medicine3P);
        morning3P = (TextView) findViewById(R.id.morning3P);
        afternoon3P = (TextView) findViewById(R.id.afternoon3P);
        evening3P = (TextView) findViewById(R.id.evening3P);

        medicine4P = (TextView) findViewById(R.id.medicine4P);
        morning4P = (TextView) findViewById(R.id.morning4P);
        afternoon4P = (TextView) findViewById(R.id.afternoon4P);
        evening4P = (TextView) findViewById(R.id.evening4P);

        medicine5P = (TextView) findViewById(R.id.medicine5P);
        morning5P = (TextView) findViewById(R.id.morning5P);
        afternoon5P = (TextView) findViewById(R.id.afternoon5P);
        evening5P = (TextView) findViewById(R.id.evening5P);

        medicine6P = (TextView) findViewById(R.id.medicine6P);
        morning6P = (TextView) findViewById(R.id.morning6P);
        afternoon6P = (TextView) findViewById(R.id.afternoon6P);
        evening6P = (TextView) findViewById(R.id.evening6P);

        reference = FirebaseDatabase.getInstance().getReference().child("casestudy").child("Medical").child("");



    }

}