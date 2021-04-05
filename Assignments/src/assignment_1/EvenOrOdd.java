package assignment_1;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int x;
		System.out.println("Enter the Number: ");
		x = number.nextInt();
		
		String test = ((x%2==1) ? ("Odd Number") : ("Even Number"));
		
		System.out.println(test);

	}
}