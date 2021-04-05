package assignment_3;
import java.util.Scanner;

public class ArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the number of elements in an array: ");
		int y = x.nextInt();
		int array[] = new int[y];
		
		System.out.println("Enter the elements in an array: ");		
		for(int i=0; i<y; i++) {
			array[i] = x.nextInt();
		}
		
		System.out.println("The array you have entered is: ");
		for (int i=0; i<y; i++) {
			System.out.print(array[i] + " ");
		}		
	}
}