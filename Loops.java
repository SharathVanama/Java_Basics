package basics;

import java.util.Scanner;

/*
 * If we want to execute a block of code for certain number of times then 
 * we are going to use loops
 * Every loop will have three parts
 * 1. initialization
 * 2. condition
 * 3. increment or decrement

 * In Java we have mainly 4 types of loops
 * Infinite loop: A loop which will run forever
 * 
 * 1. while loop
 * 		initialization;
 * 		while(expression){
 * 			statements;
 * 			increment/decrement;
 * 		}
 *  While will verify the condition first then only it'll execute the statements. 
 * 	i.e If the while condition is true then the statements inside the while block will be executed
 * 	The minimum iteration count is 0
 * 	
 * 2. do while loop
 * 		initialization;
 * 		do{
 * 			statements;
 * 			increment/decrement;
 * 		}while(expression);
 *  do-while loop will execute the statement inside the do block for first time then it will verify 
 *  the condition of while . If it is true then the statements inside do block will repeat execution 
 *  else do-while block will be terminated.
 *  The minimum iteration count is 1
 * 
 * 3. for loop
 * 		for(initialization; expression; increment/decrement){
 * 			statements;
 * 		}
 * The minimum iteration count is 0
 * 
 * 4. for-each loop
 * 		It is used iterate over an array or collection
 * 		for(array_type var_name : array_var_name){
 * 			statements;
 * 		}
 * 
 * 
 * we can terminate the loop based on some expression using "break" statement
 * we can skip the current iteration of the loop based on some condition using "continue" statement
 */
public class Loops {

	public static void main(String[] args) {
		// while loop
		// initialization
		int i = 0;
		while (i <= 10) {
			System.out.print(i + "\t");
			i++;
		}

		System.out.println();

		// do while loop
		Scanner s = new Scanner(System.in);
		int num;
		do {
			System.out.println("enter a number");
			num = s.nextInt();
		} while (num % 2 == 0);

		// for loop
		for (int j = 10; j > 0; j--) {
			System.out.print(j+"\t");
		}
		System.out.println();
		
		//break statement
		i = 0;
		while(i<10) {
			if(i == 5) {
				break;
			}
			System.out.print(i+"\t");
			i++;
		}
		System.out.println();
		
		i = -1;
		while(i<10) {
			i++;
			if(i%2 == 1) {
				continue;
			}
			System.out.print(i+"\t");
		}

		System.out.println();
		
		//find given number is prime number or not
		boolean status = true;
		for(int k = 2; k<=num/2; k++) {
			if(num %k ==0) {
				status = false;
				break;
			}
		}
		if(status) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
		
		
		//print even number until given number
		for(int o = 2; o <= num; o++) {
			status = true;
			for(int il = 2; il <= o/2; il++) {
				if(o % il == 0) {
					status = false;
					break;
				}
			}
			if(status) {
				System.out.print(o+"\t");
			}
		}
		
		
		
	}

}
