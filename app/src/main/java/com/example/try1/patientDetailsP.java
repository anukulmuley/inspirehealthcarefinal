package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class patientDetailsP extends AppCompatActivity {

    private TextView tName, tId, tAge, tSex, tDob, tDate;
    private TextView eName, eId, eAge, eSex, eDob, eDate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details_p);


        tName = (TextView) findViewById(R.id.textNameP);
        tId = (TextView) findViewById(R.id.textHealthidP);
        tAge = (TextView) findViewById(R.id.textAgeP);
        tSex = (TextView) findViewById(R.id.textSexP);
        tDate = (TextView) findViewById(R.id.textDateP);
        tDob = (TextView) findViewById(R.id.textDoBP);



        eName = (TextView) findViewById(R.id.editNameP);
        eId = (TextView) findViewById(R.id.editHealthIdP);
        eAge = (TextView) findViewById(R.id.editAgeP);
        eSex = (TextView) findViewById(R.id.editSexP);
        eDob = (TextView) findViewById(R.id.editDoBP);
        eDate = (TextView) findViewById(R.id.editDateP);


    }
}