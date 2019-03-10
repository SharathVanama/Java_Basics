package basics;
// this program expalins arrays in java

/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */

public class ArraysDemo {
	public static void main(String[] args) {
//		declaring an array
		int[] numbers = new int[5];

//		store the data in an array
		numbers[0] = 20;
		numbers[1] = 21;
		numbers[2] = 22;
		numbers[3] = 23;
		numbers[4] = 24;

//		retrieve the data from array
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);

//		normal for loop
//		for(int i = 0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}

//		for each loop
		/*
		 * for(collcetion_data_type var_name : collection_var_name){ statemnts; }
		 */
		for (int num : numbers) {
			System.out.println(num);
		}

//		initialize an array
		int[] marks = { 89, 45, 76, 66, 67, 78 };
		
		for(int mark : marks) {
			System.out.println(mark);
		}

//		find number of elements inside an array
		System.out.println(marks.length);

//	declaring 2D array
		int[][] matrix1 = new int[2][2];

//		store the values in 2D array
		matrix1[0][0] = 12;
		matrix1[0][1] = 13;
		matrix1[1][0] = 14;
		matrix1[1][1] = 12;

//		retrieve the data
		System.out.println(matrix1[0][0]);
		System.out.println(matrix1[0][1]);
		System.out.println(matrix1[1][0]);
		System.out.println(matrix1[1][1]);

//		initialize a 2D array
		int[][] matrix2 = { { 11, 12, 13 }, 
							{ 14, 15, 16 }, 
							{ 17, 18, 19 } };
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(matrix2[i][j]+"\t");
//			}
//			System.out.println();
//		}

		for(int[] rows : matrix2) {
			for(int cell : rows) {
				System.out.print(cell+"\t");
			}
			System.out.println();
		}
		
	}

}
