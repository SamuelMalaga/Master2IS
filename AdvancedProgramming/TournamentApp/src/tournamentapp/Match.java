package tournamentapp;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luffy
 */
public class Match {
    protected Team teamA;
    protected Team teamB;
    protected int scoreA;
    protected int scoreB;
    protected final int MAXSCORE=5;
    protected Team winner;
    protected boolean isPlayed;
    public Match(Team _teamA, Team _teamB)
    {
        this.teamA = _teamA;
        this.teamB = _teamB;
        this.winner = null;
        this.isPlayed = false;
    }
    
    public Team getTeamA()
    {
        return this.teamA;
    }
    
    public Team getWinner()
    {
        return this.winner;
    }
    
    public Team getTeamB()
    {
        return this.teamB;
    }
    
    public void playMatch()
    {
        Random rng = new Random();
        this.scoreA = rng.nextInt(MAXSCORE);
        this.scoreB = rng.nextInt(MAXSCORE);        
        if (this.scoreA>this.scoreB)
            this.winner = this.teamA;
        else if (this.scoreA< this.scoreB)
            this.winner = this.teamB;
        this.isPlayed = true;
    }
    
    @Override
    public String toString()
    {
        String str = this.teamA+" Vs. "+this.teamB;
        if (this.isPlayed)
            str+=": "+this.scoreA+" - "+this.scoreB;
        return str;
    }
}
