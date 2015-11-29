package edu.iastate.bikeshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class Maintenance extends AppCompatActivity {

    private Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Request Maintenance");
        setContentView(R.layout.activity_maintenance);
        spin = (Spinner) findViewById(R.id.spinner);
    }
}
