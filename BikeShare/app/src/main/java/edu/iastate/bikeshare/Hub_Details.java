package edu.iastate.bikeshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Hub_Details extends AppCompatActivity {

    private ListView list;
    private Button request;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Hub Details");
        setContentView(R.layout.activity_hub__details);
        list = (ListView) findViewById(R.id.bikeListView);
        String[] bikes = {"Bike 11232     reserved", "Bike 11234     available", "Bike 11236     reserved", "Bike 12234     available", "Bike 12235     available", "Bike 12239     available", "Bike 11234     available", "Bike 11234     available", "Bike 11234     available", "Bike 11234     available", "Bike 11234     available", "Bike 11234     available", "Bike 11234     available", "Bike 11234     available"};
        ArrayAdapter array = new ArrayAdapter(this, android.R.layout.simple_list_item_1, bikes);
        list.setAdapter(array);
        request = (Button) findViewById(R.id.button3);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Hub_Details.this, "Request Sent", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
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


    private class info{
        private String name;
        private boolean reserved;
        public info(String bike, boolean reserve){
            this.name = bike;
            this.reserved = reserve;
        }
        public String getName(){
            return name;
        }
        public boolean getReserved(){
            return reserved;
        }
    }
}
