package com.example.android.testcompanion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void openSchedule(View view){
        startActivity(new Intent(this, com.example.android.testcompanion.Schedule.class));
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_catalog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            case R.id.aboutBatch:
                startActivity(new Intent(this, com.example.android.testcompanion.BatchInfo.class));
                return true;
            case R.id.aboutApp:
                startActivity(new Intent(this, com.example.android.testcompanion.AppInfo.class));
                return true;
            case R.id.feedback:
                startActivity(new Intent(this, com.example.android.testcompanion.Feedback.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
