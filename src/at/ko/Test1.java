package at.ko;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person jan = new Person("Mustermann", "Jan");
		
		System.out.println(jan.fullName());
		
		Employee max = new Employee("Mustermann", "Max", "1", 19);
		
		max.printAll();
	}

}
