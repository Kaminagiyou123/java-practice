package com.company.naming.Game;

import com.company.Interface.Challenge.ISaveable;

import java.util.ArrayList;
import java.util.List;

public class player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;
//constructor
    public player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon="Sword";
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
// method implemented from interface
    @Override
    public List<String> write() {
        List<String> list= new ArrayList<>();
        list.add(0,this.name);
        list.add(1,""+this.hitPoints);
        list.add(2,""+this.strength);
        list.add(3,this.weapon);
        return list;
    }

    @Override
    public void read(List<String> savedValue) {
        if (savedValue.size()>0 && savedValue!=null){
            this.name=savedValue.get(0);
            this.hitPoints=Integer.parseInt(savedValue.get(1));
            this.strength=Integer.parseInt(savedValue.get(2));
            this.weapon=savedValue.get(3);
        }

    }

    public String toString(){
        return "Player{name= "+this.name+", hitPoints= "+this.hitPoints+
                ", strength= "+this.strength+ ", weapon="+this.weapon+"}";
    }
}
