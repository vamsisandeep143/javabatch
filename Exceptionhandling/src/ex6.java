
public class ex6 extends Exception {
// to throw whenever balance amount is below 1000
	private static int accNo[] = {1001,1002,1003};
	
	private static String name[] = {"Sandeep","kishore","ramu"};
	
	private static double bal[] = {3000.00,1000.00,900.00};
	
	ex6(){
		
	}
	
	ex6(String str){
		
	super(str);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	System.out.println("accNo"+"customername"+"");
	
	for(int i=0;i<5;i++) {
		System.out.println(accNo[i] +"\t"+name[i]+"\t"+bal[i]);
		if (bal[i] < 1000)
		{
		ex6 e = new ex6("bal is low ");
				throw e;
		}
	}
	
	
}
catch (ex6 e) {
	e.printStackTrace();
}
	}

}
