package com.company.Boxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName)==null) {
            this.customers.add(new Customer(customerName, initialTransaction));
            System.out.println("customer "+customerName+ " added with initial balance of "+initialTransaction);
            return true;
        }
        System.out.println("customer "+customerName+ " already exists, addition failure" );
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        if (findCustomer(customerName)!=null){
            findCustomer(customerName).addTransaction(transaction);
            System.out.println("customer "+customerName+ " has a new transaction of "+transaction);
            return true;
        }
        System.out.println("customer "+customerName+ "doesn't exist" );
        return false;
    }

    private Customer findCustomer(String customerName){
        for (int i=0;i<customers.size();i++) {
            if (this.customers.get(i).getName().equals(customerName)) {
                return this.customers.get(i);
            }
        }
        return null;
    }

}


