package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by surya on 21/5/17.
 */

public class SyllabusActivity extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.syllabus_layout, container, false);



        /////////////////////////// THIS IS FOR PHY BUTTON ////////////////////////////////
        final Button physicscycle = (Button) rootView.findViewById(R.id.pcyclebutton);
        physicscycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),PhysicsmainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////// THIS IS FOR CHEMISTRY BUTTON ////////////////////////////////
        final Button chemistrycycle = (Button) rootView.findViewById(R.id.chemcyclebutton);
        chemistrycycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChemistrymainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////
        /////////////////FOR PARENT BRANCHES ///////////////////////////////////////////////////////////////
        /////////////////////////// THIS IS FOR COMPUTER SCIENCE BUTTON ////////////////////////////////
        final Button Csecycle = (Button) rootView.findViewById(R.id.csebutton);
        Csecycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CsbranchmainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////// THIS IS FOR INFORMATION SCIENCE BUTTON ////////////////////////////////
        final Button Iscycle = (Button) rootView.findViewById(R.id.isbutton);
        Iscycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),IsbranchmainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////// THIS IS FOR ELECTRONICS AND COMMUNICATION BUTTON ////////////////////////////////
        final Button Ececycle = (Button) rootView.findViewById(R.id.ecebutton);
        Ececycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),EcebranchmainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////// THIS IS FOR MECHANICAL BUTTON ////////////////////////////////
        final Button Mecycle = (Button) rootView.findViewById(R.id.mebutton);
        Mecycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MechbranchmainActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////// THIS IS FOR CIVIL BUTTON ////////////////////////////////
        final Button cvcycle = (Button) rootView.findViewById(R.id.cvbutton);
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
