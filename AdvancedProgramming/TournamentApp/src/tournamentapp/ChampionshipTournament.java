/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tournamentapp;

import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class ChampionshipTournament extends Tournament{
    
    protected ArrayList<Integer> points;
    
    public ChampionshipTournament()
    {
        super();
        this.points = new ArrayList<>();
        
    }

    @Override
    void playMatches() {
        this.initializePoints();
        ArrayList<Team> activeTournamentRound = this.invitedTeams;
        ArrayList<Team> nextTournamentRound = new ArrayList<>();
        
        
    }
    
    public void initializePoints(){
        for(int i=0; i < this.invitedTeams.size();i++)
            this.points.add(0);  // Initialize points to 0 for all teams
    };
    
    
    

    @Override
    Team winner() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
