package com.company.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdventureGame {
    private static Map<Integer,Location> locations=new HashMap<Integer, Location>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        locations.put(0,new Location(0,"A"));
        locations.put(1,new Location(1,"B"));
        locations.put(2,new Location(2,"C"));
        locations.put(3,new Location(3,"D"));
        locations.put(4,new Location(4,"E"));
        locations.put(5,new Location(5,"F"));

        int loc=1;
        while (true){
            System.out.println(locations.get(loc).getDescrption());
            if (loc==0){
                break;
            };
            loc= scanner.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("You can go that direction");
            }
        }




    }

}
