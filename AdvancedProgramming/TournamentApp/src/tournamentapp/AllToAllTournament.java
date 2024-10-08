package tournamentapp;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luffy
 */
public class AllToAllTournament extends Tournament {
    
    protected ArrayList<Integer> points;
    protected ArrayList<Match> playedMatches;

    
    public AllToAllTournament()
    {
        super();
        this.points = new ArrayList<>();
        this.playedMatches = new ArrayList<>();
    }
    
    @Override
    public String toString()
    {
        String str="";
        for (Match m: this.playedMatches)
            str+=m+"\n";
        
        if (this.isPlayed){
            str+="Winner :"+this.winner()+"\n";
            Team winner = this.winner();
            str+="IndexOfWinner :" + this.invitedTeams.indexOf(winner) + "\n";
            str+="Points of Winner :"+this.points.get(this.invitedTeams.indexOf(winner));
        }   
        return str;
    }

    @Override
    void playMatches(){
        //Initialize tournament points
        this.initializePoints();
        
        for(int i=0; i<this.invitedTeams.size()-1;i++)
            for(int j=i+1; j<this.invitedTeams.size();j++)
            {
                Match m = new Match(this.invitedTeams.get(i), this.invitedTeams.get(j));
                m.playMatch();
                this.playedMatches.add(m);
                Team winner = m.getWinner();
                if (winner==null)
                {
                    this.points.set(i, this.points.get(i)+1);
                    this.points.set(j, this.points.get(j)+1);
                }
                else if (winner==m.getTeamA())
                {
                    this.points.set(i, this.points.get(i)+2);
                }
                else
                    this.points.set(j, this.points.get(j)+2);
            }
        this.isPlayed = true;
    }
    
    
    public void initializePoints(){
        for(int i=0; i < this.invitedTeams.size();i++)
            this.points.add(0);  // Initialize points to 0 for all teams
    };
    
    @Override
    Team winner(){
        Team winner = null;
        int maxscore = 0;
        for (int i=0; i<this.points.size();i++)
        {
            if (this.points.get(i) > maxscore)
            {
                maxscore = this.points.get(i);
                winner = this.invitedTeams.get(i);
            }
        }
        return winner;
    }
    
    public Team runnerUp(){
        System.out.println("RUNNER UP LOGIC all teams");
        for(Team t: this.invitedTeams){
            int teamIndex = this.invitedTeams.indexOf(t);
            System.out.println("Team "+t);
            System.out.println("Points "+this.points.get(teamIndex));    
        }
        System.out.println("\n RUNNER UP LOGIC losers");
        Team winner = this.winner();
        int winnerIndex = this.invitedTeams.indexOf(winner);
        ArrayList<Team> losers = this.invitedTeams;
        losers.remove(winnerIndex);
        ArrayList<Integer> losersPoints = this.points;
        losersPoints.remove(winnerIndex);
        Team runnerUp = null;
        int maxscore = 0;
        for (int i=0; i<losersPoints.size();i++)
        {
            if (losersPoints.get(i) > maxscore)
            {
                maxscore = losersPoints.get(i);
                runnerUp = losers.get(i);
            }
        }
        return runnerUp;
    }
}
