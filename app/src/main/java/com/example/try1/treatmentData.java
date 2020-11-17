package com.example.try1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class treatmentData extends caseHistory {

    TextView eMedicine, eMorning , eAfternoon ,eEvening;
    EditText medicine1, morning1, afternoon1, evening1;
    EditText medicine2, morning2, afternoon2, evening2;
    EditText medicine3, morning3, afternoon3, evening3;
    EditText medicine4, morning4, afternoon4, evening4;
    EditText medicine5, morning5, afternoon5, evening5;
    EditText medicine6, morning6, afternoon6, evening6;
    Button saveMedicine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment_data);

        eMedicine = (TextView) findViewById(R.id.medicine);
        eMorning = (TextView) findViewById(R.id.morning);
        eAfternoon = (TextView) findViewById(R.id.afternoon);
        eEvening = (TextView) findViewById(R.id.evening);

        medicine1 = (EditText) findViewById(R.id.medicine1);
        morning1 = (EditText) findViewById(R.id.morning1);
        afternoon1 = (EditText) findViewById(R.id.afternoon1);
        evening1 = (EditText) findViewById(R.id.evening1);

        medicine2 = (EditText) findViewById(R.id.medicine2);
        morning2 = (EditText) findViewById(R.id.morning2);
        afternoon2 = (EditText) findViewById(R.id.afternoon2);
        evening2 = (EditText) findViewById(R.id.evening2);

        medicine3 = (EditText) findViewById(R.id.medicine3);
        morning3 = (EditText) findViewById(R.id.morning3);
        afternoon3 = (EditText) findViewById(R.id.afternoon3);
        evening3 = (EditText) findViewById(R.id.evening3);

        medicine4 = (EditText) findViewById(R.id.medicine4);
        morning4 = (EditText) findViewById(R.id.morning4);
        afternoon4 = (EditText) findViewById(R.id.afternoon4);
        evening4 = (EditText) findViewById(R.id.evening4);

        medicine5 = (EditText) findViewById(R.id.medicine5);
        morning5 = (EditText) findViewById(R.id.morning5);
        afternoon5 = (EditText) findViewById(R.id.afternoon5);
        evening5 = (EditText) findViewById(R.id.evening5);

        medicine6 = (EditText) findViewById(R.id.medicine6);
        morning6 = (EditText) findViewById(R.id.morning6);
        afternoon6 = (EditText) findViewById(R.id.afternoon6);
        evening6 = (EditText) findViewById(R.id.evening6);

        saveMedicine = (Button) findViewById(R.id.saveMedicine);

        saveMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference myRef = db.getReference("Medicines");


                Toast.makeText(treatmentData.this, "Saved", Toast.LENGTH_SHORT).show();
            }
        });


    }

}