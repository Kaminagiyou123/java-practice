package com.company.naming.Access;

public class Password {
    private static final int key=9898;
    private final int encrytedPassword;

    public Password(int password) {
        this.encrytedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password ^key;
    }
    public final void storePassword(){
        System.out.println("saving password as "+this.encrytedPassword);
    }

    public boolean letMeIn(int password){
        if (encryptDecrypt(password)==this.encrytedPassword){
            System.out.println("Welcome");
            return true;
        }else {
            System.out.println("Incorrect password");
            return false;
        }
    }
}
