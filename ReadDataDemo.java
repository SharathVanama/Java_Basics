package basics;


import java.util.Scanner;

/*
 * To read data from the console we have to use Scanner class in Java
 * This Scanner class provides lot of methods to read different types of data 
 * from the console
 */
public class ReadDataDemo {
	public static void main(String[] args) {
//		create Scanner class object
		Scanner s = new Scanner(System.in);
//		read an integer
		System.out.println("enter a number");
		int i = s.nextInt();
		System.out.println("integer value is "+i);
		
//		read a float
		System.out.println("enter a floating point number");
		float f = s.nextFloat();
		System.out.println("float value is "+f);
		
//		read a string
		System.out.println("enter your name");
		String str = s.next();
		System.out.println("string value is "+str);
		
//		read a boolean 
		System.out.println("are you registered?");
		boolean b = s.nextBoolean();
		System.out.println("boolean value is "+b);
		
//		read character
		System.out.println("enter gender");
		char ch = s.next().charAt(0);
		System.out.println("your gender is "+ch);
		
	}

}
