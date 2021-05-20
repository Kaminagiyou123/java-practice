package com.company.Collection2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain  {
    public static void main(String[] args) {
        Set<Integer> squares= new HashSet<>();
        Set<Integer> cubes= new HashSet<>();
        for (int i=1;i<=100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        System.out.println("There are "+squares.size()+" squares");
        System.out.println("There are "+cubes.size()+" cubes");
        Set<Integer> union= new HashSet<Integer>(squares);
        union.addAll(cubes);
        System.out.println("union contains "+union.size()+" integers.");
        Set<Integer> intersection= new HashSet<Integer>(squares);
        intersection.retainAll(cubes);
        System.out.println(" Intersections contains "+intersection.size()+" value below");
        for (Integer a: intersection){
            System.out.println(a);
        }

        Set<String> words= new HashSet<>();
        String sentence= "one day in the year of fox";
        String[] arrayWords= sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));
        for (String s:words){
            System.out.println(s);
        }

        Set<String> nature= new HashSet<>();
        Set<String> divine= new HashSet<>();
        String[] natureWords="all nature is but art unknown to thee".split(" ");
        String[] divineWords=" to err is human to forgive divine".split(" ");
        nature.addAll(Arrays.asList(natureWords));
        divine.addAll(Arrays.asList(divineWords));
        System.out.println("nature=>divine");
        Set<String> diff1= new HashSet<>(nature);
        diff1.removeAll(divine);
        for (String word:diff1){
            System.out.println(word);
        }
        System.out.println("divine=>nature");
        Set<String> diff2= new HashSet<>(divine);
        diff2.removeAll(nature);
        for (String word:diff2){
            System.out.println(word);
        }

        Set<String> unionTest= new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest= new HashSet<>(nature);
        intersectionTest.retainAll(divine);
        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        for (String word:unionTest){
            System.out.println(word);
        }













    }
}
