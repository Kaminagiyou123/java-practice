package com.company.AbstractClass.intro;

public abstract class Bird extends Animal implements Ifly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "is pecking");
    }

    @Override
    public void breath() {
        System.out.println("Breathing in, breathing out.");

    }

    @Override
    public void fly() {
        System.out.println("flapping those wings");

    }
}
