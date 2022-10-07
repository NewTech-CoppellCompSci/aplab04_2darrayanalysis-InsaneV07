package lab;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {

		ArrayAnalysis analysis = new ArrayAnalysis();

		Scanner inKey = new Scanner(System.in);

		System.out.println("How many rows would you like");// asks user for number of rows they want.
		int row = inKey.nextInt();// holds users input for number of row

		System.out.println("How many colums would you like");// asks user for number of columns they want.
		int column = inKey.nextInt();// holds users input for number of columns

		System.out.println("What do you want as your minimum");// asks user for the minimum number they want.
		int min = inKey.nextInt();// holds users input for the minimum wanted

		System.out.println("What do you want as your maximum");// asks user for the maximum number they want.
		int max = inKey.nextInt();// holds users input for the maximum wanted

		int[][] arr1 = analysis.createRandom(row, column, min, max);

		System.out.println(analysis.sumTotal(arr1) + ":Total");// prints the total of array 1
		System.out.println(analysis.average(arr1) + ":Average");// prints the average of array 1
		System.out.println(analysis.findMax(arr1) + ":Max");// prints the maximum of array 1
		System.out.println(analysis.findMin(arr1) + ":Min");// prints the minimum of array 1

		System.out.println("How many rows would you like");// asks user for number of rows they want.
		int row2 = inKey.nextInt();// holds users input for number of row

		System.out.println("How many colums would you like");// asks user for number of columns they want.
		int column2 = inKey.nextInt();// holds users input for number of columns

		System.out.println("What do you want as your minimum");// asks user for the minimum number they want.
		int min2 = inKey.nextInt();// holds users input for the minimum wanted

		System.out.println("What do you want as your maximum");// asks user for the maximum number they want.
		int max2 = inKey.nextInt();// holds users input for the maximum wanted

		int[][][] arr2 = analysis.createRandom(row2, column2, min2, max2);

		System.out.println(analysis.sum3D(arr2) + ":Total");// prints the total of array 2
		System.out.println(analysis.average3D(arr2) + ":Average");// prints the average of array 2
		System.out.println(analysis.findMax(arr1) + ":Max");// prints the maximum of array 2
		System.out.println(analysis.findMin(arr1) + ":Min");// prints the minimum of array 2

		int[][] array3 = ArrayAnalysis.diffArrays(arr1, arr2); // runs the diffArrays method
		System.out.println("Printing the Difference in First & Second Array Values");// prints the difference of the
																						// first and second arry
		ArrayAnalysis.printArray(ArrayAnalysis.diffArrays(arr1, arr2));

		int array4[][] = ArrayAnalysis.transposeRow(arr1, 1);// runs the transposeRow method
		System.out.println("Transpose Array: ");// Prints the transpose array
		ArrayAnalysis.printArray(ArrayAnalysis.transposeRow(arr1, 1));

		// analysis is the name of the ArrayAnalysis object
		int[][][] arr3D = new int[3][4][5];// Created the 3D Array
		for (int i = 0; i < arr3D.length; i++) {
			arr3D[i] = analysis.createRandom(4, 5, -40, 200);
		}
		int x = 1;
		for (int[][] arr : arr3D) {
			System.out.println("\nLayer #" + x);
			analysis.printArray(arr);
			x++;

		}
		System.out.println("Sum of 3D array");// Prints the sum of the 3D Array
		System.out.println(analysis.sum3D(arr3D));// Runs the sum 3D method

		System.out.println("Average of 3D array");// Prints the average of the 3D Array
		System.out.println(analysis.average3D(arr3D));// Runs the average3D method
	}

}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
}
