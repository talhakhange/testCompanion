package com.example.android.testcompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class SoftwareEngineering extends AppCompatActivity {

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
        String paperDetails = "CSM-3303 || Software Engineering and Quality Assurance || CR:4";
        TextView OSPaperDetails = (TextView) findViewById(R.id.paper_details_field);
        OSPaperDetails.setText(paperDetails);

        String unit = "Unit I";
        String OSUnit1Details = "Introduction to Software Engineering: \nThe Evolving role of software. " +
                "Software characteristics and applications, Evolution of Software Engineering, " +
                "Software crisis,  Software Engineering problems,  " +
                "Software development life cycle. Software Engineering Paradigms, Software Process, Project and Products." +
                "\n\nPlanning a Software Project:  \nCost Estimation (COCOMO and Function Points Model), " +
                "Project Scheduling, Staffing and Personnel Planning, Software Configuration Management Plan, " +
                "Quality Assurance Plans, Project Monitoring Plans, Risk Management. ";

        String unit2 = "Unit II";
        String OSUnit2Details = "Software Design: \nDesign objectives and principles, Design for Reuse & Change, " +
                "Design Methodology: " +
                "\nStructured Design and Object-oriented approach. \nModule level concepts: Coupling and Cohesion.  " +
                "Design Notation and specification, Metrics, Design validation & verification, Metrics." +
                "\n\nDetailed Design: \nModule specification, Detailed Design, Verification and Metrics " +
                "(Cyclomatic Complexity, Data Bindings, Cohesion Metric).";

        String unit3 = "Unit III";
        String OSUnit3Details = "Software Implementation: \nImplementation issues, Coding.  " +
                "\n\nProgramming Practices: \nStructured coding and object oriented coding techniques," +
                " Modern programming language features. Verification and Validation techniques " +
                "(Code reading, Static Analysis, Symbolic Execution, Proving Correctness, Code Inspections or Reviews, Unit Testing). " +
                "\n\nCoding: \nProgramming Principles and guidelines, \n\nCoding Process Metrics: \nSize Measures, " +
                "Complexity Metrics, Style Metrics. \n\nDocumentation: \nInternal and External Documentation.   ";

        String unit4 = "Unit IV";
        String OSUnit4Details = "Software Testing, Maintenance and Quality Assurance: \nError, Fault and Failure, " +
                "Test Oracles, Test Case and Test Criteria, Psychology of Testing.   " +
                "Testing Objectives and Principles, Test Case Design. Approaches to Software Testing, Black Box testing and White Box testing.  " +
                "\n\nTesting Process: \nComparison of Different Techniques, Levels of Testing, Test Plans, Test Case Specifications, " +
                "Test Case Execution and Analysis. " +
                "\n\nSoftware Reliability, Software Maintenance, Software Quality Assurance" +
                " & International Standards, Clean Room Software Engineering, CASE Tools, The Road Ahead. ";

        String unit5 = "Recommended books";
        String OSUnit5Details = "\nTEXT BOOKS\n1. Pankaj Jalote:  An Integrated Approach to Software Engineering, 3nd  Edition, Narosa. " +
                "\n\n2. Roger S. Pressman :  Software Engineering: A Practioner’s  Approach, 6th  Edition,  McGraw Hill International student Edition. " +
                "\n\nREFERENCE BOOKS\n1. Fairley, R.E.: Software Engineering Concept, Mc-Graw Hill 1985. \n\n2. Sommerville, I.: Software Engineering, Narosa. " +
                "\n\n3. Shooman, M.: Software Engineering, Mc-Graw Hill. " +
                "\n\n4. Robert N. Charett  : Software Engineering Environments, McGraw Hill International Edition. " +
                "\n\n5. Anderson: Software Engineering   \nISO-9001, “Quality system - Model for quality Assurance in design/ development, " +
                "production, installation and Servicing”.";

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
