package com.company.Collection2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameMain {
    private static Locations4 locations=new Locations4();

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);

        Map<String,String> vocabulory= new HashMap<String,String >();
        vocabulory.put("NORTH","N");
        vocabulory.put("SOUTH","S");
        vocabulory.put("EAST","E");
        vocabulory.put("WEST","W");
        vocabulory.put("QUIT","Q");


//

        Location currentLocation=locations.getLocation(64);
        while (true){
            System.out.println(" You are currently at location "+currentLocation.getDescription());

            if (currentLocation.getLocationID() ==0){
                break;
            }
            Map <String,Integer>exits=currentLocation.getExits();
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
            currentLocation=locations.getLocation(currentLocation.getExits().get(direction));
        } else {
            System.out.println("You cannot go in that direction");
        }
        locations.close();
    }

    }
}
