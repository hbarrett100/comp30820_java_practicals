//Write a program to calculate the pairwise distance between points. 
//Each point is represented by an x and y coordinate. 

package practical6;

public class Q3 {
	public static void main(String[] args) {

		// create array
		double[][] points = getPoints();
		// display array
		displayArray(points);

		// create array containing distance
		double[][] distances = createDistanceArray(points);
		// display array of distances
		displayDistances(distances);

	}

	// return reference to two dimensional array containing the points
	// each array contains an x and y coordinate of a point
	// These are hard-coded in as per question specifications
	public static double[][] getPoints() {
		double[][] p = { { 1.5, -1.5 }, { -0.5, 2.5 }, { 3.5, 4.5 }, { 0, 0 }, { 0, 4 } };

		return p;
	}

	// display array of points
	public static void displayArray(double[][] arr) {
		System.out.println("The points are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Point " + (i + 1) + ": (" + arr[i][0] + "," + arr[i][1] + ")");
		}
		System.out.println();
	}

	// calculate the distance between two points
	public static double calculateDistance(double[] point1, double[] point2) {
		double distance = Math.sqrt((Math.pow(point2[0] - point1[0], 2)) + (Math.pow(point2[1] - point1[1], 2)));
		return distance;
	}

	// create array containing distance between two points
	public static double[][] createDistanceArray(double[][] points) {
		double[][] d = new double[points.length][points.length];

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				d[i][j] = calculateDistance(points[i], points[j]);
			}
		}
		// return the array of distances
		return d;
	}

	// display the distances
	public static void displayDistances(double[][] d) {
		System.out.println("The distances are:");
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.printf("%.2f ", d[i][j]);
			}
			System.out.println();
		}

	}

}
