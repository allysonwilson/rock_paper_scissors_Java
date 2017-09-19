package com.example.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RockPaperScissorsActivity extends AppCompatActivity {

    Button rockButton;
    TextView playerChoice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);

        rockButton = ( Button ) findViewById( R.id.rock_button );

        playerChoice = ( TextView ) findViewById( R.id.player_choice);
    }

public void onRockButtonClicked(View button) {
    String rock = "rock";
    playerChoice.setText( rock );
}

}
