package com.company.AbstractClass.intro;

public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name=name;
    }
    //forcing the method to be implemented
    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
}
