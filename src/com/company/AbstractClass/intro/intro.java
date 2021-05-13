package com.company.AbstractClass.intro;

public class intro {
    //interface defines what to do, not how to do it.
    public static void main(String[] args) {
        Dog dog=new Dog("Yorki");
        dog.breath();
        dog.eat();

        Bird parrot=new Parrot("Australian ringeck");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin=new Penguin("Emperor");
        penguin.fly();


    }
}
