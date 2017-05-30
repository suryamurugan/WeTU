package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by surya on 21/5/17.
 */

public class QuestionsActivity extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.questions_layout, container, false);



        //////////////////////////vtu official site///////////////////////////////
        final Button vtuofficialsiteBut = (Button) rootView.findViewById(R.id.qpvtuofficial);
        vtuofficialsiteBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),WebviewActivity.class);
                intent.putExtra("vtuofficialsite","http://vtu.ac.in/model-question-paper");
                QuestionsActivity.this.startActivity(intent);
                Toast.makeText(getContext(), "Please provide storage access to download question papers",
                        Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////



        //////////////////////////vturesourcebut ///////////////////////////////
        final Button qpvturesourceBut = (Button) rootView.findViewById(R.id.qpvtures);
        qpvturesourceBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (getActivity(),WebviewActivity.class);
                intent.putExtra("vturesource","http://www.vturesource.com/vtu-question-papers/");
                QuestionsActivity.this.startActivity(intent);
                Toast.makeText(getContext(), "Please provide storage access to download question papers",
                        Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////


        //////////////////////////vtubuddybut ///////////////////////////////
        final Button vtubuddyBut = (Button) rootView.findViewById(R.id.qpvtubud);
        vtubuddyBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (getActivity(),WebviewActivity.class);
                intent.putExtra("vtubuddy","http://www.vtubuddy.com/vtu-question-papers/");
                QuestionsActivity.this.startActivity(intent);
                Toast.makeText(getContext(), "Please provide storage access to download question papers",
                        Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////



        //////////////////////////stupidsidbut ///////////////////////////////
        final Button stupidsidBut = (Button) rootView.findViewById(R.id.qpsid);
        stupidsidBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (getActivity(),WebviewActivity.class);
                intent.putExtra("stupidsid","http://www.stupidsid.com/study-resources/documents/university-papers");
                QuestionsActivity.this.startActivity(intent);
                Toast.makeText(getContext(), "Please provide storage access to download question papers",
                        Toast.LENGTH_LONG).show();
            }
        });
        ////////////////////////////////////////////////////////////////////////

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        return rootView;
    }



}


