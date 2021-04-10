package cloning;

public class Employee implements Cloneable {

	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	void getData() {
		System.out.println("id" + id);
		System.out.println("name" +name);
		
	}
	
	public Object myclone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
	
	
	
}
