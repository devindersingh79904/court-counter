package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clearScores(View view)
    {
        scoreA = 0;
        scoreB = 0;
        displayforteamA();
        displayforteamB();
    }
    public void addThreeForTeamA(View view)
    {
        scoreA += 3;
        displayforteamA();
    }

    public void addTwoForTeamA(View view)
    {
        scoreA += 2;
        displayforteamA();
    }
    public void addOneForTeamA(View view)
    {
        scoreA += 1;
        displayforteamA();
    }

    public void addThreeForTeamB(View view)
    {
        scoreB += 3;
        displayforteamB();
    }

    public void addTwoForTeamB(View view)
    {
        scoreB += 2;
        displayforteamB();
    }
    public void addOneForTeamB(View view)
    {
        scoreB += 1;
        displayforteamB();
    }


    private void displayforteamA()
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    private void displayforteamB()
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
}
