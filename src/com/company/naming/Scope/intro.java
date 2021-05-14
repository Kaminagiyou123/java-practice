package com.company.naming.Scope;

public class intro {
    public static void main(String[] args) {
        String varFour="this is private to main()";
        ScopeCheck scopeInstance=new ScopeCheck();
       ScopeCheck.InnerClass innerClass=scopeInstance.new InnerClass();

//        System.out.println(scopeInstance.varOne);

    }

}

