package com.example.android.testcompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class OperatingSystem extends AppCompatActivity {

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
        String paperDetails = "CSM-3302 || OPERATING SYSTEM || CR:4";
        TextView OSPaperDetails = (TextView) findViewById(R.id.paper_details_field);
        OSPaperDetails.setText(paperDetails);
        String unit1 = "Unit I";
        String OSUnit1Details = "Introduction, Evolution of Operating System, " +
                "Operating System Structure, \n\nTypes of Operating System:" +
                "\nBatch Processing, Multiprogramming, Time sharing, Distributed System, " +
                "Real Time System.\n\nProcess:\nConcepts, Process control blocks, " +
                "Concurrency, Mutual Exclusion, Semaphores, Inter Process Communication, " +
                "Process Synchronization.";

        String unit2 = "Unit II";
        String OSUnit2Details = "Processor Management Techniques; " +
                "\nThreads, Process Scheduling, Scheduling Criteria, Types of scheduling, " +
                "Scheduling Algorithms, Deadlocks, Deadlocks Prevention, Deadlocks Avoidance, " +
                "Deadlocks Detection. ";

        String unit3 = "Unit III";
        String OSUnit3Details = "Memory Management: \nReal storage, " +
                "Contiguous Vs. Non Contiguous Storage Allocation, " +
                "\n\nStatic and Dynamic Partitioned Memory Allocation; \nVirtual memory, " +
                "Management of Virtual Memory, Paging, Segmentation, Segmentation with Paging.";

        String unit4 = "Unit IV";
        String OSUnit4Details = "I/O Management: \nDisk Organization, Disk Space Management, " +
                "disk Scheduling, Files Types and Operations, File Access and Security, " +
                "File Storage Management, File Organization, Operating System security, " +
                "\n\nCase Study of UNIX/LINUX OS.";

        String unit5 = "Recommended Books";
        String OSUnit5Details = "\n1. Harvery M. Deitel, \"An Introduction to Operating System\"  " +
                "\n\n2. P.C.P.Bhatt, \"An Introduction to Operating System Concepts and Practice\" " +
                "\n\n3. D.M.Dhamdhere, \"Operating System\" " +
                "\n\n4. J. Archer Harris, \"Operating System\"  " +
                "\n\n5. A. S. Tanenbaum, \"Modern Operating Systems\", PHI " +
                "\n\n6. William Stallings, \"Operating Systems – internals and design principles\", PHI " +
                "\n\n7. Silberschatz, Galvin, Gagne, \"Operating System Concepts\", John Wiley & Sons. ";


        TextView unitNumber1 = (TextView) findViewById(R.id.unit1_field);
        unitNumber1.setText(unit1);
        TextView OSUnit1 = (TextView) findViewById(R.id.text1_field);
        OSUnit1.setText(OSUnit1Details);

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
