package com.example.android.testcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Week11Lab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_week9_lab);
        displayProbs();
        ImageButton backButton = (ImageButton) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backButtonIntent = new Intent(Week11Lab.this, LabManual.class);
                startActivity(backButtonIntent);
                finish();
            }
        });


    }

    public void displayProbs(){
        String weekDetails = "Week #11 || ASP.NET & Assembly Language Progs.";
        TextView week1Details = (TextView) findViewById(R.id.week_details_field);
        week1Details.setText(weekDetails);

        String prob1 = "Problem #1";
        String problem1Details = "Use ASP.NET to declare one TextBox control, one Button control, " +
                "one Label control, and one RegularExpressionValidator control in an .aspx file. " +
                "The submit() function checks if the page is valid. If it is valid, it returns " +
                "\"The page is valid!\" in the Label control. If it is not valid, it returns " +
                "\"The page is not valid!\" in the Label control. If validation fails, the text " +
                "\"The zip code must be 5 numeric digits!" +
                "\" will be displayed in the RegularExpressionValidator control.";
        TextView problem1 = (TextView) findViewById(R.id.prob1_title);
        problem1.setText(prob1);
        TextView prob1Details = (TextView) findViewById(R.id.prob1_details_field);
        prob1Details.setText(problem1Details);

        String prob2 = "Problem #2";
        String problem2Details ="Note: Draw the flow chart and write the Assembly Level Programs of the following:\n\n" +
                "Subtract the contents of the memory location 9001h from 9000h and store the result at 9002h.";
        TextView problem2 = (TextView) findViewById(R.id.prob2_title);
        problem2.setText(prob2);
        TextView prob2Details = (TextView) findViewById(R.id.prob2_details_field);
        prob2Details.setText(problem2Details);

        String prob3 = "Problem #3";
        String problem3Details = "Two 16 bit numbers are available in memory location 9000h and 9001h the others set " +
                "in 9002h and 9003h where the MSB are 9001h and 9003h for add two numbers and save result in 9004h and " +
                "9005h, the MSB in 9005h.";
        TextView problem3 = (TextView) findViewById(R.id.prob3_title);
        problem3.setText(prob3);
        TextView prob3Details = (TextView) findViewById(R.id.prob3_details_field);
        prob3Details.setText(problem3Details);

        String prob4 = "Problem #4";
        String problem4Details = "Write a program to add two 16 bit numbers using Double Addition (DAD).";
        TextView problem4 = (TextView) findViewById(R.id.prob4_title);
        problem4.setText(prob4);
        TextView prob4Details = (TextView) findViewById(R.id.prob4_details_field);
        prob4Details.setText(problem4Details);
    }

}
