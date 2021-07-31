package com.example.android.testcompanion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIndtnt = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIndtnt);
                finish();
            }
        },SPLASH_TIME_OUT);

    }

   public void openSchedule(View view){
        startActivity(new Intent(this, com.example.android.testcompanion.Schedule.class));
    }
    public void openSyllabus(View view){
        startActivity(new Intent(this, com.example.android.testcompanion.Syllabus.class));
    }
    public void openLabManual(View view){
        startActivity(new Intent(this, com.example.android.testcompanion.LabManual.class));
    }
    public void openToDo(View view){
        startActivity(new Intent(this, com.example.android.testcompanion.ToDo.class));
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
                // Do nothing for now
                return true;
            case R.id.feedback:
                startActivity(new Intent(this, com.example.android.testcompanion.Feedback.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
