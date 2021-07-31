package com.example.android.testcompanion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Schedule extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

//        Calendar calendar = Calendar.getInstance();
//        int day = calendar.get(Calendar.DAY_OF_WEEK);
//        SimpleDateFormat df = new SimpleDateFormat("H");
//        String sTime = df.format(calendar.getTime());
//        int time = Integer.parseInt(sTime);

        viewPager = (ViewPager)findViewById(R.id.ViewPager);
        viewPagerAdapter viewPagerAdapter = new viewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

    }

    public void openHome(View vew){
        startActivity(new Intent(this, com.example.android.testcompanion.HomeActivity.class));
        finish();
    }
    public void openSyllabus(View view){
        startActivity(new Intent(this, com.example.android.testcompanion.Syllabus.class));
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
