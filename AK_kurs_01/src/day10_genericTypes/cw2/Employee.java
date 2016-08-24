package day10_genericTypes.cw2;

public class Employee implements Comparable<Employee>{

	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary > o.salary)
			return 1;
		if (this.salary < o.salary)
			return -1;
		
		return 0;
	}

	public String toString(){
		return name + " " + salary;
	}
	
	
	
}
