package com.company.Collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameMain {
    private static Locations locations=new Locations();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


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
