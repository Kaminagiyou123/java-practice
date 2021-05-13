package com.company.Generic.intro;

public class Intro2 {
    public static void main(String[] args) {
        FootballPlayer joe=new FootballPlayer("Joe");
        BaseballPlayer pat= new BaseballPlayer("Pat");
        SoccerPlayer beckham= new SoccerPlayer("Beckham");
        Team<FootballPlayer> adelaideCrows= new Team<FootballPlayer>("Adelaide Crows");

        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);
        System.out.println(adelaideCrows.numPlayers());
        Team<BaseballPlayer> baseballPlayerTeam=new Team<>("Chicago cubs");
        Team<SoccerPlayer> brokenTeam= new Team<SoccerPlayer>("this wont work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne= new Team<>("Melbourne");
        FootballPlayer banks= new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);
        Team<FootballPlayer> hawthorn=new Team<>("Hawthron");
        Team<FootballPlayer> fremantle=new Team<>("Fremantle");
        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult((fremantle),2,2);
        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));





    }



}
