package basics;

public class StringMethods {
	
	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "core Java";
		String s3 = "";
		String s4 = "Welcome to Selenium course with core Java";
		
//		length() : it will return number of characters in a given string
		System.out.println(s1.length());
		
//		isEmpty() : which will return true if given string is empty
		System.out.println(s1.isEmpty()); //false
		System.out.println(s3.isEmpty()); // true
		
//		equals() : which will return true if given two strings are equal with considering the case
		System.out.println(s1.equals("selenium")); // true
		System.out.println(s2.equals("core java")); // false
		System.out.println(s1.equals(s3)); //false
		
//		equalsIngnoreCase() : which will return true if given two strings are equal without considering the case
		System.out.println(s1.equalsIgnoreCase("SELENIUM")); // true
		System.out.println(s2.equalsIgnoreCase("core java")); // true
		
//		contains() : which will return true if given sub string is present in a given string
		System.out.println(s4.contains(s1)); // false
		System.out.println(s4.contains(s2)); // true
		System.out.println(s4.contains("python")); //false
		
//		toLowerCase() : which will converts given string to lower case
		String s2l = s2.toLowerCase();
		System.out.println(s2l);
		
		System.out.println(s4.toLowerCase().contains(s1)); //true
		
//		toUpperCase() : which  will converts given string to upper case
		System.out.println(s1.toUpperCase());
		
		
//		charAt() : it will return a character at a given index number
		System.out.println(s1.charAt(6));
		
//		indexOf() : it will return index number of the given character first occurance
		System.out.println(s1.indexOf('i')); //5
		System.out.println(s1.indexOf('e')); //1
		System.out.println(s1.indexOf('w'));// -1
		
//		subString() : it will return a sub string from given string but it won't consider the ending index value
		System.out.println(s4.substring(5));
		System.out.println(s4.substring(7, 12));
		
//		replace() : it will replace old character or sub string with new character or sub string
		System.out.println(s1.replace('e', 'E'));
		System.out.println(s4.replace("Java", "Python"));
		
//		spilt() : which will return an array of substrings of a given strings divided based on expression
		String[] words = s4.split(" ");
		System.out.println(words.length);
		System.out.println(words[2]);
		
		
	}

}
