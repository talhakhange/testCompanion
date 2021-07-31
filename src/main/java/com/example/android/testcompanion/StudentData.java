package com.example.android.testcompanion;

public class StudentData {
    /** Name of the student*/
    private String mNaam;

    /** Faculty number of the student */
    private String mFacultyNumber;

    /**Resource id of the image*/
    private int mImageResourceId;

    /**Graduation Major*/
    private String mGraduation;

    /**Hall of residence of the student*/
    private String mHall;

    /** Extra information (fb, email, enrollment no., mobile no.)*/
    private String mFb;
    private String mEmail;
    private String mEnrollmentNumber;
    private String mMobileNumber;


    public StudentData(String naam, int imageResourceId, String facultyNumber, String hall, String fb, String email, String enrollmentNumber){
        mNaam = naam;
        mFacultyNumber = facultyNumber;
        mImageResourceId = imageResourceId;

        mHall = hall;
        mFb = fb;
        mEmail  = email;
        mEnrollmentNumber = enrollmentNumber;
    }

    /**
     * Get name of the student.
     */
    public String getNaam(){
        return mNaam;
    }

    /**
     * Get faculty number of the student.
     */
    public String getmFacultyNumber(){
        return mFacultyNumber;
    }

    /**
     * Get the resource id of the image.
     */
    public  int getmImageResourceId(){ return mImageResourceId; }

    /**
     * Get the major.
     */
    public  String getmGraduation(){ return mGraduation; }

    /**
     * Get roll  number of the student.
     */
    public String getmHall(){ return mHall; }

    /**
     * Get Extra information (fb, email, enrollment no., mobile no.)
     */
    public String getmFb(){return mFb;}
    public String getmEmail(){return mEmail;}
    public String getmEnrollmentNumber(){return mEnrollmentNumber;}
    public String getmMobileNumber(){return mMobileNumber;}

}
