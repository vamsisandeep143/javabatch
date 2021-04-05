package assignment_2;

import java.io.*;

public class LeapYear {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		InputStreamReader arun = new InputStreamReader(System.in);
		BufferedReader teja = new BufferedReader(arun);
		System.out.print("Enter the year to check Leap year or not: ");
		//String x = teja.readLine();
		int y = Integer.parseInt(teja.readLine());
		
		if (y%4==0 && y%100!=0) {
			System.out.println(y + " is a leap year");
		}
		else if(y%400==0) {
			System.out.println(y + " is a leap year");
		}
		else System.out.println(y+" is not a leap year");

	}

}
