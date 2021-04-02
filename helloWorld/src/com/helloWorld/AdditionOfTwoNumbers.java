package com.helloWorld;
import java.util.Scanner;

public class AdditionOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner( System.in );
	      int a;
	      int b;
	      int sum;
	      System.out.print( "Enter first integer: " );
	      a = myInput.nextInt();
	      System.out.print( "Enter second integer: " );
	      b = myInput.nextInt();
	      sum = a + b;
	      System.out.printf( "Sum = %d\n", sum );
	   
	}
}