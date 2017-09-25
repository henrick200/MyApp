package com.example.aluno.myapp;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView t1;
    MyLocation.LocationResult locationResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.tt);
         locationResult = new MyLocation.LocationResult() {
             @Override
             public void gotLocation(Location location) {

             }

         };
        MyLocation myLocation = new MyLocation();
        myLocation.getLocation(this, locationResult);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


}
