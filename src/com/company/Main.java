package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myIntegers = readInteger(2);
		reverseArr(myIntegers);
	}

	private static int[] readInteger(int count) {
		System.out.println("enter " + count + " numbers\r");
		int[] values = new int[count];
		for (int i = 0; i < count; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	public static int [] reverseArr(int[] Arr){
		int[] newArr= new int[Arr.length];
		for (int i=0;i<Arr.length;i++){
			newArr[i]=Arr[Arr.length-1-i];
			}

		System.out.println("The orginial array is "+ Arrays.toString(Arr));
		System.out.println("The new array is "+ Arrays.toString(newArr));
		return newArr;
	}

}