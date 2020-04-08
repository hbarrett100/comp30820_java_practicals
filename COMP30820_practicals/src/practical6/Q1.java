// Write the following method that returns the location of the largest element in a 2-D array. 
//The return value is a 1-D array that contains two elements. 
//	These two elements indicate the row and column indices of the largest element in the 2-D array.

package practical6;

public class Q1 {
	public static void main(String[] args) {

		// create 2D array
		double[][] myArr = createArray(2, 4);

		// display the array
		displayArray(myArr);

		// invoke getMaxIndices method
		int[] largest = getMaxIndices(myArr);

		// display the location of the largest value
		System.out.println("The location of the largest value is: " + largest[0] + " " + largest[1]);
	}

	// return new array populated with random values in the interval [0,10)
	public static double[][] createArray(int n, int m) {
		double[][] newArr = new double[n][m];
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++)
				newArr[i][j] = Math.random() * 10;
		}
		// return the array
		return newArr;

	}

	// return location of largest element in 2D array
	public static int[] getMaxIndices(double[][] arr) {
		int[] maxIndices = { 0, 0 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > arr[maxIndices[0]][maxIndices[1]]) {
					maxIndices[0] = i;
					maxIndices[1] = j;
				}
			}
		}
		// return the array of indices
		return maxIndices;
	}

	// display the array
	public static void displayArray(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++)
				System.out.printf("%.3f ", arr[i][j]);
			System.out.println();
		}
	}
}
