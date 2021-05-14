package com.company.naming.Access;

public class StaticTest {
    private static int numIntance=0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numIntance++;
    }

    public static int getNumIntance() {
        return numIntance;
    }

    public String getName() {
        return name;
    }
}
