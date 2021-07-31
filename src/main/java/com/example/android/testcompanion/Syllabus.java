package com.example.android.testcompanion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Syllabus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ImageView operatingSystem = (ImageView) findViewById(R.id.os);
        operatingSystem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent osIntent = new Intent(Syllabus.this, OperatingSystem.class);
                startActivity(osIntent);
            }
        });

        ImageView visualProgramming = (ImageView) findViewById(R.id.wbp);
        visualProgramming.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent osIntent = new Intent(Syllabus.this, WebBasedProgramming.class);
                startActivity(osIntent);
            }
        });

        ImageView artificialIntelligence = (ImageView) findViewById(R.id.se);
        artificialIntelligence.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent aiIntent = new Intent(Syllabus.this, SoftwareEngineering.class);
                startActivity(aiIntent);
            }
        });

        ImageView theoryOfComputation = (ImageView) findViewById(R.id.dc);
        theoryOfComputation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent tocIntent = new Intent(Syllabus.this, DataCommunications.class);
                startActivity(tocIntent);
            }
        });

        ImageView computerGraphics = (ImageView) findViewById(R.id.mp);
        computerGraphics.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent gcIntent = new Intent(Syllabus.this, Microprocessor.class);
                startActivity(gcIntent);
            }
        });

        ImageView discreteMathematics = (ImageView) findViewById(R.id.dm);
        discreteMathematics.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent dmIntent = new Intent(Syllabus.this, DiscreteMathematics.class);
                startActivity(dmIntent);
            }
        });

        final ImageView lab = (ImageView) findViewById(R.id.lab);
        lab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent labIntent = new Intent(Syllabus.this, LaboratoryCourseIII.class);
                startActivity(labIntent);
            }
        });
    }


//Navigation
    public void openHome(View vew){
        startActivity(new Intent(this, com.example.android.testcompanion.HomeActivity.class));
        finish();
    }
    public void openSchedule(View view){
        startActivity(new Intent(this, com.example.android.testcompanion.Schedule.class));
        finish();
    }
    public void openLabManual(View view){
        startActivity(new Intent(this, com.example.android.testcompanion.LabManual.class));
        finish();
    }
    public void openToDo(View view){
        startActivity(new Intent(this, com.example.android.testcompanion.ToDo.class));
        finish();
    }
    public void openFeedback(View view){
        startActivity(new Intent(this, com.example.android.testcompanion.Feedback.class));
        finish();
    }
}
