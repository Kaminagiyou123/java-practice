package com.company.Collection2;

import java.util.HashMap;
import java.util.Map;

public class Location {
    // set up as prviate final
    private final int locationID;
    private final String description;
    private final Map<String,Integer> exits;
// include all attributes in the constructor/signature
    public Location(int locationID, String description, Map<String,Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits!=null) {
            this.exits = new HashMap<>(exits);
        } else {
            this.exits=new HashMap<>();
        }
        this.exits.put("Q",0);
    }

    protected void addExit(String direction, int location){
        exits.put(direction,location);
    }
// only getter, not setter
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }
// create a shallow copy to protect internal map;
    public Map<String, Integer> getExits() {
        return new HashMap<String,Integer>(exits);
    }
}
