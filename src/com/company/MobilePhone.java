package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on File");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition=findContact(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getName() +" was not found ");
            return false;
        } else if(findContact(newContact.getName())!=-1){
            System.out.println("Contact with Name"+ newContact.getName()+
                    " already exists! failure");
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+" was replaced by "+ newContact.getName());
        return true;
    };

    public String queryContact(Contact contact){
        if (findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public boolean removeContact(Contact contact){
        int foundPosition=findContact(contact);
        if(foundPosition<0){
            System.out.println(contact.getName() +" was not found ");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() +" was deleted ");
        return true;
    }
    public void printContacts(){
        for (int i=0;i<this.myContacts.size();i++){
            System.out.println((i+1)+ "."+
                    this.myContacts.get(i).getName()+" -> "+
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
    public Contact queryContact(String name){
        for (int i=0;i<this.myContacts.size();i++){
            if (this.myContacts.get(i).getName().equals(name)){
                return myContacts.get(i);
            }
        }
        return null;
    }




//overload the two findContact method;
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}