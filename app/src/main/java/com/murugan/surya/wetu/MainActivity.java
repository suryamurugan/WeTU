package com.murugan.surya.wetu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private static final String TAG = "MainActivity";

    private AdView mAdView;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        ////////////// ADDING ICON TO THE TABS OF THE PAGES ////////////////////////////////
        tabLayout.getTabAt(0).setIcon(R.drawable.syllbus_tab);
        tabLayout.getTabAt(1).setIcon(R.drawable.questionpapers_tab);
        tabLayout.getTabAt(2).setIcon(R.drawable.results_tab);
        tabLayout.getTabAt(3).setIcon(R.drawable.notes_tab);
        ////////////////////////////////////////////////////////////////////////////
        tabLayout.getTabAt(0).setText("Syllabus");
        tabLayout.getTabAt(1).setText("Questions");
        tabLayout.getTabAt(2).setText("Results");
        tabLayout.getTabAt(3).setText("Labs");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,ContactusActivity.class);
                startActivity(intent);



            }
        });

    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position) {
                case 0:
                    SyllabusActivity syllabus= new SyllabusActivity();
                    return  syllabus;
                case 1:
                    QuestionsActivity questionpapers = new QuestionsActivity();
                    return questionpapers;
                case 2:
                    ResultsActivity results= new ResultsActivity();
                    return results;
                case 3:
                    NotesActivity notes = new NotesActivity();
                    return notes;

            }
            return null;


        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }


    }
}
