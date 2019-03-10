package basics;
/* String is set of characters.
 * In Java Strings will be stored in a separate memory area known as String Constant Pool
 * Strings are immutable i.e. we can't change String values.
 * 
 *	//declare
 *	String obj_name = new String(string value);
 *	
 *	//string declaration using String literal
 *	String obj_name;
 *	
 *	//assign
 *	obj_name = "value";
 *	
 *	//retrieve
 *	using obj_name we can retrieve String data
 *
 *	//initialization
 *	String obj_name = "value";
 *
 * 	String class provides so many methods to manipulate string data
 */

public class StringsDemo {
	public static void main(String[] args) {
		String s1 = new String("selenium");
		String s2 = "manual";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);
		String s3 = "manual"; // now s2 and s3 are pointing to same memory location
		s2 = "automation";
		System.out.println(s3);
		System.out.println(s2);
		
	}

}
