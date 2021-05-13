package com.company.AbstractClass.intro;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Penguin can not fly");
    }
}
