package practical10;

public class Student extends Person {
	private String number;

	public Student() {
		number = "12345678";
	}

	public Student(String name, int age, String email, String number) {
		super(name, age, email);
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return super.toString() + number + "\n";
	}
}
