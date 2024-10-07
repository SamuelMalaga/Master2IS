/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tournamentapp;

import java.util.ArrayList;
import java.util.Random;

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
        ArrayList<Team> remainingTeams = this.invitedTeams;
        ArrayList<Match> playedMatches = new ArrayList<>();
        Random rng = new Random();
        int passage = 0;
        System.out.println("COPY OF INVITED TEAMS");
        for(Team t: remainingTeams){
            System.out.println(t);
        }
        System.out.println("LOGIC TESTING--------------------------------");
        while(remainingTeams.size() != 1){
            //Selected Team A
            int teamAIndex = rng.nextInt(remainingTeams.size());
            Team participantA = remainingTeams.remove(teamAIndex);
            //Selected Team B
            int teamBIndex = rng.nextInt(remainingTeams.size());
            Team participantB = remainingTeams.remove(teamBIndex);
            //Match between A and B
            EliminationMatch em = new EliminationMatch(participantA,participantB);
            em.playMatch();
            playedMatches.add(em);
            //System.out.println(removedTeam2);
            System.out.println("Match played between | " + participantA + " and " + participantB);
            System.out.println("Winner is " + em.winner);
            remainingTeams.add(em.winner);
        }
        System.out.println("Played matches in this championship -> "+  playedMatches.size());
        System.out.println("Winner is "+  playedMatches.get(playedMatches.size()-1).winner);
        this.isPlayed = true;
    }
    
    

    @Override
    Team winner() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
