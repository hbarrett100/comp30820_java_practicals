package practical8;

public class Circle {
	private double radius; // The radius
	private double x; // the x coordinate of the circle's center point
	private double y; // the y coordinate of the circle's center point
	private static int numberOfObjects = 0; // Number of objects created

	// Construct a circle with radius 1
	public Circle() {
		this(1.0, 0.0, 0.0);
	}

	// Construct a circle with the specified radius
	public Circle(double radius, double x, double y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
		numberOfObjects++;
	}

	// Return the radius
	public double getRadius() {
		return radius;
	}

	// return the x coordinate
	public double getX() {
		return x;
	}

	// return the y coordinate
	public double getY() {
		return y;
	}

	// Set a new radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// move the center point of the circle
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Return the number of objects created
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	// Return the area
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// get the perimeter
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	// get the distance between the center points of this circle and another circle
	public double getDistance(Circle c) {
		return Math.sqrt(Math.pow(this.x - c.getX(), 2) + Math.pow(this.y - c.getY(), 2));
	}

	// Return a string representation
	// this toString() method is overriding the toString() method from the Object class
	@Override
	public String toString() {
		return "radius = " + radius + ", x coordinate: " + x + ", y coordinate: " + y;
	}

}
