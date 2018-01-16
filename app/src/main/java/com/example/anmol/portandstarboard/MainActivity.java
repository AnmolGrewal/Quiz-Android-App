package com.example.anmol.portandstarboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "UserClicks";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Button Port Left
        Button btnPort = (Button) findViewById(R.id.btnLeft);
        btnPort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Port (left) is red");
                Toast.makeText(getApplicationContext(), "Port (left) is red", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        //Button Starboard Right
        Button btnStarboard = (Button) findViewById(R.id.btnRight);
        btnStarboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Starboard (right) is green");
                Toast.makeText(getApplicationContext(), "Starboard (right) is green", Toast.LENGTH_SHORT)
                        .show();
            }
        });

    }



}
