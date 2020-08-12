package com.example.scoring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threePts(View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }
    public void twoPts(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }
    public void freePts(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }
    public void threePtsTeamB(View view) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }
    public void twoPtsTeamB(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }
    public void freePtsTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }
    public void resetTheScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
