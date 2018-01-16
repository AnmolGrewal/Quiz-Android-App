package com.example.anmol.portandstarboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "UserClicks";
    private Game gameState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Button Port Left
        Button btnPort = findViewById(R.id.btnLeft);
        btnPort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Port (left) is red");
                Toast.makeText(getApplicationContext(), "Port (left) is red", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        //Button Starboard Right
        Button btnStarboard = findViewById(R.id.btnRight);
        btnStarboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Starboard (right) is green");
                Toast.makeText(getApplicationContext(), "Starboard (right) is green", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        //PART 2

        //Text View Change
        gameState = new Game();
        TextView randomLeftRight = findViewById(R.id.textView3);
        randomLeftRight.setText(gameState.getChosenSideName());

        //Button Means Left
        Button btnLeft = findViewById(R.id.answerLeft);
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gameState.checkIfCorrect(Game.Side.PORT)) {
                    Log.i(TAG, "User guess of Port was Correct!");
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Log.i(TAG, "User guess of Port was Incorrect!");
                    Toast.makeText(getApplicationContext(), "Incorrect. :(", Toast.LENGTH_SHORT)
                            .show();
                }
                gameState = new Game();
                TextView randomLeftRight = findViewById(R.id.textView3);
                randomLeftRight.setText(gameState.getChosenSideName());
            }
        });
        randomLeftRight.setText(gameState.getChosenSideName());

        //Button Means Right
        Button btnRight = findViewById(R.id.answerRight);
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gameState.checkIfCorrect(Game.Side.STARBOARD)) {
                    Log.i(TAG, "User guess of Starboard was Correct!");
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Log.i(TAG, "User guess of Starboard was Incorrect!");
                    Toast.makeText(getApplicationContext(), "Incorrect. :(", Toast.LENGTH_SHORT)
                            .show();
                }
                gameState = new Game();
                TextView randomLeftRight = findViewById(R.id.textView3);
                randomLeftRight.setText(gameState.getChosenSideName());
            }
        });
        randomLeftRight.setText(gameState.getChosenSideName());
    }



}
