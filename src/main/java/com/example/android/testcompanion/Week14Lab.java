package com.example.android.testcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Week14Lab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_week14_lab);
        displayProbs();
        ImageButton backButton = (ImageButton) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backButtonIntent = new Intent(Week14Lab.this, LabManual.class);
                startActivity(backButtonIntent);
                finish();
            }
        });
    }

    public void displayProbs(){
        String weekDetails = "Week #14 || Assembly Level Progs. ";
        TextView week1Details = (TextView) findViewById(R.id.week_details_field);
        week1Details.setText(weekDetails);

        String note = "Note: Draw the flow chart and write the Assembly Level Programs of the following: ";
        TextView notetext = (TextView) findViewById(R.id.note_field);
        notetext.setText(note);

        String prob1 = "Problem #1";
        String problem1Details = "Write a Program to shift a 16 bit numbers " +
                "Right by 1bit. Assume that data is in memory location at 9000h " +
                "and 9001h respectively and store the result back in 9002h and 9003h.";
        TextView problem1 = (TextView) findViewById(R.id.prob1_title);
        problem1.setText(prob1);
        TextView prob1Details = (TextView) findViewById(R.id.prob1_details_field);
        prob1Details.setText(problem1Details);

        String prob2 = "Problem #2";
        String problem2Details = "Write a Program to count number of 1’s in a register and display the result at port 02h.";
        TextView problem2 = (TextView) findViewById(R.id.prob2_title);
        problem2.setText(prob2);
        TextView prob2Details = (TextView) findViewById(R.id.prob2_details_field);
        prob2Details.setText(problem2Details);

        String prob3 = "Problem #3";
        String problem3Details = "Write a Program to transfer 10 Bytes of data form 1 memory location to another. " +
                "The source block begins at 9000h whereas the destination block begins at 9100h";
        TextView problem3 = (TextView) findViewById(R.id.prob3_title);
        problem3.setText(prob3);
        TextView prob3Details = (TextView) findViewById(R.id.prob3_details_field);
        prob3Details.setText(problem3Details);

        String prob4 = "Problem #4";
        String problem4Details = "Write a program two 8 bit numbers are available at memory location 9000h , " +
                "multiply them by repeatedly addition and store the result in memory location 9002h and 9003h.";
        TextView problem4 = (TextView) findViewById(R.id.prob4_title);
        problem4.setText(prob4);
        TextView prob4Details = (TextView) findViewById(R.id.prob4_details_field);
        prob4Details.setText(problem4Details);

        String prob5 = "Problem #5";
        String problem5Details = "Write a Program to find the sum of 10 numbers available from memory location 8000h. " +
                "To onwards and store result at 8100h.";
        TextView problem5 = (TextView) findViewById(R.id.prob5_title);
        problem5.setText(prob5);
        TextView prob5Details = (TextView) findViewById(R.id.prob5_details_field);
        prob5Details.setText(problem5Details);

        String prob6 = "Problem #6";
        String problem6Details = "Write a Program to find the count of negative numbers in a series of 10 numbers stores " +
                "of memory location 8000h and onwards store the result at 8100h.";
        TextView problem6 = (TextView) findViewById(R.id.prob6_title);
        problem6.setText(prob6);
        TextView prob6Details = (TextView) findViewById(R.id.prob6_details_field);
        prob6Details.setText(problem6Details);

        String prob7 = "Problem #7";
        String problem7Details = "Write a Program to add the corresponding elements of 2 arrays having 10, " +
                "8bit numbers each and stores the result in 3rd array. The arrays start at 9000h, 9100h and 9200h.";
        TextView problem7 = (TextView) findViewById(R.id.prob7_title);
        problem7.setText(prob7);
        TextView prob7Details = (TextView) findViewById(R.id.prob7_details_field);
        prob7Details.setText(problem7Details);
    }

}
