package day_05.powtorka;

public class Employee extends Person implements Printable{
	
	private double salary;

	public Employee(String name, String surname, double salary) {
		super(name, surname);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString(){
		return getName() + " " + getAge() + " " + salary;
	}

	@Override
	public void print() {
		System.out.println(this);
		
	}

}
