package com.company.Generic.intro;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDouble(items);


    }

    private static void printDouble(ArrayList n) {
        for (Object i : n) System.out.println((Integer) i * 2);
    }
}


