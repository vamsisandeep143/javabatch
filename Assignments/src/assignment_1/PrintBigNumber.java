// Print the Biggest Number

package assignment_1;
import java.util.Scanner;

public class PrintBigNumber {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		int x;
		String y;
		System.out.println("Enter the First Number: ");
		x = number.nextInt();
		System.out.println("Enter the Second Number: ");
		y = number.next();
		
		System.out.println(y);
		//int max = (x>y ? x : y);
		
		//System.out.println(max);
	}
}