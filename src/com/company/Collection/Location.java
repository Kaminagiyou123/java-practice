package com.company.Collection;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String descrption;
    private final Map<String, Integer> exits;

    public Location(int locationID, String descrption) {
        this.locationID = locationID;
        this.descrption = descrption;
        this.exits=new HashMap<String, Integer>();
        this.exits.put("Q",0);
    }
    public void addExist(String direction, int location){
        exits.put(direction,location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescrption() {
        return descrption;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
