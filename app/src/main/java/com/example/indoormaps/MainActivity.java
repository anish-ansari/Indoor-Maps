package com.example.indoormaps;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;

import com.example.indoormaps.R;
import com.github.chrisbanes.photoview.PhotoView;


public class MainActivity extends AppCompatActivity {

    //ImageView img;
    EditText room;
    String Room;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PhotoView photoViewG = findViewById(R.id.photo_view);
        photoViewG.setImageResource(R.drawable.groundfloor);


        Button btnG = findViewById(R.id.btnG);
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                photoViewG.setImageResource(R.drawable.groundfloor);
            }
        });


        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final PhotoView photoView1 = findViewById(R.id.photo_view);
                photoView1.setImageResource(R.drawable.firstfloor);
            }
        });


        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final PhotoView photoView2 = findViewById(R.id.photo_view);
                photoView2.setImageResource(R.drawable.secondfloor);
            }
        });


        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final PhotoView photoView3 = findViewById(R.id.photo_view);
                photoView3.setImageResource(R.drawable.thirdfloor);
            }
        });

        room = (EditText) findViewById(R.id.SearchBar);
        final PhotoView photoViewGlob = findViewById(R.id.photo_view);

        Button btnSubmit = findViewById(R.id.search);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Room = room.getText().toString();

                //ground floor
                if(Room.equals("Library")||Room.equals("library"))
                    photoViewGlob.setImageResource(R.drawable.glibrary);

                else if(Room.equals("G Male Restroom")||Room.equals("g male restroom")||Room.equals("G male restroom"))
                    photoViewGlob.setImageResource(R.drawable.gmalerestroom);

                else if(Room.equals("G Female Restroom")||Room.equals("g female restroom")||Room.equals("G female restroom"))
                    photoViewGlob.setImageResource(R.drawable.gfemalerestroom);

                //first floor
                else if(Room.equals("Admission Department")||Room.equals("admission department")||Room.equals("Admission department"))
                    photoViewGlob.setImageResource(R.drawable.oadmissiondepartment);

                else if(Room.equals("LB 101")||Room.equals("lb 101")||Room.equals("101")||Room.equals("Lb 101"))
                    photoViewGlob.setImageResource(R.drawable.olb101);

                else if(Room.equals("LB 102")||Room.equals("lb 102")||Room.equals("102")||Room.equals("Lb 102"))
                    photoViewGlob.setImageResource(R.drawable.olb102);

                else if(Room.equals("LB 103")||Room.equals("lb 103")||Room.equals("103")||Room.equals("Lb 103"))
                    photoViewGlob.setImageResource(R.drawable.olb103);

                else if(Room.equals("Secretary of CSE")||Room.equals("secretary of cse")||Room.equals("Secretary of cse"))
                    photoViewGlob.setImageResource(R.drawable.osecretaryofcse);

                else if(Room.equals("HOD CSE")||Room.equals("hod cse")||Room.equals("Hod cse"))
                    photoViewGlob.setImageResource(R.drawable.ohodcse);

                else if(Room.equals("Chemistry Lab")||Room.equals("chemistry lab")||Room.equals("Chemistry lab"))
                    photoViewGlob.setImageResource(R.drawable.ochemistrylab);

                //second floor
                else if(Room.equals("LB 201")||Room.equals("lb 201")||Room.equals("201")||Room.equals("Lb 201"))
                    photoViewGlob.setImageResource(R.drawable.tlb201);

                else if(Room.equals("LB 202")||Room.equals("lb 202")||Room.equals("202")||Room.equals("Lb 202"))
                    photoViewGlob.setImageResource(R.drawable.tlb202);

                else if(Room.equals("LB 203")||Room.equals("lb 203")||Room.equals("203")||Room.equals("Lb 203"))
                    photoViewGlob.setImageResource(R.drawable.tlb203);

                else if(Room.equals("LB 204")||Room.equals("lb 204")||Room.equals("204")||Room.equals("Lb 204"))
                    photoViewGlob.setImageResource(R.drawable.tlb204);

                else if(Room.equals("Project Room")||Room.equals("project room")||Room.equals("Project room"))
                    photoViewGlob.setImageResource(R.drawable.tprojectroom);

                else if(Room.equals("Terrace")||Room.equals("terrace")||Room.equals("Terrace"))
                    photoViewGlob.setImageResource(R.drawable.tterrace);

                //third floor
                else if(Room.equals("Faculty Room")||Room.equals("faculty room"))
                    photoViewGlob.setImageResource(R.drawable.thfacultyroom);

                else if(Room.equals("Exam Division")||Room.equals("exam division")||Room.equals("Exam division"))
                    photoViewGlob.setImageResource(R.drawable.thexamdivision);

                else if(Room.equals("Exam Controller Room")||Room.equals("exam controller room")||Room.equals("Exam controller room"))
                    photoViewGlob.setImageResource(R.drawable.texamcontrollerroom);

                else if(Room.equals("Male Restroom")||Room.equals("male restroom")||Room.equals("Male restroom"))
                    photoViewGlob.setImageResource(R.drawable.thmalerestroom);

                else if(Room.equals("Female Restroom")||Room.equals("female restroom")||Room.equals("Female restroom"))
                    photoViewGlob.setImageResource(R.drawable.thfemalerestroom);

                else if(Room.equals("Project Division")||Room.equals("project division")||Room.equals("Project division"))
                    photoViewGlob.setImageResource(R.drawable.thprojectdivision);

                else if(Room.equals("Staff Restroom")||Room.equals("staff restroom")||Room.equals("Staff restroom"))
                    photoViewGlob.setImageResource(R.drawable.thstaffrestroom);

            }
        });


    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        dialog.cancel();
                    }
                })

                .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        MainActivity.super.onBackPressed();
                    }
                });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
