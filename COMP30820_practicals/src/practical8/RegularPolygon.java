//A class to represent a regular polygon

package practical8;

public class RegularPolygon {
	private int n; //number of sides in the polygon
	private double length; //the length of each side
	
	// a no-arg constructor to create an object with default values
	public RegularPolygon() {
		this(3,1);
	}
	// a constructor to create an object with specified values for n and length
	public RegularPolygon(int n, double length) {
		this.n = n;
		this.length = length;
	}
	//get n
	public int getN() {
		return n;
	}
	//get length
	public double getLength() {
		return length;
	}
	//set n
	public void setN(int n) {
		this.n = n;
	}
	// set length
	public void setLength(double length) {
		this.length = length;
	}
	// get perimeter
	public double getPerimeter() {
		return length*n;
	}
	// get area
	public double getArea() {
		return (n * Math.pow(length, 2))/4 * Math.tan(Math.PI/n);
	}
	// string representation of the regular polygon object
	public String toString() {
		return "Number of sides: " + n + "\nLength of sides: " + length;
	}
	
	
	
}

