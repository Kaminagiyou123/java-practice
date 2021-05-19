package com.company.Collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameMain {
    private static Map<Integer,Location> locations=new HashMap<Integer,Location>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        locations.put(0, new Location(0,"A"));
        locations.put(1, new Location(1,"B"));
        locations.put(2, new Location(2,"C"));
        locations.put(3, new Location(3,"D"));
        locations.put(4, new Location(4,"E"));
        locations.put(5, new Location(5,"F"));

        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);


        locations.get(2).addExit("N",5);

        locations.get(3).addExit("W",1);


        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);


        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);

        Map<String,String> vocabulory= new HashMap<String,String >();
        vocabulory.put("NORTH","N");
        vocabulory.put("SOUTH","S");
        vocabulory.put("EAST","E");
        vocabulory.put("WEST","W");
        vocabulory.put("QUIT","Q");


        int loc=1;
        while (true){
            System.out.println(" You are currently at location "+locations.get(loc).getDescription());
            if (loc ==0){
                break;
            }
            Map <String,Integer>exits=locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit: exits.keySet()){
                System.out.print(exit+ ", ");
            }
            System.out.println();

        String direction= scanner.nextLine().toUpperCase();

        if (direction.length()>1){
            String[] words=direction.split(" ");
            for (String word: words){
                if(vocabulory.containsKey(word)){
                    direction=vocabulory.get(word);
                }
            }
        }
            System.out.println("your input is " + direction);

        if (exits.containsKey(direction)){
            loc=exits.get(direction);
        } else {
            System.out.println("You cannot go in that direction");
        }
    }

    }
}
