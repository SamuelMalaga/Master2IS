/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tournamentapp;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author samuelaga
 */
public class WorldCup extends Tournament{
    
    public static int NUMBEROFPARTICIPANTS = 16; 
    

    @Override
    void playMatches() {
        //Blocks playMatch if the number of players is not enough
        if(this.invitedTeams.size() != this.NUMBEROFPARTICIPANTS)
        {
            throw new IllegalStateException("The number of players in the world cup needs to be 16");
        }
        ArrayList<Team> worldCupParticipants = this.invitedTeams;
        ArrayList<ArrayList<Team>> WCgroups = new ArrayList();
        //Prepares the groups
        Random rng = new Random();
        int groupNumber = 4;
        while(groupNumber > 0){
            ArrayList<Team> group = new ArrayList();
            int teamsInGroup = 4;
            //Populates the groups
            while(teamsInGroup > 0){
                int randomTeamIndex = rng.nextInt(worldCupParticipants.size());
                Team groupParticipant = worldCupParticipants.remove(randomTeamIndex);
                group.add(groupParticipant);
                teamsInGroup--;
            }
            WCgroups.add(group);
            System.out.println("Group number " + groupNumber+ " groupSize " + group.size());
            groupNumber--;
        }
        System.out.println("WC Groups "+ WCgroups.size());
    }
    

    @Override
    Team winner() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
