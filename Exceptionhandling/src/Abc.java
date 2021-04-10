
public class Abc {
	
	void method() {
		try {
			
			String str = "hello";
			char ch = str.charAt(5);
		}
		catch(StringIndexOutOfBoundsException sie) {
			System.out.println("please check the index within the range");
			throw sie;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc a = new Abc();
		try {
			a.method();
		}
		catch(StringIndexOutOfBoundsException sie) {
			sie.printStackTrace();
		}
	}

}
