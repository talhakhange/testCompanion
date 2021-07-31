package com.example.android.testcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Week9Lab extends AppCompatActivity {

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
                Intent backButtonIntent = new Intent(Week9Lab.this, LabManual.class);
                startActivity(backButtonIntent);
                finish();
            }
        });
    }

    public void displayProbs(){
        String weekDetails = "Week #9 || PHP, Ajax & MySQL";
        TextView week1Details = (TextView) findViewById(R.id.week_details_field);
        week1Details.setText(weekDetails);

        String prob1 = "Problem #1";
        String problem1Details = "Create a small Ajax-enabled rich application. " +
                "\nThe application has an input text field. When the user types an alphabet" +
                " in the given input field, a request goes to the PHP file via Ajax, " +
                "a query is made to the MySQL table, it returns some results and then those " +
                "results are fetched by Ajax and displayed.";
        TextView problem1 = (TextView) findViewById(R.id.prob1_title);
        problem1.setText(prob1);
        TextView prob1Details = (TextView) findViewById(R.id.prob1_details_field);
        prob1Details.setText(problem1Details);

        String prob2 = "Problem #2";
        String problem2Details = "Create your own web page using PHP. " +
                "\nYour web page must include : " +
                "\n\n    a) Your Photograph in the upper right corner " +
                "\n\n    b) Two tables showing your qualifications so far starting from 10th. " +
                "This table should provide a link to the School/ College/ University website " +
                "that you have attended. " +
                "\n\n    c) A point wise list about your strengths. " +
                "\n\n    d) Insert your career objective in a frame. " +
                "\n\n    e) Provide link to some Universities where you propose to do higher studies.";
        TextView problem2 = (TextView) findViewById(R.id.prob2_title);
        problem2.setText(prob2);
        TextView prob2Details = (TextView) findViewById(R.id.prob2_details_field);
        prob2Details.setText(problem2Details);

        String prob3 = "Problem #3";
        String problem3Details = "Note: Draw the flow chart and write the Assembly Level Programs of the following:\n\n" +
                "Do the followings: " +
                "\n\n    i) Store the data Byte FFh in the memory Location 9000h. " +
                "\n\n    ii) Use indirect indexing address to access the memory " +
                "location 9000h  and store the result in 9100h " +
                "\n\n    iii) Exchange the contents of the memory location 9000h and 9050h";
        TextView problem3 = (TextView) findViewById(R.id.prob3_title);
        problem3.setText(prob3);
        TextView prob3Details = (TextView) findViewById(R.id.prob3_details_field);
        prob3Details.setText(problem3Details);

        String prob4 = "Problem #4";
        String problem4Details = "To add the numbers available in memory location 9000h and 9001h and store the result in 9002h.";
        TextView problem4 = (TextView) findViewById(R.id.prob4_title);
        problem4.setText(prob4);
        TextView prob4Details = (TextView) findViewById(R.id.prob4_details_field);
        prob4Details.setText(problem4Details);
    }

}
