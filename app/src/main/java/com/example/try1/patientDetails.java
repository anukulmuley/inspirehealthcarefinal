package com.example.try1;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class patientDetails extends caseHistory {

    private TextView tName, tId, tAge, tSex, tDob, tDate;
    private EditText eName, eId, eAge, eSex, eDob, eDate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);


        tName = (TextView) findViewById(R.id.textName);
        tId = (TextView) findViewById(R.id.textHealthid);
        tAge = (TextView) findViewById(R.id.textAge);
        tSex = (TextView) findViewById(R.id.textSex);
        tDate = (TextView) findViewById(R.id.textDate);
        tDob = (TextView) findViewById(R.id.textDoB);



        eName = (EditText) findViewById(R.id.editName);
        eId = (EditText) findViewById(R.id.editHealthId);
        eAge = (EditText) findViewById(R.id.editAge);
        eSex = (EditText) findViewById(R.id.editSex);
        eDob = (EditText) findViewById(R.id.editDoB);
        eDate = (EditText) findViewById(R.id.editDate);


    }
}