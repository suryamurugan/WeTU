package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by surya on 21/5/17.
 */

public class SyllabusActivity extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.syllabus_layout, container, false);





        /////////////////////////// THIS IS FOR PHY BUTTON ////////////////////////////////
        final CardView physicscycle = (CardView ) rootView.findViewById(R.id.pcyclebutton);
        physicscycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),PhysicsmainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////// THIS IS FOR CHEMISTRY BUTTON ////////////////////////////////
        final CardView chemistrycycle = (CardView) rootView.findViewById(R.id.chemcyclebutton);
        chemistrycycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChemistrymainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////
        /////////////////FOR PARENT BRANCHES ///////////////////////////////////////////////////////////////
        /////////////////////////// THIS IS FOR COMPUTER SCIENCE BUTTON ////////////////////////////////
        final CardView Csecycle = (CardView) rootView.findViewById(R.id.csebutton);
        Csecycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CsbranchmainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////// THIS IS FOR INFORMATION SCIENCE BUTTON ////////////////////////////////
        final CardView Iscycle = (CardView) rootView.findViewById(R.id.isbutton);
        Iscycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),IsbranchmainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////// THIS IS FOR ELECTRONICS AND COMMUNICATION BUTTON ////////////////////////////////
        final CardView Ececycle = (CardView) rootView.findViewById(R.id.ecebutton);
        Ececycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),EcebranchmainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////// THIS IS FOR MECHANICAL BUTTON ////////////////////////////////
        final CardView Mecycle = (CardView) rootView.findViewById(R.id.mebutton);
        Mecycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MechbranchmainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////// THIS IS FOR CIVIL BUTTON ////////////////////////////////
        final CardView cvcycle = (CardView) rootView.findViewById(R.id.cvbutton);
        cvcycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CvbranchmainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////


        /*








*/return rootView;

    }

}
