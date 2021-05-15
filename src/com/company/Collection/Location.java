package com.company.Collection;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String descrption;
    private final Map<String, Integer> exists;

    public Location(int locationID, String descrption) {
        this.locationID = locationID;
        this.descrption = descrption;
        this.exists=new HashMap<String, Integer>();
    }
    public void addExist(String direction, int location){
        exists.put(direction,location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescrption() {
        return descrption;
    }

    public Map<String, Integer> getExists() {
        return new HashMap<String, Integer>(exists);
    }
}
