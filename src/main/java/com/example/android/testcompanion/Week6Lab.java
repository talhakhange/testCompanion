package com.example.android.testcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Week6Lab extends AppCompatActivity {

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
                Intent backButtonIntent = new Intent(Week6Lab.this, LabManual.class);
                startActivity(backButtonIntent);
                finish();
            }
        });

    }
    public void displayProbs(){
        String weekDetails = "Week #6 || PHP problems";
        TextView week1Details = (TextView) findViewById(R.id.week_details_field);
        week1Details.setText(weekDetails);

        String prob1 = "Problem #1 || PHP";
        String problem1Details = "Write a PHP script for the following:\n " +
                "\nDesign a form to accept two strings from the user. " +
                "\nFind the first occurrence and the last occurrence of the small string in the large string. " +
                "\nAlso count the total number of occurrences of small string in the large string. " +
                "\nProvide a text box to accept a string, which will replace the small string in the large string." +
                "\n(Use built-in functions).";
        TextView problem1 = (TextView) findViewById(R.id.prob1_title);
        problem1.setText(prob1);
        TextView prob1Details = (TextView) findViewById(R.id.prob1_details_field);
        prob1Details.setText(problem1Details);

        String prob2 = "Problem #2 || PHP";
        String problem2Details = "Write a PHP script for the following:\n " +
                "\nDesign a form to accept the details of 5 different items, such as item code, " +
                "item name, units sold, and rate. \nDisplay the bill in the tabular format. " +
                "\nUse only 4 text boxes. " +
                "\n(Hint: Use of explode function).";
        TextView problem2 = (TextView) findViewById(R.id.prob2_title);
        problem2.setText(prob2);
        TextView prob2Details = (TextView) findViewById(R.id.prob2_details_field);
        prob2Details.setText(problem2Details);

        String prob3 = "Problem #3 || PHP";
        String problem3Details = "Write a PHP script to use regular expressions check for the " +
                "validity of entered email-id. \nThe @ symbol should not appear more than once. " +
                "\nThe dot (.) can appear at the most once before @ and at the most twice or at " +
                "least once after @ symbol. \nThe substring before @ should not begin with a digit " +
                "or underscore or dot or @ or any other special character.";
        TextView problem3 = (TextView) findViewById(R.id.prob3_title);
        problem3.setText(prob3);
        TextView prob3Details = (TextView) findViewById(R.id.prob3_details_field);
        prob3Details.setText(problem3Details);
    }
}
