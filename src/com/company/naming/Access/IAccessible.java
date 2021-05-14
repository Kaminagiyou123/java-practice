package com.company.naming.Access;

interface IAccessible {
    int SOME_CONTSTANT=800;
    public void methodA();
    void methodB();
    boolean methodC();
}
//it is not possible to get other than public methods.
//if the interface itself is package-private, then all methods are package-private.