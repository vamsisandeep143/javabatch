package typeCasting;

public class Casting_specialization {
	public static void main(String[] args) {
		One a;	//reference variable of a superclass
		Two b;	//reference variable of a subclass

		//b = (Two)new One();	// Specialization: creating an object of subclass and referring to a super class variable
								//we cannot access any of the methods of the superclass or subclass in the specialization. 
								//We will get 0% functionality in this case.
		
		
		a = new Two();	//superclass reference refers to subclass object
		b = (Two)a;	//Narrowing bcz we are converting class One's reference type as class Two's type.
		
		b.show(); // calling the method
	}
}