package com.example.android.testcompanion;

import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }


    public void submitFeedback(View view){
        EditText nameField = (EditText) findViewById(R.id.feedbackField);
        String feedback = nameField.getText().toString();

            String subject = "Companion Feedback";
            if(feedback.equals(""))
                Toast.makeText(this, "Feedback cannot be blank", Toast.LENGTH_SHORT).show();

            else {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"arshidocuments@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, feedback);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                finish();
            }

    }

}
