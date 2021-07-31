package com.example.android.testcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Week7Lab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_week6_7_8_lab);
        displayProbs();

        ImageButton backButton = (ImageButton) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backButtonIntent = new Intent(Week7Lab.this, LabManual.class);
                startActivity(backButtonIntent);
                finish();
            }
        });
    }

    public void displayProbs(){
        String weekDetails = "Week #7 || PHP problems";
        TextView week1Details = (TextView) findViewById(R.id.week_details_field);
        week1Details.setText(weekDetails);

        String prob1 = "Problem #1 || PHP";
        String problem1Details = "Write a PHP script to accept username and password. " +
                "\nIf in the first three chances, username and password entered is correct, " +
                "then display second form, otherwise display error message. " +
                "If the user doesn’t enter information within a specified time limit, expire his session and give a warning.";
        TextView problem1 = (TextView) findViewById(R.id.prob1_title);
        problem1.setText(prob1);
        TextView prob1Details = (TextView) findViewById(R.id.prob1_details_field);
        prob1Details.setText(problem1Details);

        String prob2 = "Problem #2 || PHP";
        String problem2Details = "Create a PHP program to accept customer information (name, address, phno)." +
                "\nOnce the customer information is accepted, accept product information in the next form " +
                "(Product name, qty, rate). " +
                "\nDisplay the bill for the customer in the next form. " +
                "\nBill should contain the customer information and the information of the products entered.";
        TextView problem2 = (TextView) findViewById(R.id.prob2_title);
        problem2.setText(prob2);
        TextView prob2Details = (TextView) findViewById(R.id.prob2_details_field);
        prob2Details.setText(problem2Details);

        String prob3 = "Problem #3 || PHP";
        String problem3Details = "Write a PHP program to store current date-time in a COOKIE and " +
                "display the ‘Last visited on’ date- time on the web page upon reopening of the same page.";
        TextView problem3 = (TextView) findViewById(R.id.prob3_title);
        problem3.setText(prob3);
        TextView prob3Details = (TextView) findViewById(R.id.prob3_details_field);
        prob3Details.setText(problem3Details);
    }
}
