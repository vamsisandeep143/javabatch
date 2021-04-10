package cloning;

public class cloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee em = new Employee(10,"Sandeep");
		//original object
		em.getData();
		
	Employee e2 = (Employee)em.myclone();
	e2.getData();
	}

}
