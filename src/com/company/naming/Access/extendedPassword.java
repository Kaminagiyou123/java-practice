package com.company.naming.Access;

public class extendedPassword extends Password{
    private int decryptedPassword;
    public extendedPassword(int password) {
        super(password);
        this.decryptedPassword=password;
    }
//    @Override
////    public void storePassword(){
////        System.out.println("saving password as "+this.decryptedPassword);
////    }
}
