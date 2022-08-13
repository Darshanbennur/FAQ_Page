package com.example.faq_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Versions> versionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        dataIn();
        setRecyclerView();
    }

    private void setRecyclerView() {
        versionsAdapter versionsAdapter = new versionsAdapter(versionsList);
        recyclerView.setAdapter(versionsAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void dataIn() {
        versionsList = new ArrayList<>();
        versionsList.add(new Versions("Q. What is Disaster Management ?","Disaster management is a process of effectively preparing for and responding to disasters. It involves strategically organizing resources to lessen the harm that disasters cause. It also involves a systematic approach to managing the responsibilities of disaster prevention, preparedness, response, and recovery."));
        versionsList.add(new Versions("Q. What is the aim of Disaster Management in India ?","In India, the main objective of disaster management is to reduce or avoid the potential loss which may be caused due to a hazard or disaster. Also, so that quick, apt and prompt steps can be taken for an effective recovery. The National Disaster Management Authority (NDMA) is the apex body that is responsible for Disaster Management in India. NDMA is headed by the Prime Minister of India."));
        versionsList.add(new Versions("Q. In how many categories can Disasters be classified ?","Disasters can be classified into the following categories:\n" +
                "•\tWater and Climate Disaster\n" +
                "•\tGeological Disaster\n" +
                "•\tBiological Disaster\n" +
                "•\tIndustrial Disaster\n" +
                "•\tNuclear Disasters\n" +
                "•\tMan-made disasters\n"));
        versionsList.add(new Versions("Q. What are the three stages of Disaster Management ?","The three stages of disaster management are:\n" +
                "•\tPre- disaster stage (preparedness)\n" +
                "•\tEmergency stage (Disaster phase or phase of catastrophe)\n" +
                "•\tPost- disaster stage (Rehabilitation/Recovery)"));
        versionsList.add(new Versions("Q. How are Disasters and Hazards different ?","Hazard is an event that has potential for causing injury/loss of life or damage to property/environment. Disaster is an event that occurs suddenly/unexpectedly in most cases and disrupts the normal course of life in affected area."));
        versionsList.add(new Versions("Q. What's the difference between a \"drill\" and an \"exercise\" ?","A drill is a test of a portion of the response organization (for example, a fire drill tests a facility's firefighting teams and the individuals in the vicinity of the area selected for that particular drill). \n" +
                "An \"exercise\" typically tests many facets of the response organization and often involves close coordination between licensee (onsite) and State and local (offsite) response organizations.\n"));
        versionsList.add(new Versions("Q. Hello ?","Ola!!"));
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}