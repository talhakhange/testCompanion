package com.example.android.testcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Week12Lab extends AppCompatActivity {

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
                Intent backButtonIntent = new Intent(Week12Lab.this, LabManual.class);
                startActivity(backButtonIntent);
                finish();
            }
        });


    }

    public void displayProbs(){
        String weekDetails = "Week #12 || ASP.NET & Assembly Language Progs.";
        TextView week1Details = (TextView) findViewById(R.id.week_details_field);
        week1Details.setText(weekDetails);

        String prob1 = "Problem #1";
        String problem1Details = "Write a Program in ASP.NET that has a form taking the user’s name as input. " +
                "Store this name in a permanent cookie & whenever the page is opened again, then value of the " +
                "name field should be attached with the cookie’s content. Also this Program contains a link to " +
                "delete all cookies that has created on the client’s computer.";
        TextView problem1 = (TextView) findViewById(R.id.prob1_title);
        problem1.setText(prob1);
        TextView prob1Details = (TextView) findViewById(R.id.prob1_details_field);
        prob1Details.setText(problem1Details);

        String prob2 = "Problem #2";
        String problem2Details ="Note: Draw the flow chart and write the Assembly Level Programs of the following:\n\n" +
                " Find 2’s compliment of a numbers stores in memory location 9002h for stop store the result in 9001h.";
        TextView problem2 = (TextView) findViewById(R.id.prob2_title);
        problem2.setText(prob2);
        TextView prob2Details = (TextView) findViewById(R.id.prob2_details_field);
        prob2Details.setText(problem2Details);

        String prob3 = "Problem #3";
        String problem3Details = "Write a program to read and compliment the content of the flag Register display the result at Port 02h.";
        TextView problem3 = (TextView) findViewById(R.id.prob3_title);
        problem3.setText(prob3);
        TextView prob3Details = (TextView) findViewById(R.id.prob3_details_field);
        prob3Details.setText(problem3Details);

        String prob4 = "Problem #4";
        String problem4Details = "Write a program to shift the 8 bit number available in Memory Location the right by 4 bit position.";
        TextView problem4 = (TextView) findViewById(R.id.prob4_title);
        problem4.setText(prob4);
        TextView prob4Details = (TextView) findViewById(R.id.prob4_details_field);
        prob4Details.setText(problem4Details);
    }

}

