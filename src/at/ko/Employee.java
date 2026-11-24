package at.ko;

public class Employee extends Person {
	private String employeId;
	private String supervisorId;
	private int salary;

	public Employee(String ln, String fn, String empId, int a) {
		super(ln, fn);
		this.employeId = empId;
		super.age = a;
	}
	
	public String getEmployeId() {
		return employeId;
	}
	
	public void printAll() {
		System.out.println("Employee " + super.fullName() + '\n' +
				"Age: " + super.age + '\n' +
				"EmployeeId: " + this.employeId + '\n' +
				"Salary: " + this.salary);
	}
	
	public void salaryIncrease(int amount) {
		this.salary += amount;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}
	
	public String getSupervisorId() {
		return supervisorId;
	}
}
