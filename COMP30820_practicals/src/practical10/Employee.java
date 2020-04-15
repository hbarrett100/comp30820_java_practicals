package practical10;

public class Employee extends Person {
	private double salary;
	
	//no-arg constructor
	public Employee() {
		salary = 0;
	}
	//constructor to set instance variables to specified values
	public Employee(String name, int age, String email, double salary) {
		super(name, age, email);
		this.salary = salary;
	}
	//get the salary
	public double getSalary() {
		return this.salary;
	}
	//set the value of salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//override the toString method
	@Override
	public String toString() {
		return super.toString() + salary + "\n";
	}

}
