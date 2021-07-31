package com.example.android.testcompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Microprocessor extends AppCompatActivity {

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
        String paperDetails = " CSM-3305 || Microprocessor: Architecture and Applications  || CR:2";
        TextView OSPaperDetails = (TextView) findViewById(R.id.paper_details_field);
        OSPaperDetails.setText(paperDetails);

        String unit = "Unit I\nMicroprocessor & Its Architecture";
        String OSUnit1Details = "\nIntroduction to microprocessor, survey of microprocessors, " +
                "evolution of microprocessors, microprocessor generations, microprocessor architectures, " +
                "architecture tree \n\nFunctional block diagram of 8085, register section, timing and control unit. ";

        String unit2 = "Unit II\nProgramming of Microprocessor";
        String OSUnit2Details ="\nAddressing modes, \nInstruction set of 8085, " +
                "\nTiming diagrams of 8085. \nProgramming examples based on 8085 instruction set. ";

        String unit3 = "Unit III\nI/O Techniques and Support Chips";
        String OSUnit3Details = "\nInterfacing techniques, \n\ndata transfer schemes: \nprogrammed mode, " +
                "\nInterrupt driven, and \nDMA mode of data transfer. \n\nSupport chips:- \n8156, 8355,8255 ";

        String unit4 = "Unit IV\nOther Microprocessors";
        String OSUnit4Details ="\nArchitecture of 8086, \nRegister set of 8086, " +
                "\n8086 operational modes, \nIntroduction to Intel’s higher microprocessors like 80386, Pentium etc. ";

        String unit5 = "Recommended Books";
        String OSUnit5Details = "\n1. Gaonkar, \"Microprocessor Architecture Programming and Applications with the 8085\"" +
                "\n\n2. D. V Hall, \"Microprocessor and Interfacing.\"" +
                "\n\n3. Barry B. Brey, \"The Intel Microprocessors\"";

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
