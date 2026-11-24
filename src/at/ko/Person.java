package at.ko;

public class Person {
	private String name;
	private String firstName;
	public int age;
	
	public Person(String ln, String fn) {
		this.name = ln;
		this.firstName = fn;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String fullName() {
		return firstName + " " + name;
	}
}
