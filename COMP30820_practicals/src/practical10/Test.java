package practical10;

public class Test {
	public static void main(String[] args) {
		// declare, create and initialise an array of Person objects
		Person[] people = {
				new Faculty("C. Darwin", 45, "c.darwin@species.com", 150000, "Prof", "Room 101"),
				new Person("J. Doe", 30, "j.doe@supermail.com"), 
				new Student("A. Bee", 20, "a.bee@bettermail.com", "19000091"), 
				new Employee("B. Cee", 25, "b.cee@okmail.com", 50000), 
				new Student(),
				new Faculty("A. Einstein", 35, "a.einstein@emc2.com", 100000, "Prof", "Room 202")					
		};
		
		// display the objects
		display(people);
		
		// display student numbers
		displayNumbers(people);
		
		// display faculty offices
		displayOffices(people);
	}
	
	// displays each object in the array
	public static void display(Person[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i].toString());
	}
	
	// displays the student number of each Student object in the array
	public static void displayNumbers(Person[] arr) {
		System.out.println("Student numbers:");
		
		for (int i = 0; i < arr.length; i++)
			if (arr[i] instanceof Student)
				System.out.println( ((Student)arr[i]).getNumber() );
		
		System.out.println();
	}	
	
	// displays the office of each Faculty object in the array
	public static void displayOffices(Person[] arr) {
		System.out.println("Faculty offices:");
		
		for (int i = 0; i < arr.length; i++)
			if (arr[i] instanceof Faculty) 
				System.out.println( ((Faculty)arr[i]).getOffice() );
		
		System.out.println();
	}
}
