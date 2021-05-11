package com.company;
//list extends collection
//array extends list
//list is a resizable array;

import java.util.ArrayList;

public class Main {
	//reference type

	public static void main(String[] args) {
		Customer customer=new Customer("Tim",54.95);
		Customer anotherCustomer=customer;
		anotherCustomer.setBalance(12.22);
		System.out.println("Balance for customer " + customer.getName()+
				" is "+ customer.getBalance());
		ArrayList<Integer> intList=new ArrayList<Integer>();
		intList.add(1);
		intList.add(3);
		intList.add(4);
		for (int i=0;i<intList.size();i++){
			System.out.println(i+" is "+ intList.get(i));
		}
		intList.add(1,2);
		for (int i=0;i<intList.size();i++){
			System.out.println(i+" is "+ intList.get(i));
		}







	}

	public static class Customer {
		private String name;
		private double balance;

		public Customer(String name, double balance) {
			this.name = name;
			this.balance = balance;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public String getName() {
			return name;
		}

		public double getBalance() {
			return balance;
		}
	}
}


