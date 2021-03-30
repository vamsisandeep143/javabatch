import java.io.*;
public class innerclass {
	//outer class
	// BankAccount
	private double bal;
	
	public innerclass(double bal) {
		this.bal = bal;
	}
	
	void contact(double r) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the password");
		String password = br.readLine();
		if(password.equals("sandeep"))
		{
			Interest ir = new Interest(r);
			ir.calculateInterest();
		}
		else
		{
			System.out.println("you dont have accesss");
			return;
		}
	}
	//inner class
	private class Interest{
		private double rate;
		Interest(double r){
	        rate = r;
		}
		
		void calculateInterest() {
			
			double interest = bal *rate/100;
			bal += interest;
			System.out.println(+bal);
		}
	}
	
	



	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
