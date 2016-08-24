package day_04.Interface;

public class Employee implements Comparable<Employee>{
	private String firstName;
	private String lastName;
	private double salary;

	
	
	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary < o.salary)
			return -1;
		else if (this.salary > o.salary)
			return 1;
		else
			return 0;
	}
	
	
	

}
