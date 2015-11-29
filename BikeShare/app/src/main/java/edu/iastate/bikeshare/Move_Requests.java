package edu.iastate.bikeshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void setupView(){
        for(int i = 0; i< 10; i++){
            Button textview = new Button(this);
            textview.setText("Request " + i);
            screen.addView(textview);
        }
    }
}


