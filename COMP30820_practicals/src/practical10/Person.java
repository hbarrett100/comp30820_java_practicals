package practical10;

public class Person {
	private String name;
	private int age;
	private String email;
	
	public Person() {
		this("Firstname Lastname", 0, "firstname.lastname@somemail.com");
	}
	
	public Person(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return name + "\n" + age +"\n" + email + "\n";
	}
}
