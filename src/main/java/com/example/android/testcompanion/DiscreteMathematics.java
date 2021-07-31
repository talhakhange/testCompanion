package com.example.android.testcompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class DiscreteMathematics extends AppCompatActivity {

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
        String paperDetails = " CSM-3306 || Discrete Mathematics || CR:2";
        TextView OSPaperDetails = (TextView) findViewById(R.id.paper_details_field);
        OSPaperDetails.setText(paperDetails);

        String unit = "Unit I\nSet Theory and Mathematical Logic";
        String OSUnit1Details = "\nSet Theory: \n\nReview of set theory, Relations and Functions, " +
                "Group, Monoid, Field, Ring. \n\nMathematical Logic: \nPropositions, connectives, " +
                "conditional and bi-conditional, well formed formulas, tautologies, " +
                "equivalence of formulas, duality law, normal forms, " +
                "inference theory for propositional calculus, Predicate Calculus, " +
                "Inference theory of the predicate calculus.";

        String unit2 = "Unit II\nOrder Relations and Structures, Recurrence Relation";
        String OSUnit2Details ="\nRelations and Functions, Partially Ordered Sets and Lattice, " +
                "Hasse Diagram, Topological Sorting. \n\nRecurrence Relation, " +
                "Recurrence relations using substitution and characteristic roots method, " +
                "Solutions of recurrence relation using generating function.";

        String unit3 = "Unit III\nGraph Theory-I";
        String OSUnit3Details = "\nFormal definition of graphs, Directed and undirected Graphs, " +
                "Sub-graph, Isomorphism, \n\nCircuit  Connectivity,  Eulerian and Hamiltonian " +
                "paths and circuits, Elements of Transport  Networks, Flows in Networks. Cut sets. ";

        String unit4 = "Unit IV\nGraph Theory-II";
        String OSUnit4Details ="\nCovering and Matching-Basics, Matchings in bipartite graphs, " +
                "Perfect matchings, \n\nVertex Colourings- Chromatic number and cliques, " +
                "Colouring Algorithms. \n";

        String unit5 = "Recommended Books and references";
        String OSUnit5Details = "\nBOOKS\n\n1. Discrete Mathematical Structures for computer science By Kolman, Busby (PHI) \n\n" +
                " 2. Theory of Computer Science By K.L.P. Mishra and N.Chandrasekaran, (PHI) \n\n" +
                " 3. Elements of Discrete Mathematics By C. L. Liu, Mc Graw-Hill International \n\n" +
                " 4. Discrete Mathematics for Computer Scientists By JoY L. Mott., Abraham Kandel,  " +
                "Theodore P. Baker Publisher : Reston, A Prentice Hall Company \n\n" +
                "5. Discrete Mathematical Structures for Computer Science By Bernard Kolman " +
                "and Robert C. Busby, Eastern Economy Edition (PHI)\n\n" +
                "6. Discrete Mathematics By Olympia Nicodemmi, CBS Publication\n\n" +
                "7. Discrete Mathematical Structures with Applications to Computer Science By J.P. Tremblay and R. Manohar, (McGraw-Hill)" +
                "\n\nREFERENCES" +
                "\n\n1. D.E. Knuth ―The Art of Computer Programming‖ (3rd ed.), Vol. 1, Addison Wesley, 1997 \n\n" +
                " 2. K.D. Joshi ―Foundations of Discrete Mathematics‖ New Age International Publishers, 2003 \n\n" +
                " 3. D.S. Malik and M.K. Sen ―Discrete Mathematical Structures: Theory and Applications‖ " +
                "Thomson Learning, 2004\n\n" +
                "4. R.L. Graham, D.E. Knuth, O. Patashnik ―Concrete Mathematics‖ (2nd ed.), Addison-Wesley, 1994. ";

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
