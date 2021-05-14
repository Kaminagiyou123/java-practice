package com.company.naming.Access;

public class static_Intro {
    public static int multiplier=7;
    public static void main(String[] args) {


//        StaticTest firstInstance=new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName()+" is instance number "+ StaticTest.getNumIntance());
//        StaticTest secondInstance=new StaticTest("2ed instance");
//        System.out.println(secondInstance.getName()+" is instance number "+StaticTest.getNumIntance());
//        StaticTest thirdInstance=new StaticTest("3rd instance");
//        System.out.println(thirdInstance.getName()+" is instance number "+StaticTest.getNumIntance());
        int answer=multiply(6);
        System.out.println("The answer is "+answer);

    }
    public static int multiply(int number){
        return number*multiplier;
    }
}
