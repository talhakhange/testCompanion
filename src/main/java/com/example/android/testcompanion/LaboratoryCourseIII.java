package com.example.android.testcompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class LaboratoryCourseIII extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_syllabus_details);

        displaySyllabus();
    }

    public void displaySyllabus(){
        String paperDetails = " CSM-33P1 || LABORATORY COURSE-III || CR:4";
        TextView OSPaperDetails = (TextView) findViewById(R.id.paper_details_field);
        OSPaperDetails.setText(paperDetails);

        String unit = "MINI-PROJECT ";
        String OSUnit1Details = "\nIn VB, VC++ or Java under Linux (UNIX)/Windows. ";

        String unit2 = "In addition to completing Mini-Project, the students will be " +
                "doing the exercises provided by the respective teachers in their class rooms. ";
        String OSUnit2Details = "\nThe individual teachers who are teaching the courses will be responsible for " +
                "completing their respective lab assignments. ";

        String unit3 = "Some of the representative areas/problems may include the following:";
        String OSUnit3Details = "\n# Developing Window Based Applications using recent technologies  " +
                "using .NET Platform or Java Technologies like Java Servlet, Java Beans, COM, CORBA etc. " +
                "\n\n# Students should learn languages such as PROLOG or LISP to solve the Laboratory " +
                "exercises. \n\n# An expert system shell such as IITM rule be used to create a small " +
                "expert system for, say, trouble shooting moped, VCR etc. \n" +
                "Some suggested experiments are : \nTour of India, \nStable marriage problem, " +
                "\nGame playing (such as bridge), \ncoin change problem etc. ";

        String unit4 = "Note";
        String OSUnit4Details = "Students are advised to consult the LAB MANUAL of CSM-3071 for " +
                "details related to Mini-Project development.";

        String unit5 = "Recommended Books";
        String OSUnit5Details = "\n1. Robert Lafore, “Object Oriented Programming in C++”, Pearson " +
                "\n\n2. R. Brown, \"Visual Basic .NET – Your Visual Blueprint for Building Versatile Programs on the .NET Framework\", Wiley Publishing, Inc. " +
                "\n\n3. Ivan Bayross, \"Oracle\",  BPB " +
                "\n\n4. E.N. Mackay, \"Developing user Interfaces for Windows\", WP Publishers & Distributors Pvt. Ltd.";


        TextView unitNumber = (TextView) findViewById(R.id.unit1_field);
        unitNumber.setText(unit);
        TextView orderSummaryTextView = (TextView) findViewById(R.id.text1_field);
        orderSummaryTextView.setText(OSUnit1Details);

        TextView unitNumber2 = (TextView) findViewById(R.id.unit2_field);
        unitNumber2.setText(unit2);
        TextView OSUnit2 = (TextView) findViewById(R.id.text2_field);
        OSUnit2.setText(OSUnit2Details);

        TextView unitNumber3 = (TextView) findViewById(R.id.unit3_field);
        unitNumber3.setText(unit3);
        TextView OSUnit3 = (TextView) findViewById(R.id.text3_field);
        OSUnit3.setText(OSUnit3Details);

        TextView unitNumber4 = (TextView) findViewById(R.id.unit4_field);
        unitNumber4.setText(unit4);
        TextView OSUnit4 = (TextView) findViewById(R.id.text4_field);
        OSUnit4.setText(OSUnit4Details);

        TextView unitNumber5 = (TextView) findViewById(R.id.unit5_field);
        unitNumber5.setText(unit5);
        TextView OSUnit5 = (TextView) findViewById(R.id.text5_field);
        OSUnit5.setText(OSUnit5Details);
    }
}
