package com.company.naming.Access;

public class intro2 {
    public static void main(String[] args) {
        SomeClass one=new SomeClass("one");
        SomeClass two=new SomeClass("two");
        SomeClass three= new SomeClass("three");
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
//        one.instanceNumber=4;
        System.out.println(Math.PI);

        int pw=665434;
        Password password=new Password(pw);
        password.storePassword();
        password.letMeIn(1);
        password.letMeIn(665434);




    }
}
