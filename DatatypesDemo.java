package basics;

/*
 * In java we have mainly two types of data types
 * 1. primitive
 * 		boolean either true or false - Boolean
 * 		char which will store single character - Character
 *		byte store integer values - Byte
 *		short store integer values - Short
 *		int store integer values -Integer
 *		long store integer values - Long
 *		float store floating point number -Float
 *		double store floating point number - Double
 * 	
 * 2. reference
 * 		Arrays
 * 		Strings
 * 
 *  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
 * are known as Wrapper classes. These are used to perform different operations on data.
 * 		1. Boolean
 * 		2. Character
 * 		3. Byte
 * 		4. Short
 * 		5. Integer
 * 		6. Long
 * 		7. Float
 * 		8. Double
 * 
 * 	WCData_type obj_name = new WCData_type(value);
 * 
 * 	Type Casting: converting one type of data to another type of data
 * 	up casting: lower memory type to higher memory type : widening : no data loss
 * 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
 * 
 * 	Converting primitive data type to wrapper class: boxing
 *  Converting wrapper to primitive : un-boxing
 * 
 * 
 * syntax to create primitive data type
 * data-type var-name  = value; //initialization
 * data-type var-name; //declaration
 * var-name = value; //assignment to the variable which is already declared
 * 
 * variable is nothing but name of memory location where we are storing data
 */
 

public class DatatypesDemo {
	
	public static void main(String[] args) {
		boolean b = true;
		System.out.println("boolean value is "+b);
		
		
		byte by = 123;
		System.out.println("byte value is "+by);
		System.out.println("min value of byte variable is = "+Byte.MIN_VALUE);
		System.out.println("max value of byte variable is = "+Byte.MAX_VALUE);
		System.out.println("size of byte variable is = "+Byte.SIZE);
		System.out.println("size in bytes of byte variable is = "+Byte.BYTES);
		
		short sh = 12345;
		System.out.println("short value is "+sh);
		System.out.println("min value of Short variable is = "+Short.MIN_VALUE);
		System.out.println("max value of Short variable is = "+Short.MAX_VALUE);
		System.out.println("size of Short variable is = "+Short.SIZE);
		System.out.println("size in bytes of Short variable is = "+Short.BYTES);
		
		int i = 1234567;
		System.out.println("int value is "+i);
		System.out.println("min value of Integer variable is = "+Integer.MIN_VALUE);
		System.out.println("max value of Integer variable is = "+Integer.MAX_VALUE);
		System.out.println("size of Integer variable is = "+Integer.SIZE);
		System.out.println("size in bytes of Integer variable is = "+Integer.BYTES);
		
		long ln = 12324567899l;
		System.out.println("long value is "+ln);
		System.out.println("min value of Long variable is = "+Long.MIN_VALUE);
		System.out.println("max value of Long variable is = "+Long.MAX_VALUE);
		System.out.println("size of Long variable is = "+Long.SIZE);
		System.out.println("size in bytes of Long variable is = "+Long.BYTES);
		
		
		float ft = 123.444f;
		System.out.println("float value is "+ft);
		System.out.println("min value of Float variable is = "+Float.MIN_VALUE);
		System.out.println("max value of Float variable is = "+Float.MAX_VALUE);
		System.out.println("size of Float variable is = "+Float.SIZE);
		System.out.println("size in bytes of Float variable is = "+Float.BYTES);
		
		double d = 1234555.444;
		System.out.println("double value is "+d);
		System.out.println("min value of Double variable is = "+Double.MIN_VALUE);
		System.out.println("max value of Double variable is = "+Double.MAX_VALUE);
		System.out.println("size of Double variable is = "+Double.SIZE);
		System.out.println("size in bytes of Double variable is = "+Double.BYTES);
		
//		In Java character occupies 2 bytes of memory for unicode formatting
		char ch = 's';
		System.out.println("character value is "+ch);
		System.out.println("min value of Character variable is = "+Character.MIN_VALUE);
		System.out.println("max value of Character variable is = "+Character.MAX_VALUE);
		System.out.println("size of Character variable is = "+Character.SIZE);
		System.out.println("size in bytes of Character variable is = "+Character.BYTES);
		
//		type casting :converting one primitive type another primitive type
//		up casting
		byte byt = 123;
		short sht = byt;
		System.out.println(sht);
		
//		down casting 
//		lower_datatype var_name = (lower_datatype) higher_datatype_var_name
		short st = 500;
		byte bt = (byte) st;
		System.out.println(bt);
		
		
//		primitive to wrapper
//		Integer iobj = new Integer(i);
		Integer iobj = Integer.valueOf(i);
		
//		wrapper to primitive
		Integer inObj = new Integer(10022);
		int iv = inObj.intValue();
		
		String s = "1234";
		int is = Integer.parseInt(s);
		System.out.println(is+10);
		
		int in = 1234;
		String sn = Integer.toString(in);
		System.out.println(sn+10);
		
		String s1 = "123.444";
		double ds = Double.parseDouble(s1);
		System.out.println(ds+10);
		
		
		double db = 1234.55;
		String sd = Double.toString(db);
		System.out.println(sd + 10);
	}

}
