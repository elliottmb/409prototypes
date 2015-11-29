package edu.iastate.bikeshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Move_Requests extends AppCompatActivity {

    private LinearLayout screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Move Requests");
        setContentView(R.layout.activity_move__requests);
        screen = (LinearLayout) findViewById(R.id.linearLayout);
        setupView();
    }

    private void setupView(){
        for(int i = 0; i< 10; i++){
            Button textview = new Button(this);
            textview.setText("Request " + i);
            screen.addView(textview);
        }
    }
}


