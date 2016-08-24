package day_04.zad4;

import day_04.zad1.Person;

public class Employee extends Person{
	
	private double salary;
	private double commission;
	


	public Employee(String name, String surname, double salary) {
		super(name,surname);
		this.salary = salary;
	}
	
	public Employee(String name, String surname, double salary, double commision) {
		this(name, surname, salary);
		this.commission = commision;
	}
	
	public double annualSalary() {
		return 12*salary + commission;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

}
