/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tournamentapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 */
public class EliminationMatch extends Match {
    private int penaltyScoreTeamA;
    private int penaltyScoreTeamB;
    private boolean isPenaltyPlayed = false;
    
    public EliminationMatch(Team _teamA, Team _teamB) {
        super(_teamA, _teamB);
    }
    
    @Override
    public void playMatch()
    {
        super.playMatch();
        if (this.getWinner()==null)
        {
            this.winner = this.playPenalty();
        }
    }
    
    public Team playPenalty()
    {
        this.isPenaltyPlayed = true;
        ArrayList<Integer> possibleScores = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        Random rng = new Random();
        //TEAM A PENALTY 
        int teamAScoreIndex = rng.nextInt(possibleScores.size());
        int teamAPenaltyScore = possibleScores.remove(teamAScoreIndex);
        this.penaltyScoreTeamA = teamAPenaltyScore;
        //TEAM B PENALTY
        int teamBScoreIndex = rng.nextInt(possibleScores.size());
        int teamBPenaltyScore = possibleScores.remove(teamBScoreIndex);
        this.penaltyScoreTeamB = teamBPenaltyScore;
        if(teamAPenaltyScore > teamBPenaltyScore){
            this.winner = this.teamA;
            return this.teamA;
        } else{
            this.winner = this.teamB;
            return this.teamB;
        }
    }
    
    @Override
    public String toString()
    {
        String str = this.teamA+" Vs. "+this.teamB;
        if (this.isPlayed)
            str+=": "+this.scoreA+" - "+this.scoreB;
        if (this.isPenaltyPlayed)
            str+=" | Penalty Results -> "+this.teamA+" "+this.penaltyScoreTeamA+" - "+this.teamB+" "+this.penaltyScoreTeamB;
        return str;
    }
    
}
