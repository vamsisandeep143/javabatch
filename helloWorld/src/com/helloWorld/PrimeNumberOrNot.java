package com.helloWorld;
import java.util.Scanner;

public class PrimeNumberOrNot {
	
	public int count(int y) {
		int j=0;
		for (int i = 2; i <= y; i++) {
			if (y%i == 0) {
				j++;
			}
		}	
		if (j>1) {
			System.out.printf("%d is Not a Prime Number", y);
		}
		else {
			System.out.printf("%d is a Prime Number", y);
		}
		return j;	
	}
	
	public static void main(String[] args) {		
		Scanner myInput = new Scanner(System.in);
		int x;
		System.out.printf("Enter the number to check prime or not: ");
		x = myInput.nextInt();
		PrimeNumberOrNot check = new PrimeNumberOrNot();
		check.count(x);
		// System.out.println(myInput);
	}
}