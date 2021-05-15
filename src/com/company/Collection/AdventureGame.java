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
        locations.get(1).addExist("W",2);
        locations.get(1).addExist("E",3);
        locations.get(1).addExist("S",4);
        locations.get(1).addExist("N",5);

        locations.get(2).addExist("N",5);
        locations.get(3).addExist("W",1);

        locations.get(4).addExist("N",1);
        locations.get(4).addExist("W",2);


        locations.get(5).addExist("S",1);
        locations.get(5).addExist("W",2);

        Map<String,String> vocabulary=new HashMap<String,String>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("EAST","E");
        vocabulary.put("WEST","W");

        int loc=1;
        while (true){
            System.out.println(locations.get(loc).getDescrption());
            if (loc==0){
                break;
            };
            Map <String,Integer> exits= locations.get(loc).getExits();
            System.out.println("Available exits are: ");
            for (String exit:exits.keySet()){
                System.out.println( exit +", ");
            }
            System.out.println();
            String direction= scanner.nextLine().toUpperCase();
            if (direction.length()>1){
                String[] words=direction.split(" ");
                for (String word: words){
                    if (vocabulary.containsKey(word)){
                        direction=vocabulary.get(word);
                        break;
                    }
                }
            }
            if (exits.containsKey(direction)){
                loc=exits.get(direction);
            } else{
                System.out.println("you can not go that direction");
            }


        }






    }

}
