package com.company.Boxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches= new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        Branch foundBranch= findBranch(name);
        if(foundBranch==null){
            this.branches.add(new Branch(name));
            System.out.println("Branch "+name+ "has been added to the bank." );
            return true;
        }
        System.out.println("Branch "+name+ "already exists." );
        return false;
    }

    public boolean addCustomer(String branchName,String customerName,double initialTransaction){
        Branch foundBranch= findBranch(branchName);
        if (foundBranch!=null){
           return foundBranch.newCustomer(customerName,initialTransaction);
           }
        System.out.println("Branch "+ branchName+ " doesn't exist.");
        return false;
        }

        public boolean addCustomerTransaction(String branchName,String customerName,double transaction){
            Branch foundBranch= findBranch(branchName);
            if (foundBranch!=null){
            return foundBranch.addCustomerTransaction(customerName,transaction);
        }
            System.out.println("Branch "+ branchName+ " doesn't exist.");
        return false;
        }

        private Branch findBranch(String branchName){
            for (int i=0;i<this.branches.size();i++){
                if (branches.get(i).getName().equals(branchName)){
                    return this.branches.get(i);
                }
            }
            return null;
    }

    public boolean listCustomers(String branchName,boolean printTransactions){
       Branch foundBranch=findBranch(branchName);
        if(foundBranch!=null){
            System.out.println("Customer details for branch "+branchName);
            for (int i=0;i<foundBranch.getCustomers().size();i++){
                System.out.println("["+i+"]"+ foundBranch.getCustomers().get(i).getName()+".");
                if(printTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions=foundBranch.getCustomers().get(i).getTransactions();
                    for (int j=0;j<transactions.size();j++){
                        System.out.println("["+(j+1)+"] Amount "+transactions.get(j) );
                    }
                }

            }

            return true;
        }
        return false;
    }





    }

