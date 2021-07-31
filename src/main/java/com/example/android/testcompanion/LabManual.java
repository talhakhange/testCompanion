package com.example.android.testcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LabManual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_manual);

        ImageView week6 = (ImageView) findViewById(R.id.week6);
        week6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent wee6Intent = new Intent(LabManual.this, Week6Lab.class);
                startActivity(wee6Intent);
            }
        });

        ImageView week7 = (ImageView) findViewById(R.id.week7);
        week7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent wee7Intent = new Intent(LabManual.this, Week7Lab.class);
                startActivity(wee7Intent);
            }
        });

        ImageView week8 = (ImageView) findViewById(R.id.week8);
        week8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent wee8Intent = new Intent(LabManual.this, Week8Lab.class);
                startActivity(wee8Intent);
            }
        });

        ImageView week9 = (ImageView) findViewById(R.id.week9);
        week9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent wee9Intent = new Intent(LabManual.this, Week9Lab.class);
                startActivity(wee9Intent);
            }
        });

        ImageView week10 = (ImageView) findViewById(R.id.week10);
        week10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent wee10Intent = new Intent(LabManual.this, Week10Lab.class);
                startActivity(wee10Intent);
            }
        });

        ImageView week11 = (ImageView) findViewById(R.id.week11);
        week11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent week11Intent = new Intent(LabManual.this, Week11Lab.class);
                startActivity(week11Intent);
            }
        });

        ImageView week12 = (ImageView) findViewById(R.id.week12);
        week12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent week12Intent = new Intent(LabManual.this, Week12Lab.class);
                startActivity(week12Intent);
            }
        });

        ImageView week13 = (ImageView) findViewById(R.id.week13);
        week13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent week13Intent = new Intent(LabManual.this, Week13Lab.class);
                startActivity(week13Intent);
            }
        });

        ImageView week14 = (ImageView) findViewById(R.id.week14);
        week14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent week14Intent = new Intent(LabManual.this, Week14Lab.class);
                startActivity(week14Intent);
            }
        });

        ImageView instructions = (ImageView) findViewById(R.id.labInstructions);
        instructions.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent instructionsIntent = new Intent(LabManual.this, Instructions.class);
                startActivity(instructionsIntent);
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
    public void openSyllabus(View view){
        startActivity(new Intent(this, com.example.android.testcompanion.Syllabus.class));
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
