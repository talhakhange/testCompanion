package com.example.android.testcompanion;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BatchInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //      WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_batch_info);
        //Passing another java file StudentData.java in ArrayList
        ArrayList<StudentData> studentData = new ArrayList<StudentData>();
        // studentData.add("One");
        studentData.add(new StudentData("Abid Masood", R.drawable.abid, "15", "mh","facebook.com/kbbamu","Email: abid.monurzn@gmail.com","GK 2302"));

        studentData.add(new StudentData("Md Ozaif", R.drawable.ic_ozaif_png, "36", "nr","fb.com/ozalig.5473","Email: ozaif1333@gmail.com","GI 3961"));
        studentData.add(new StudentData("Jamaluddin", R.drawable.ic_jamaluddin, "09", "vm","facebook.com/jamal.560272","Email: Not available","GH 7968"));
        studentData.add(new StudentData("Kausar Ali", R.drawable.ic_kausar, "12", "nr","facebook.com/kausar.439","Email: Not available","GE 3469"));
        studentData.add(new StudentData("Zuber Ahmad", R.drawable.ic_zubair, "11", "mh","facebook.com/zuberbasti","zuber55@gmail.com","GK 2301"));
        studentData.add(new StudentData("Sarfaraz Hussain", R.drawable.sfz, "31", "nr","facebook.com/sarfraz2100","sarfraz2100@gmail.com","GF 0266"));

        studentData.add(new StudentData("Haider Ali", R.drawable.ic_haider_png, "26", "mh","facebook.com/AB001001","alihaider939@gmail.com","GF 0230"));
        studentData.add(new StudentData("Dilshad Ahmad", R.drawable.ic_dilshad, "55", "mh","facebook.com/mohd.dahmad3","dahamd11@gmail.com","GG 4499"));

        studentData.add(new StudentData("Hiba Zehra",R.drawable.ic_hiba, "35", "mh","facebook.com/hzehra.7165","hzehral256@gmail.com","GI 3842"));
        studentData.add(new StudentData("Shadan Anwar", R.drawable.ic_shadan, "32", "nr","facebook.com/coolshady","cool.shade3735@gmail.com","GF 0342"));
        studentData.add(new StudentData("Maryam Fatima", R.drawable.ic_maryam, "58", "nr","fb: Not available","fatimaryam74363@gmail.com","GF 0259"));
        studentData.add(new StudentData("Mohammad Zaid", R.drawable.ic_zaidhafeez, "04", "nr","fb: Not available","md.zaid95@gmail.com","GH 7903"));
        studentData.add(new StudentData("Gaurav Rajpoot", R.drawable.ic_gaurav, "37", "nr","fb: Not available","Email: Not available","GH 2027"));
        studentData.add(new StudentData("Sameena Ghaffar", R.drawable.ic_sameena, "45", "IG","fb: Not available","Email: Not available","GF 0442"));
        studentData.add(new StudentData("Maryam", R.drawable.ic_maryam, "47", "IG","fb: Not available","Email: Not available","GK 2306"));
        studentData.add(new StudentData("Yusuf Zafar", R.drawable.ic_yusuf, "30", "mh","fb.com/yzafar.5895834","zafarysusf810@gmail.com","GI 3810"));
        studentData.add(new StudentData("Mohib Khan", R.drawable.ic_mohib, "51", "vm","fb.com/mohib.98622","its.mohib.drive@gmail.com","GK 2304"));
        studentData.add(new StudentData("Hafiz Shaizan", R.drawable.ic_shadan, "34", "sz","fb.com/shaizan.9250","hfzshaizan333@gmail.com","GH 7761"));
        studentData.add(new StudentData("Asad Iqbal", R.drawable.ic_asad, "25", "vm","fb: Not available","asad2010hashmi@gmail.com","GE 6491"));
        studentData.add(new StudentData("Namita Chawla", R.drawable.ic_namita, "50", "mh","fb.com/namita1323","Email: Not available","GK 2309"));
        studentData.add(new StudentData("Nikita Agarwal", R.drawable.ic_nikita, "62", "nr","fb.com/namita.7399786","namitaag6560@gmail.com","GI 3797"));
        studentData.add(new StudentData("Jagrati Gupta", R.drawable.ic_jagriti, "10", "nr","fb: Not available","shgupta5597@gmail.com","GI 3929"));
        studentData.add(new StudentData("Amir Siddiqui", R.drawable.ic_aamir, "60", "ss","fb.com/amir.volley","amir123@gmail.com","GB 6541"));
        studentData.add(new StudentData("Sakshi Sharma", R.drawable.ic_sakshi, "03", "nr","fb.com/sakshi.239","skaashi96@gmail.com","GI 3962"));
        studentData.add(new StudentData("Shubham Gupta", R.drawable.ic_shubham, "42", "mh","fb.com/mshubham.gupta87","shubhgpt@gmail.com","GI 3922"));
        studentData.add(new StudentData("Zeeshanuddin", R.drawable.ic_zeeshanuddin, "56", "nr","fb: Not available","Email: Not available","GH 7976"));
        studentData.add(new StudentData("Sneha Gupta", R.drawable.ic_snehagupta, "14", "IG","fb: Not available","Email: Not available","GI 2854"));
        studentData.add(new StudentData("Romesh Varshney", R.drawable.ic_romesh, "01", "mh","fb: Not available","rms3862@gmail.com","GI 4027"));


        studentData.add(new StudentData("Hardik Varshney", R.drawable.place_holder, "49", "sz","fb.com/hardik6777","hardik3912@gmail.com","GI 3912"));
        studentData.add(new StudentData("Mohd Anas Suhail", R.drawable.place_holder, "02", "mh","fb: Not available","Email: Not available","GI 3992"));
        studentData.add(new StudentData("Kunal kaushik", R.drawable.place_holder, "43", "sz","facebook.com/kunal1328","kunal87@gmail.com","GE 1328"));
        studentData.add(new StudentData("Tejveer Sharma", R.drawable.place_holder, "29", "sz","facebook.com/tej.3827","tejveer.5161@gmail.com","GI 3827"));

        studentData.add(new StudentData("Mueen Ali Rizvi", R.drawable.place_holder, "61", "af","facebook.com/rizvi.9","ss53634@gmail.com","GJ 5717"));
        studentData.add(new StudentData("Mohd Azhar", R.drawable.place_holder, "06", "mm","fb.com/azharmth.3158","Email: Not available","GH 1923"));
        studentData.add(new StudentData("Salman Iraqui", R.drawable.place_holder, "27", "sz","fb: Not available","sallu1695@gmail.com","GE 1695"));
        studentData.add(new StudentData("Abu Osama", R.drawable.place_holder, "53", "vm","fb.com/soam.35","Email: Not available","GK 2308"));
        studentData.add(new StudentData("Zia Sahrukh", R.drawable.place_holder, "46", "nr","fb.com/zia.3517","srkzia08@gmail.com","GI 3884"));

        studentData.add(new StudentData("Abhinav Kumar Singh", R.drawable.place_holder, "40", "mh","fb: Not available","Email: Not available","GI 3638"));

        studentData.add(new StudentData("Asad Gori", R.drawable.place_holder, "07", "IG","fb: Not available","Email: Not available","GI 2873"));
        studentData.add(new StudentData("Mohd Areeb", R.drawable.place_holder, "08", "IG","fb: Not available","Email: Not available","GI 2844"));
        studentData.add(new StudentData("Ajay Kalwar", R.drawable.place_holder, "13", "IG","fb: Not available","Email: Not available","GE 3812"));
        studentData.add(new StudentData("Mohd Azhar", R.drawable.place_holder, "17", "IG","fb: Not available","Email: Not available","GH 1146"));
        studentData.add(new StudentData("Hammadoon Issa", R.drawable.place_holder, "18", "IG","fb: Not available","Email: Not available","GG 3830"));
        studentData.add(new StudentData("Saba Sarwar", R.drawable.place_holder, "19", "IG","fb: Not available","Email: Not available","GI 2859"));
        studentData.add(new StudentData("Ariba Noor", R.drawable.place_holder, "20", "IG","fb: Not available","Email: Not available","GF 0706"));
        studentData.add(new StudentData("Ifra Tasleem", R.drawable.place_holder, "38", "IG","fb: Not available","Email: Not available","GE 3953"));
        studentData.add(new StudentData("Shalvi Rathour", R.drawable.place_holder, "39", "IG","fb: Not available","Email: Not available","GK 2303"));
        studentData.add(new StudentData("Shoib Nusrat", R.drawable.place_holder, "41", "IG","fb: Not available","Email: Not available","GK 2307"));
        studentData.add(new StudentData("Sofiya Ansari", R.drawable.place_holder, "44", "IG","fb: Not available","Email: Not available","GF 0727"));
        studentData.add(new StudentData("Mehwish Sagheer", R.drawable.place_holder, "54", "IG","fb: Not available","Email: Not available","GK 2305"));
        studentData.add(new StudentData("Iman Khan", R.drawable.place_holder, "57", "IG","fb: Not available","Email: Not available","GF 1574"));
        studentData.add(new StudentData("Simrah Fatima", R.drawable.place_holder, "23", "nr","fb: Not available","Email: Not available","GI 3754"));
        studentData.add(new StudentData("Abdullah Ahmad Khan", R.drawable.place_holder, "21", "nr","facebook.com/aahmad.khan.5","rider.khan358@gmail.com","GI 2433"));
        studentData.add(new StudentData("Arshi zameer", R.drawable.place_holder, "33", "vm","facebook.com/arshiamu","iamarshi3006@gmail.com","GE 6502"));
        studentData.add(new StudentData("Abdullah Khan", R.drawable.place_holder, "05", "nr","fb: Not available","abd7953@gmail.com","GH 7953"));


        StudentDataAdapter adapter =
                new StudentDataAdapter(this, studentData);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent samad = new Intent(Intent.ACTION_CALL);
                        samad.setData(Uri.parse("tel:+917417349854"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(samad);}
                        break;
                    case 1:
                        Intent brajesh = new Intent(Intent.ACTION_CALL);
                        brajesh.setData(Uri.parse("tel:+918791707391"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(brajesh);}
                        break;
                    case 2:
                        Intent arshil = new Intent(Intent.ACTION_CALL);
                        arshil.setData(Uri.parse("tel:+919058699402"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(arshil);}
                        break;
                    case 3:
                        Intent savita = new Intent(Intent.ACTION_CALL);
                        savita.setData(Uri.parse("tel:+918791649962"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(savita);}
                        break;
                    case 4:
                        Intent dushyant1 = new Intent(Intent.ACTION_CALL);
                        dushyant1.setData(Uri.parse("tel:+918057101477"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(dushyant1);}
                        break;
                    case 5:
                        Intent nauman = new Intent(Intent.ACTION_CALL);
                        nauman.setData(Uri.parse("tel:+919451384231"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(nauman);}
                        break;
                    case 6:
                        Intent musharraf = new Intent(Intent.ACTION_CALL);
                        musharraf.setData(Uri.parse("tel:+919045626441"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(musharraf);}
                        break;
                    case 7:
                        Intent nasir = new Intent(Intent.ACTION_CALL);
                        nasir.setData(Uri.parse("tel:+919721214950"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(nasir);}
                        break;
                    case 8:
                        Intent nirbhav = new Intent(Intent.ACTION_CALL);
                        nirbhav.setData(Uri.parse("tel:+919557794399"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(nirbhav);}
                        break;
                    case 9:
                        Intent ashraf = new Intent(Intent.ACTION_CALL);
                        ashraf.setData(Uri.parse("tel:+919621565695"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(ashraf);}
                        break;
                    case 10:
                        Intent azhar = new Intent(Intent.ACTION_CALL);
                        azhar.setData(Uri.parse("tel:+918266825468"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(azhar);}
                        break;
                    case 11:
                        Intent dushyant2 = new Intent(Intent.ACTION_CALL);
                        dushyant2.setData(Uri.parse("tel:+919720388803"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(dushyant2);}
                        break;
                    case 12:
                        Intent sajid = new Intent(Intent.ACTION_CALL);
                        sajid.setData(Uri.parse("tel:+918756054757"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(sajid);}
                        break;
                    case 13:
                        Intent shahbaz = new Intent(Intent.ACTION_CALL);
                        shahbaz.setData(Uri.parse("tel:+918382828535"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(shahbaz);}
                        break;
                    case 14:
                        Intent zaid1 = new Intent(Intent.ACTION_CALL);
                        zaid1.setData(Uri.parse("tel:+919528822331"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(zaid1);}
                        break;
                    case 15:
                        Intent suhail = new Intent(Intent.ACTION_CALL);
                        suhail.setData(Uri.parse("tel:+917037310766"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(suhail);}
                        break;
                    case 16:
                     /**   Intent zaid2 = new Intent(Intent.ACTION_CALL);
                        zaid2.setData(Uri.parse("tel:+919999999999"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(zaid2);} */
                        break;
                    case 17:
                        Intent nazar2 = new Intent(Intent.ACTION_CALL);
                        nazar2.setData(Uri.parse("tel:+917017737318"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(nazar2);}
                        break;
                    case 18:
                     /**   Intent parwez = new Intent(Intent.ACTION_CALL);
                        parwez.setData(Uri.parse("tel:+919999999999"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(parwez);} */
                        break;
                    case 19:
                        Intent prashant = new Intent(Intent.ACTION_CALL);
                        prashant.setData(Uri.parse("tel:+918791563790"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(prashant);}
                        break;
                    case 20:
                        Intent bilal = new Intent(Intent.ACTION_CALL);
                        bilal.setData(Uri.parse("tel:+918791429574"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(bilal);}
                        break;
                    case 21:
                        Intent shahrukh1 = new Intent(Intent.ACTION_CALL);
                        shahrukh1.setData(Uri.parse("tel:+918674871282"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(shahrukh1);}
                        break;
                    case 22:
                        Intent shahrukh2 = new Intent(Intent.ACTION_CALL);
                        shahrukh2.setData(Uri.parse("tel:+919711514099"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(shahrukh2);}
                        break;
                    case 23:
                        Intent shoeb = new Intent(Intent.ACTION_CALL);
                        shoeb.setData(Uri.parse("tel:+918439242459"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(shoeb);}
                        break;
                    case 24:
                        Intent shubham = new Intent(Intent.ACTION_CALL);
                        shubham.setData(Uri.parse("tel:+919557490700"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(shubham);}
                        break;
                    case 25:
                        Intent sudhanshu = new Intent(Intent.ACTION_CALL);
                        sudhanshu.setData(Uri.parse("tel:+919456412863"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(sudhanshu);}
                        break;
                    case 26:
                        Intent farhan = new Intent(Intent.ACTION_CALL);
                        farhan.setData(Uri.parse("tel:+918532831739"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(farhan);}
                        break;
                    case 27:
                        Intent talha = new Intent(Intent.ACTION_CALL);
                        talha.setData(Uri.parse("tel:+918272812971"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(talha);}
                        break;
                    case 28:
                    /**    Intent shadab = new Intent(Intent.ACTION_CALL);
                        shadab.setData(Uri.parse("tel:+919999999999"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(shadab);} */
                        break;
                    case 29:
                        Intent yusuf = new Intent(Intent.ACTION_CALL);
                        yusuf.setData(Uri.parse("tel:+918755026198"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(yusuf);}
                        break;
                    case 30:
                        Intent ankit = new Intent(Intent.ACTION_CALL);
                        ankit.setData(Uri.parse("tel:+917618332294"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(ankit);}
                        break;
                    case 31:
                        Intent anuj = new Intent(Intent.ACTION_CALL);
                        anuj.setData(Uri.parse("tel:+917351638321"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(anuj);}
                        break;
                    case 32:
                        Intent gaurav = new Intent(Intent.ACTION_CALL);
                        gaurav.setData(Uri.parse("tel:+919520616080"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(gaurav);}
                        break;
                    case 33:
                        Intent mayank = new Intent(Intent.ACTION_CALL);
                        mayank.setData(Uri.parse("tel:+917417967884"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(mayank);}
                        break;
                    case 34:
                        Intent nazar1 = new Intent(Intent.ACTION_CALL);
                        nazar1.setData(Uri.parse("tel:+917417802074"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(nazar1);}
                        break;
                    case 35:
                        Intent areeb = new Intent(Intent.ACTION_CALL);
                        areeb.setData(Uri.parse("tel:+918532833368"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(areeb);}
                        break;
                    case 36:
                     /**   Intent furquan = new Intent(Intent.ACTION_CALL);
                        furquan.setData(Uri.parse("tel:+919999999999"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(furquan);} */
                        break;
                    case 37:
                        Intent umair = new Intent(Intent.ACTION_CALL);
                        umair.setData(Uri.parse("tel:+919690733288"));

                        if (ActivityCompat.checkSelfPermission(BatchInfo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(BatchInfo.this, "Grant the permission to call", Toast.LENGTH_SHORT).show();
                            ActivityCompat.requestPermissions(BatchInfo.this, new String[]{Manifest.permission.CALL_PHONE},1);
                            return;
                        }else{ startActivity(umair);}
                        break;

                    default:
                }
            }
        });
    }

}