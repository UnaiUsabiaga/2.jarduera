package com.example.a2jarduera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TextBox-eatatik datuak hartu
                String izena = ((EditText) findViewById(R.id.editTextText)).getText().toString();
                String abizena = ((EditText) findViewById(R.id.editTextText2)).getText().toString();
                String telefonoa = ((EditText) findViewById(R.id.editTextPhone)).getText().toString();
                String email = ((EditText) findViewById(R.id.editTextTextEmailAddress)).getText().toString();
                String jaiotzeData = ((EditText) findViewById(R.id.editTextDate)).getText().toString();

                // Intent berria sortu beste leihora pasatzeko
                Intent intent = new Intent(MainActivity.this, ResumeActivity.class);

                // Intent berriari datuak pasa
                intent.putExtra("IZENA", izena);
                intent.putExtra("ABIZENA", abizena);
                intent.putExtra("TELEFONOA", telefonoa);
                intent.putExtra("EMAIL", email);
                intent.putExtra("JAIOTZEDATA", jaiotzeData);

                // Inten berria abian jarri
                startActivity(intent);
            }
        });
    }
}