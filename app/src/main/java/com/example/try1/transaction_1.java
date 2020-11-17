package com.example.try1;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
public class transaction_1 extends AppCompatActivity {

    private EditText mId, mPname, mPhone, mDname, mDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_1);
        getSupportActionBar().hide();

        mId = findViewById(R.id.etid);
        mPname = findViewById(R.id.etpname);
        mPhone = findViewById(R.id.etphone);
        mDname = findViewById(R.id.etdname);
        mDate = findViewById(R.id.etdate);

    }
}