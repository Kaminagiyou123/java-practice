package com.company.Collection2;

import java.util.HashMap;
import java.util.Map;
//put +the same key means the value will be overriden
public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages= new HashMap<>();
        languages.put("Java","JAVAJAVAJAVA");
        languages.put("Python","PPPPPPPPP");
        languages.put("Algol","AA");
        languages.put("BASIC","BBBBBBBB");
        languages.put("Lisp","Therein lies madness");
        System.out.println(languages.get("Java"));
        languages.put("Java","The course is about java");
        System.out.println(languages.get("Java"));
        System.out.println( languages.put("Javascript","new element"));// returns null;
        System.out.println( languages.put("Lisp","LISP"));//return the previous value;

        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java","this is a new Java course");
        }

        System.out.println("==================");
//        languages.remove("Lisp");
        if (languages.remove("Algol","AA")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        if (languages.replace("Lisp","LISP","this is a new entry")){
            System.out.println("this is replaced");
        }else{
            System.out.println("this is not replaced");
        };
        System.out.println(languages.replace("Scala","this will not be added"));
        for (String key: languages.keySet()){
            System.out.println(key+" : "+languages.get(key));
        }



    }
}
