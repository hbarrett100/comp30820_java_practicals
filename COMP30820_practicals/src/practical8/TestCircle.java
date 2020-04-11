package practical8;

public class TestCircle {
	public static void main(String[] args) {
		// create first Circle object
		Circle c1 = new Circle(5, 2, -1);
		
		// display the circle
		System.out.println("c1: " + c1.toString());
		
		// move the circle to point (3,4)
		c1.move(3, 4);
		
		// set the radius to 10
		c1.setRadius(10);
		
		// display the circle
		System.out.println("c1: " + c1.toString());
		
		// create second circle object with default values
		Circle c2 = new Circle();
		//display the circle, its area and perimeter
		System.out.println("c2: " + c2.toString());
		System.out.println("Area of c2: %.2f\n" + c2.getArea());
		System.out.println("Perimeter of c2: %.2f\\n" + c1.getPerimeter());
		
		
		// distance between center points of first and second circles:
		double distance = c1.getDistance(c2);
		System.out.println("The distance between the two circles is: " + distance);
		
		// display the number of Circle objects created
		System.out.println("Number of circle objects created: " + Circle.getNumberOfObjects());
		
	}
}