package practical8;

public class TestRegularPolygon {
	public static void main(String[] args) {

		// create an array with 5 Regular Polygon objects
		RegularPolygon[] arr = { new RegularPolygon(3, 10), new RegularPolygon(6, 4.0), new RegularPolygon(3, 1.0),
				new RegularPolygon(10, 5.0), new RegularPolygon(4, 6.5) };

		// print out each object
		for (int i = 0; i < arr.length; i++) {
			System.out.println("RegularPolygon " + (i + 1) + ": \n" + arr[i].toString() + "\nArea:" + arr[i].getArea()
					+ "\nPerimeter:" + arr[i].getPerimeter());
			
		}
		// find and print out the polygon with the smallest perimeter
		System.out.println("Regular Polygon with smallest perimeter: \n" + getSmallestPerimeter(arr).toString());

		// find and print out the polygon with the largest area
		System.out.println("Regular Polygon with largest area: \n" + getLargestArea(arr).toString());
	}

	// find a reference to the polygon with the smallest perimeter
	public static RegularPolygon getSmallestPerimeter(RegularPolygon[] arr) {
		int smallestPerimeterIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getPerimeter() < arr[smallestPerimeterIndex].getPerimeter()) {
				smallestPerimeterIndex = i;
			}
		}
		return arr[smallestPerimeterIndex];
	}

	// find a reference to the polygon with the largest area
	public static RegularPolygon getLargestArea(RegularPolygon[] arr) {
		int largestAreaIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getArea() > arr[largestAreaIndex].getArea()) {
				largestAreaIndex = i;
			}
		}
		return arr[largestAreaIndex];
	}

}
