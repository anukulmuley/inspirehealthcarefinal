package com.example.try1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class medicalDetailsP extends AppCompatActivity {

    private TextView MedicalDescription,healthIDP;
    private DatabaseReference database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_details_p);

        MedicalDescription = (TextView) findViewById(R.id.MedicalDescription);
        healthIDP = (TextView) findViewById(R.id.HealthIdP);

        database = FirebaseDatabase.getInstance().getReference("ClinicalReports").child("medical");


    }

    @Override
    protected void onStart() {
        super.onStart();
        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                helperClass medical= dataSnapshot.getValue(helperClass.class);
                MedicalDescription.setText((CharSequence) medical);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value

            }
        });
    }
}