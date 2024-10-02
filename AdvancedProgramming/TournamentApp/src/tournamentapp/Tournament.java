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
abstract class Tournament {
    protected ArrayList<Team> invitedTeams;
    protected boolean isPlayed;
    
    public Tournament(){
        this.invitedTeams = new ArrayList();
        this.isPlayed = false;
    }
    
    public void inviteTeam(Team t){
        this.invitedTeams.add(t);
    };
    
    
    abstract void playMatches();
    
    abstract Team winner();
    
    
    
}
