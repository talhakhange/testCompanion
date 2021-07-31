package com.example.android.testcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Week13Lab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_week13_lab);
        displayProbs();
        ImageButton backButton = (ImageButton) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backButtonIntent = new Intent(Week13Lab.this, LabManual.class);
                startActivity(backButtonIntent);
                finish();
            }
        });
    }

    public void displayProbs(){
        String weekDetails = "Week #13 || ASP.NET";
        TextView week1Details = (TextView) findViewById(R.id.lab13weekdetailsfield);
        week1Details.setText(weekDetails);

        String probDetails = "Problem #1";
        TextView probDetailswa = (TextView) findViewById(R.id.problem_number);
        probDetailswa.setText(probDetails);

        String problemtitle = "Create a web site in ASP.NET for a School consisting of the following pages:";
        TextView probtitleDetails = (TextView) findViewById(R.id.title);
        probtitleDetails.setText(problemtitle);

        String problem2Details ="The Home page should consist of four areas containing the following information:" +
                "\nHeader area containing the logo, name of the school and a photograph of the school. Make sure that" +
                " you use a good picture format. Left area containing the links to other pages - these links should " +
                "include About us, Academics, Infrastructure, Contact us and Feedback. The Content area should display " +
                "a table showing list of upcoming events of the School along with dates. The Footer area should display " +
                "the copyright information and current date and time. You need to make sure that the Header and Footer " +
                "area is same across all the pages of the website.";
        TextView prob2Details = (TextView) findViewById(R.id.text_field_a);
        prob2Details.setText(problem2Details);


        String problem3Details = "About us page should give information about the Objectives, values and beliefs of the " +
                "school, preferable in some structured format. You may use lists or tables for the same.";
        TextView prob3Details = (TextView) findViewById(R.id.text_field_b);
        prob3Details.setText(problem3Details);

        String problem4Details = "Academics page lists details about the teachers and the past activities of the school.";
        TextView prob4Details = (TextView) findViewById(R.id.text_field_c);
        prob4Details.setText(problem4Details);

        String problem21Details ="Infrastructure page should highlight the available resources of the school.";
        TextView prob21Details = (TextView) findViewById(R.id.text_field_d);
        prob21Details.setText(problem21Details);


        String problem31Details = "Contact us page should provide information about the school address and contact details.";
        TextView prob31Details = (TextView) findViewById(R.id.text_field_e);
        prob31Details.setText(problem31Details);

        String problem41Details = "Feedback page should have a feedback form consisting of text box, radio buttons, list boxes etc. " +
                "This page should get the information from the site visitors about various aspects of schools website. You must use " +
                "JavaScript to check that all the required fields are entered by the visitor.";
        TextView prob41Details = (TextView) findViewById(R.id.text_field_f);
        prob41Details.setText(problem41Details);
    }
}
