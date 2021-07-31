package com.example.android.testcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_instructions);
        displayProbs();
        ImageButton backButton = (ImageButton) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backButtonIntent = new Intent(Instructions.this, LabManual.class);
                startActivity(backButtonIntent);
                finish();
            }
        });
    }

    public void displayProbs(){
        String weekDetails = "Instructions ;)";
        TextView week1Details = (TextView) findViewById(R.id.lab13weekdetailsfield);
        week1Details.setText(weekDetails);


        String problem2Details ="The students must complete the weekly activities/assignments well in time (i.e., within the same week).";
        TextView prob2Details = (TextView) findViewById(R.id.text_field_a);
        prob2Details.setText(problem2Details);


        String problem3Details = "The students must maintain the Lab File of their completed activities/assignments in the prescribed format.";
        TextView prob3Details = (TextView) findViewById(R.id.text_field_b);
        prob3Details.setText(problem3Details);

        String problem4Details = "The students must get the completed weekly activities/assignments checked and signed by the concerned teachers " +
                "in the Lab in the immediate succeeding week. Failing which the activities/assignments for that week will be treated as incomplete.";
        TextView prob4Details = (TextView) findViewById(R.id.text_field_c);
        prob4Details.setText(problem4Details);

        String problem21Details ="At least TEN (10) such timely completed and duly signed weekly activities/assignments are compulsory, failing which " +
                "students will not be allowed to appear in the final Lab Examination.";
        TextView prob21Details = (TextView) findViewById(R.id.text_field_d);
        prob21Details.setText(problem21Details);


        String problem31Details = "The students need to submit the following three deliverables for each " +
                "exercise duly signed by the Teacher:\n \uF076 Coding\n \uF076 Input / Output.";
        TextView prob31Details = (TextView) findViewById(R.id.text_field_e);
        prob31Details.setText(problem31Details);

        String problem41Details = "The students need to ensure that each question is assessed and signed by the Teacher in the week/time.";
        TextView prob41Details = (TextView) findViewById(R.id.text_field_f);
        prob41Details.setText(problem41Details);

        String problem51Details = "Late submission would not be accepted after the due date.";
        TextView prob51Details = (TextView) findViewById(R.id.text_field_g);
        prob51Details.setText(problem51Details);

        String problem61Details = "Cooperate, collaborate and explore for the best individual learning outcomes but copying is strictly prohibited.";
        TextView prob61Details = (TextView) findViewById(R.id.text_field_h);
        prob61Details.setText(problem61Details);
    }

}
