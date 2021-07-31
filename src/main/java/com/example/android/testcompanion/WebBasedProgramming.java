package com.example.android.testcompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class WebBasedProgramming extends AppCompatActivity {

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
        String paperDetails = " CSM-3301 || Web Based Programming || CR:4";
        TextView OSPaperDetails = (TextView) findViewById(R.id.paper_details_field);
        OSPaperDetails.setText(paperDetails);

        String unit = "Unit I\nIntroduction";
        String OSUnit1Details = "\nInternet Standards, Introduction to WWW, WWW Architecture, " +
                "client and server, web server, web application basic pieces, working of a website, " +
                "Internet Protocols, Overview of HTTP. \n\nHTTP request – response, Generations of dynamic " +
                "web pages, Front end and backend web development. \n\nWeb content management systems: " +
                "\nWordpress, Joomla, web development life cycle, \nGuidelines for Indian Government websites. ";

        String unit2 = "Unit II\nBasics of HTML,CSS, JavaScipt";
        String OSUnit2Details = "\nHTML and HTML5: \nIntroduction, TML Tags, Formatting and Fonts, " +
                "Commenting Code, Anchors, Backgrounds, Images, Hyperlinks, Lists, Tables, Frames, " +
                "HTML Forms. \n\nCascading Style Sheet (CSS): \nIntroduction, Basics of CSS, style types. " +
                "\n\nJavaScript: \nIntroduction, variables, operators, conditionals, looping and validation. " +
                "\n\nIntroduction to Jquery, Ajax and XML";

        String unit3 = "Unit III\nIntroduction to PHP";
        String OSUnit3Details = "\nPHP structure: \nbasic syntax, variables, operators, multiline commands. " +
                "Expression and control flow in PHP, PHP dynamic linking. PHP functions and Objects, PHP arrays. " +
                "\n\nPractical PHP: \nDate and time functions, file handling, system calls. Accessing and manipulating" +
                " database using PHP, Error handling in PHP, generating images with PHP. Cookies, sessions and authentication. ";

        String unit4 = "Unit IV\nIntroduction to ASP.NET";
        String OSUnit4Details = "\nGetting started with ASP.NET, Building an ASP.NET web site, " +
                "designing web pages, working with ASP.NET server controls, programming ASP.NET web pages, " +
                "creating consistent looking web sites. \n\nNavigation: \nmove around web site, navigation controls. User controls, " +
                "\nvalidating user inputs. \n\nSecurity pitfalls and basic solutions (SQL injections, cross site scripting (XSS), " +
                "cross site request forgery, DoS, DDoS).";

        String unit5 = "Recommended Books";
        String OSUnit5Details = "\n1. Learning PHP, MySQL & JavaScript with JQUERY, CSS & HTML5: Robin Nixon (O’Reilly) " +
                "\n\n2. Beginning ASP.NET 4 in C# and VB: Imar Spaanjaars(Wiley-India Edition). " +
                "\n\n3. Learning Web Design: A Beginner’s Guide to (X)HTML, Style Sheets and Web Graphics: Jennifer Niederst Robbins (O’Reilly). ";

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
