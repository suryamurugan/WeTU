package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LibraryActivity extends Fragment {


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_library, container, false);


        ///////////////////// FOR NOTES ACTIVITY /////////////////////////////////
        Button notesbut = (Button) rootView.findViewById(R.id.notesbutton);
        notesbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),notes_main.class);
                LibraryActivity.this.startActivity(intent);
            }
        });

        ////////////////////////////////////////////////////////////////////////

        /////////////////// FOR QUESTIONPAPAERS ///////////////////////////////////////////
        Button quepap = (Button) rootView.findViewById(R.id.questionpap);

        quepap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),QuestionPapersLibraryActivity.class);
                LibraryActivity.this.startActivity(intent);

            }
        });

        ////////////// FOR LAB VIDEOS ?//////////////////////////
        Button labvideo= (Button) rootView.findViewById(R.id.labvd);

        labvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),LabVideosLibraryActivity.class);
                LibraryActivity.this.startActivity(intent);

            }
        });

        ///////////////////////////////////////////////////////////


        return rootView;


    }
}
