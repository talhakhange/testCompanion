package com.example.android.testcompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class DataCommunications extends AppCompatActivity {

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
        String paperDetails = "CSM-3304 || Data Communications & Computer Networks  || CR:4";
        TextView OSPaperDetails = (TextView) findViewById(R.id.paper_details_field);
        OSPaperDetails.setText(paperDetails);

        String unit = "Unit I";
        String OSUnit1Details = "Introduction to Computer Networks: " +
                "\nEvolution of Computer Networks; Networks goals, uses and applications; " +
                "Network Hardware and Software; Protocol Hierarchies, Design issues for the Layer;" +
                " \n\nReference Models: \nOSI and TCP/IP; Example Networks-Internet, " +
                "ARPANET, NSFNET; Connection Oriented Networks: X.25, Frame Relay, and ATM. ";

        String unit2 = "Unit II";
        String OSUnit2Details = "Fundamentals of Data Transmission: \nData Transmission systems " +
                "and Operations; \n\nEncoding: \nStandard Encoding Schemes; " +
                "Line Coding SchemesUnipolar, Polar and Bipolar; Encoding of Digital " +
                "Data into Analog Signal-ASK, FSK, PSK, QAM; Encoding of Analog Data into Digital " +
                "Signals-PCM, DPCM, DM; Encoding and Correction Techniques; Multiplexing-TDM, FDM, STDM," +
                " WDM, DAM, CDMA; Techniques; Multiplexing-TDM, FDM, STDM, WDM, DAM, CDMA " +
                "\n\nTransmission Media: Magnetic media, Twisted wire-pair, Coaxial Cabler Fibre optics; " +
                "Wireless media-Radio and Microwave Transmission; Satellite Communication; " +
                "Terminal Handling-Polling Techniques; SwitchingMessage, Circuit and Packet " +
                "switching; Serial and Parallel TransmissionAsynchronous and Synchronous Transmission; ";

        String unit3 = "Unit III";
        String OSUnit3Details = "Routing Algorithms: \nIntroduction and Classification of R.A.; " +
                "Properties of R.A.; Optimality Principle; Shortest Path Routing; Multipath (MPA); " +
                "Centralized Routing; Hot Potato; Flooding; Distributed-Distance Vector  Routing; " +
                "Link State Routing; Routing in Ad Hoc Networks, etc. \n\nCongestion: " +
                "\nCongestion Control Algorithms, General Principle of Congestion Control; " +
                "Congestion Prevention Policies; Congestion Control in Virtual Circuit Subnet " +
                "and Datagram Subnet; Techniques for achieving good quality of service (QoS). Networks Performance Issues. ";

        String unit4 = "Unit IV";
        String OSUnit4Details = "Local Area Networks: " +
                "\nIEEE-802 Standards; Channel Allocation Schemes in LANs and MANs -ALOHA, CSMA; " +
                "Wireless LAN Protocols-MACA and MACAW; \n\nPopular LAN Technologies- \nEthernet, Token Ring, " +
                "ARCNet, ATM LANs etc; Wireless LANs-802.11 Protocol Stack; Broadband Wireless -802.16; " +
                "Bluetooth; Internetworking-Bridges, Switches, Routers and Gateways; Virtual. LANs. ";

        String unit5 = "Recommended Books";
        String OSUnit5Details = "\n1. Tanenbaum, A.S., Computer Networks, 4th Edition, PHI " +
                "\n\n2. Stallings, W., Data and Computer Communication, 8th Edition, PHI " +
                "\n\n3. Kurose, J.F., Ross, K.W., Computer Networking, Pearson Education " +
                "\n\n4. Forouzan, B. Data Communications and Networks, TMH " +
                "\n\n5. Forouzan, B. Local Area Networks, TMH. " +
                "\n\n6. James Martin, Satellite Communication System. " +
                "\n\n7. W.Tomasi, Introduction to Data Communications and Networking, Pearson Education ";

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
