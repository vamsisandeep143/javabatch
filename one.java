
public class one {
int x;
two t;
one(two t){
	this.t = t;
	x = 10;
}

void display() {
	System.out.println("value of x is"+x);
	t.display(); // access two method
	System.out.println(" accessing two value" +t.y);
	
}
}
