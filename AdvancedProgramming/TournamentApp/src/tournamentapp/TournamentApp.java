/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tournamentapp;

/**
 *
 * @author luffy
 */
public class TournamentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AllToAllTournament tournament = new AllToAllTournament();
        WorldCup wc = new WorldCup();
        Team Team1 = new Team("Team 1", "Country A");
        Team Team2 = new Team("Team 2", "Country B");
        Team Team3 = new Team("Team 3", "Country C");
        Team Team4 = new Team("Team 4", "Country D");
        Team Team5 = new Team("Team 5", "Country E");
        Team Team6 = new Team("Team 6", "Country F");
        Team Team7 = new Team("Team 7", "Country G");
        Team Team8 = new Team("Team 8", "Country H");
        Team Team9 = new Team("Team 9", "Country I");
        Team Team10 = new Team("Team 10", "Country J");
        Team Team11 = new Team("Team 11", "Country K");
        Team Team12 = new Team("Team 12", "Country L");
        Team Team13 = new Team("Team 13", "Country M");
        Team Team14 = new Team("Team 14", "Country N");
        Team Team15 = new Team("Team 15", "Country O");
        Team Team16 = new Team("Team 16", "Country P");
        System.out.println("-------------------WORLDCUP");
        wc.inviteTeam(Team1);
        wc.inviteTeam(Team2);
        wc.inviteTeam(Team3);
        wc.inviteTeam(Team4);
        wc.inviteTeam(Team5);
        wc.inviteTeam(Team6);
        wc.inviteTeam(Team7);
        wc.inviteTeam(Team8);
        wc.inviteTeam(Team9);
        wc.inviteTeam(Team10);
        wc.inviteTeam(Team11);
        wc.inviteTeam(Team12);
        wc.inviteTeam(Team13);
        wc.inviteTeam(Team14);
        wc.inviteTeam(Team15);
        wc.inviteTeam(Team16);
        wc.playMatches();
        
        //EliminationMatch testMatch = new EliminationMatch(cruzeiro,lyon);
        System.out.println("-------------------TEST");
        tournament.inviteTeam(Team1);
        tournament.inviteTeam(Team2);
        tournament.inviteTeam(Team3);
        tournament.inviteTeam(Team4);
        tournament.playMatches();
        System.out.println(tournament);
        System.out.println(tournament.runnerUp());
        //System.out.println(tournament);     
        //System.out.println("-------------------EliminationTournament");
        //ChampionshipTournament ChampTournament = new ChampionshipTournament();
        //tournament.inviteTeam(Team1);
        //tournament.inviteTeam(Team2);
        //tournament.inviteTeam(Team3);
        //tournament.inviteTeam(Team4);
        //ChampTournament.playMatches();
    }
    
}
