package com.company.Generic.challenge;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " is already in the league " + this.name);
            return false;
        }
        league.add(team);
        System.out.println(team.getName() + " has been added to the league " + this.name);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + " : " + t.ranking());
        }
    }
}



