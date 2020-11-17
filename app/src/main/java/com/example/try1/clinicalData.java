package com.example.try1;

import androidx.annotation.Nullable;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class clinicalData extends caseHistory {

    private static final int PICK_IMAGE_REQUEST = 1;
    private static final int SHOW_IMAGE_REQUEST = 1;

    private Button bBlood, bUrine, bECG, bEndo;
    private TextView tBlood, tUrine, tECG, tEndo;
    private Button bBlood1, bUrine1, bECG1, bEndo1;
    private Uri mImageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinical_data);

        bBlood = (Button) findViewById(R.id.ButBlood);
        bUrine = (Button) findViewById(R.id.butUrine);
        bECG = (Button) findViewById(R.id.butECG);
        bEndo = (Button) findViewById(R.id.butEndo);

        bBlood1 = (Button) findViewById(R.id.ButBlood1);
        bUrine1 = (Button) findViewById(R.id.butUrine1);
        bECG1 = (Button) findViewById(R.id.butECG1);
        bEndo1 = (Button) findViewById(R.id.butEndo1);

        tBlood = (TextView) findViewById(R.id.textBlood);
        tUrine = (TextView) findViewById(R.id.textUrine);
        tECG = (TextView) findViewById(R.id.textECG);
        tEndo = (TextView) findViewById(R.id.textEndo);

        bBlood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFileChooser();
            }
        });
        bUrine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFileChooser();
            }
        });
        bECG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFileChooser();
            }
        });
        bEndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFileChooser();
            }
        });

        bBlood1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(clinicalData.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        bUrine1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(clinicalData.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        bECG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(clinicalData.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        bEndo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(clinicalData.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });


    }
    private void openFileChooser() {

        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);

    }





    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK
                && data != null && data.getData() != null) {
            mImageUri =data.getData();


        }
    }
}