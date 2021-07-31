package com.example.android.testcompanion;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentDataAdapter extends ArrayAdapter<StudentData> {
    public StudentDataAdapter(Activity context, ArrayList<StudentData> studentData){
        super(context, 0, studentData);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //check if the existing view is being reused, otherwise inflate the view
        View listItemView =  convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.student_list,parent,false);
        }

        //Get the{@link StudentData} object located at this position in the list
        StudentData currentStudentData = getItem(position);

        //Find the nameTextViw in the student_list.xmlxml layout with the ID miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        //Get the Miwok translation from the currentStudentData object and set this text on the
        //Miwok TextView.
        miwokTextView.setText(currentStudentData.getNaam());

        //Find the TextView in the student_list.xmlxml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        //Get the default translation from the currentStudentData object and set this text on the
        //default TextView.
        defaultTextView.setText(currentStudentData.getmFacultyNumber());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentStudentData.getmImageResourceId());

      /*  TextView graduationTextView = (TextView) listItemView.findViewById(R.id.graduation);
        graduationTextView.setText(currentStudentData.getmGraduation());
    */
        TextView hallTextView = (TextView) listItemView.findViewById(R.id.hall);
        hallTextView.setText(currentStudentData.getmHall());

        TextView extrasTextView = (TextView) listItemView.findViewById(R.id.fb);
        extrasTextView.setText(currentStudentData.getmFb());

        TextView emailTextView = (TextView) listItemView.findViewById(R.id.email);
        emailTextView.setText(currentStudentData.getmEmail());

        TextView enrollTextView = (TextView) listItemView.findViewById(R.id.enroll);
        enrollTextView.setText(currentStudentData.getmEnrollmentNumber());

        TextView mobTextView = (TextView) listItemView.findViewById(R.id.mob);
        mobTextView.setText(currentStudentData.getmMobileNumber());

        //Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        //in the ListView.
        return listItemView;
    }
}
