package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class showBookedAppointment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_booked_appointment);
        getSupportActionBar().hide();
    }
}