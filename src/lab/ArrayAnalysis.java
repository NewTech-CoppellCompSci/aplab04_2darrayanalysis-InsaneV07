package lab;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {

    public static int generateRandomInt(int upper, int lower) {
        int random = lower + (int) (Math.random() * (upper - lower + 1));

        return random;
    }

    // #1
    public static int[][] createRandom(int row, int column, int min, int max) {
        int[][] array1 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int num = generateRandomInt(max, min);
                array1[i][j] = num;

            }
            System.out.println(array1);
        }

        return array1;
    }

    // #2
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

    // #3
    public static int sumTotal(int[][] arr) {
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                row += arr[i][j];
            }
        }
        return row;
    }

    // #4
    public static double average(int[][] arr) {

        double Average = sumTotal(arr) / (arr.length * arr[0].length);

        return Average;
    }

    // #5
    public static int findMin(int[][] arr) {
        int min = 99999999;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
        }
        return min;
    }

    // #6
    public static int findMax(int[][] arr) {
	    int max = -99999999;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
        }
		return max;
	}

    // #7
    public static int[][] diffArrays(int[][] arr1, int[][] arr2) {
        int[][] newArr = new int[arr1.length][arr1[0].length];

        if ((arr1.length == arr2.length) && (arr1[0].length == arr2[0].length)) {// makes sure the 1st and second array
                                                                                    // are equal rows and columns

            for (int row = 0; row < arr1.length; row++) {// runs through the rows
                for (int col = 0; col < arr1[row].length; col++) {// runs through the columns

                    newArr[row][col] = arr1[row][col] - arr2[row][col];// calculates the difference in the 2 arrays
                }
            }
        }

        return newArr;// returns the new Array
    }

        



    // #8
    public static int[][] transposeRow(int[][] arr1, int dist) {
        //create new array
		int[][] newArr = new int[arr1.length][arr1[0].length];

		// loop through rows of randArray
		for (int row = 0; row < arr1.length - 1; row++) {
			// moves the the rows down by one
			newArr[row + 1] = arr1[row];
		}

		// stores the last row of randArray in first row of the newArray

		newArr[0] = arr1[arr1.length - 1];

		return newArr; // return newArray Method
    }

    // #9
    public static int sum3D(int[][][] arr) {
        int sum = 0;// initial sum value

		for (int i = 0; i < 3; i++) {

			sum += sumTotal(arr[i]);       // prints the total of the 3D array
		}
        return sum;

	}

    

    // #10
    public static double average3D(int[][][] arr) {
       double avg = (double)sum3D(arr)/(arr.length*arr[0].length*arr[0][0].length);
        return avg;
	

    }
}