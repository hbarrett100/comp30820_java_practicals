package practical10;

public class Faculty extends Employee {
	private String title;
	private String office;

	//no-arg constructor
	public Faculty() {
		title = "None";
		office = "Unkown";
	}

	//constructor to set instance variables to specified values
	public Faculty(String name, int age, String email, double salary, String title, String office) {
		super(name, age, email, salary); //call the super constructor
		this.title = title;
		this.office = office;
	}

	//get title
	public String getTitle() {
		return this.title;
	}
	
	// get office
	public String getOffice() {
		return this.office;
	}

	//set the value of title
	public void setTitle(String title) {
		this.title = title;
	}

	//set the value of office
	public void setOffice(String office) {
		this.office = office;
	}

	//override the toString method
	@Override
	public String toString() {
		return super.toString() + title + "\n" + office + "\n";
	}

}
