package basics;

import java.util.Scanner;

/*These are used to execute a block of statements based on some condition
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 * 
 * 
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements 
 * inside else block will be executed
 * 
 * 
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and 
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 * 
 * 
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 * 
 * 
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1;
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 * 	
 * 
 */

public class ConditionalStatements {
	
	public static void main(String[] args) {
		String[] courses = {"c", "python", "java", "selenium", "testing"};
		
		int i = -1011;
		// if statement
		if(courses.length == 5) {
			System.out.println("we are providing all 5 courses");
		}
		boolean status = false;
		
		for(String course : courses) {
			if(course.equals("protractor")) {
				status = true;
				break;
			}
		}
		if(status) {
			System.out.println("course available");
		}else {
			System.out.println("course not available");
		}
		
		
		if(i >= 0) {
			System.out.println("given number is a positive number");
		}
		
		
		if(i%2 == 0) {
			System.out.println("i is a even number");
		}else {
			System.out.println("i is a odd number");
		}
		
		//else if ladder
		String browser = "firefox";
		if(browser.equals("chrome")){
			System.out.println("chrome browser launched");
		}else if(browser.equals("firefox")) {
			System.out.println("firefox browser launched");
		}else if(browser.equals("opera")) {
			System.out.println("opera browser launched");
		}else {
			System.out.println("invalid browser");
		}
		
		int marks =55;
		if(marks >= 0 && marks <40) {
			System.out.println("failed");
		}else if(marks >= 40 && marks < 50) {
			System.out.println("passed");
		}else if(marks >= 50 && marks < 60) {
			System.out.println("second class");
		}else if(marks >= 60 && marks < 70) {
			System.out.println("first class");
		}else if(marks >= 70 && marks <= 100) {
			System.out.println("destinction");
		}else {
			System.out.println("invaid marks");
		}
		
		
		//nested if
		Scanner s = new Scanner(System.in);
		System.out.println("enter username");
		String uname = s.next();
		if(uname.equalsIgnoreCase("sharath")) {
			System.out.println("enter password");
			String pass = s.next();
			if(pass.equals("Satyam")) {
				System.out.println("welcome sharath");
			}else {
				System.out.println("invalid password");
			}
		}else {	
			System.out.println("invalid username");
		}
		
		
		//switch case
		switch(browser) {
		case "chrome":
			System.out.println("chrome browser launched");
			break;
		case "firefox":
			System.out.println("firefox browser launched");
			break;
		case "opera":
			System.out.println("opera browser launched");
			break;
		case "ie":
			System.out.println("ie browser launched");
			break;
		default:
			System.out.println("invalid browsers");
		}
		
		int day = 2;
		
		switch(day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("no matching key");
		}
		
		
		//given character is vowel or not
		char ch = 'u';
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("given character is vowel");
		}else {
			System.out.println("given characte is not vowel");
		}
	}

}
