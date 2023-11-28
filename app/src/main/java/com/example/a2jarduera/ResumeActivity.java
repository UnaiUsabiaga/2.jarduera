package com.example.a2jarduera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResumeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        // Intent-era bidalitako datuak hartu berriro
        String izena = getIntent().getStringExtra("IZENA");
        String abizena = getIntent().getStringExtra("ABIZENA");
        String telefonoa = getIntent().getStringExtra("TELEFONOA");
        String email = getIntent().getStringExtra("EMAIL");
        String jaiotzeData = getIntent().getStringExtra("JAIOTZEDATA");

        // Textview ezberdinetan erakutsi datu bakoitza
        TextView IzenaTextView = findViewById(R.id.IzenaTextView);
        IzenaTextView.setText("Izena: " + izena);

        TextView AbizenaTextView = findViewById(R.id.AbizenaTextView);
        AbizenaTextView.setText("Abizena: " + abizena);

        TextView TelefonoaTextView = findViewById(R.id.TelefonoaTextView);
        TelefonoaTextView.setText("Telefonoa: " + telefonoa);

        TextView EmailTextView = findViewById(R.id.EmailTextView);
        EmailTextView.setText("Email: " + email);

        TextView JaiotzeDataTextView = findViewById(R.id.JaiotzeDataTextView);
        JaiotzeDataTextView.setText("Jaiotze data: " + jaiotzeData);

    }
}