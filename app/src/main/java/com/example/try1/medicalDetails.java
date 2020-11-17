package com.example.try1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class medicalDetails extends caseHistory {

    private EditText editMedicalDescription;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_details);

        editMedicalDescription = (EditText) findViewById(R.id.editMedicalDescription);

        button1 = (Button) findViewById(R.id.saveMedical);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("medicalDetails");

                String description = editMedicalDescription.getEditableText().toString();

                helperClass medical = new helperClass(description);

                myRef.child(description).setValue(medical);
                Toast.makeText(medicalDetails.this, "Saved", Toast.LENGTH_SHORT).show();

            }
        });

    }


}
