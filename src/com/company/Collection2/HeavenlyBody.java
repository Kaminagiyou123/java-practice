package com.company.Collection2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID,
    }
    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key= new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites=new HashSet<HeavenlyBody>();

    }
    public static Key makeKey (String name, BodyTypes bodyType){
        return new Key(name, bodyType);
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }



    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addSatellite (HeavenlyBody moon){

        return this.satellites.add(moon);
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
       if (this==obj){
           return true;
       }
       if (obj instanceof HeavenlyBody)
       {
           HeavenlyBody theObject=(HeavenlyBody) obj;
          return this.key.equals(theObject.key);
       }

     return false;
    }
    @Override
    public String toString(){
        return this.key.name+" : "+ this.key.bodyType+", "+this.orbitalPeriod;
    }

    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        public Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return Objects.equals(name, key.name) && bodyType == key.bodyType;
        }


        @Override
        public int hashCode() {
            return this.name.hashCode()+57+this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return "Key{" +
                    "name='" + name + '\'' +
                    ", bodyType=" + bodyType +
                    '}';
        }
    }
}
