package com.company.Generic.challenge;

public class Challenge {
    public static void main(String[] args) {
        League <Team<FootballPlayer>> footballLeague=new League<>("AFL");
        Team<FootballPlayer> adelaideCrows= new Team<>("AdelaideCrows");
        Team<FootballPlayer> melbourne= new Team<>("Melbourne");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(fremantle);
        footballLeague.showLeagueTable();

    }
}
