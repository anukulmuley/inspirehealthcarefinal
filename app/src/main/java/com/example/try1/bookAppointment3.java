package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class bookAppointment3 extends AppCompatActivity {

    private Spinner spinner , spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_appointment3);

        spinner = findViewById(R.id.spinner);

        List<String> speciality = new ArrayList<>();
        speciality.add(0, "Select Specialist");
        speciality.add("Allergist");
        speciality.add("Anesthesiologist");
        speciality.add("Cardiologist");
        speciality.add("Dermatologist");
        speciality.add("Endocrinologist");
        speciality.add("Gastroenterologist");
        speciality.add("Hematologist");
        speciality.add("Immunologist");
        speciality.add("Internist");
        speciality.add("Neurologist");
        speciality.add("Pulmonologist");
        speciality.add("Oncologist");
        speciality.add("Pediatrician");
        speciality.add("Psychiatrist");
        speciality.add("Radiologist");
        speciality.add("Rheumatologist");
        speciality.add("Urologist");

        //Style and populate the spinner
        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,speciality);

        //dropdown layout style
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //attaching dataAdapter to spinner
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position).equals("Select Speciality")) {
                    //do nothing
                } else {
                    //on selecting a spinner item
                    String item = parent.getItemAtPosition(position).toString();

                    //show selected spinner item
                    Toast.makeText(parent.getContext(), "Selected" + item, Toast.LENGTH_SHORT).show();

                    //anything
                }
            }


            private void  onNothingSelected(AdapterView<?> parent){
               // TODO Auto-generated method stub
            }

        });
    }
}