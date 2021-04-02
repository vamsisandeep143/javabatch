package typeCasting;

public class Casting_generalization {
	public static void main(String[] args) {
		One a;	//reference variable of a superclass
		//Two b;	//reference variable of a subclass

		a = new Two();	// Generalization (widening) (implicit casting): 
						// a is referring to a subclass object
		a.show(); // calling the method
	}
}