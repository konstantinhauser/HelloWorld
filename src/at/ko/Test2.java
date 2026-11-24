package at.ko;

public class Test2 {
	
	public static void main(String[] args) {
		Employee max = new Employee("Mustermann", "Max", "1", 19);
		Employee gerald = new Employee("Mayer", "Gerald", "0", 42);
		
		gerald.setSalary(3000);
		max.setSupervisorId(gerald.getSupervisorId());
		max.setSalary(1500);
		
		gerald.printAll();
		max.printAll();
		
		max.salaryIncrease(100);
		
		System.out.println("New salary: " + max.getSalary());
	}
	
}
