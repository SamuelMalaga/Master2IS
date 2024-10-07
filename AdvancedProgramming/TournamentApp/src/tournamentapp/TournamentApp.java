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
        Team cruzeiro = new Team("Cruzeiro", "Brazil");
        Team lyon = new Team("Lyon", "France");
        Team pumas = new Team("Pumas", "Mexico");
        Team marseille = new Team("Marseille", "France");
        Team vasco = new Team("Vasco", "Brasil");
        System.out.println("-------------------AllToAllTournament");
        //EliminationMatch testMatch = new EliminationMatch(cruzeiro,lyon);
        
        tournament.inviteTeam(cruzeiro);
        tournament.inviteTeam(lyon);
        tournament.inviteTeam(pumas);
        tournament.inviteTeam(marseille);
        tournament.playMatches();
        System.out.println(tournament);     
        System.out.println("-------------------EliminationTournament");
        ChampionshipTournament ChampTournament = new ChampionshipTournament();
        ChampTournament.inviteTeam(cruzeiro);
        ChampTournament.inviteTeam(lyon);
        ChampTournament.inviteTeam(pumas);
        ChampTournament.inviteTeam(marseille);
        ChampTournament.inviteTeam(vasco);
        ChampTournament.playMatches();
    }
    
}
