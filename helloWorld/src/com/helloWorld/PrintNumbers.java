package com.helloWorld;
import java.util.Scanner;


public class PrintNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Print Natural numbers till what Number: ");
		x = input.nextInt();
		
		if (x<1) {
			System.out.println("Enter the Positive Number");
		}
		else {
			for (int i =1; i<=x; i++) {
				System.out.println(i);
			}
		}

	}

}
