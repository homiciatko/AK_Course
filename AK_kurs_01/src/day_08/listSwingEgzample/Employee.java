package day_08.listSwingEgzample;

public class Employee {

	private String name;
	private String surname;
	private int salary;
	
	public Employee(String name, String surname, int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}
	
	public String toString(){
		return name + " " + surname + " " + salary + " DUPA";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
}
