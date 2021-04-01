package string1;

// program to split a string into peices whereever the space is found
public class Stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// take a string str which is to be broken into pieces
String str = "Hello, this is a book on java";

//declare a string type array s to store peices

String s[];

//split the spring where the space is found in str

s = str.split(" ");

for(int i=0;i<=s.length;i++) {
	System.out.println(s[i]);
}
	}

}
