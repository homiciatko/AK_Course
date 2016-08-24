package day_08.klasyAbstrakcyjne;

public class Employee extends Person{

	public Employee(String name, String surname, int age) {
		super(name, surname, age);
	}

	@Override
	public void live() {
		System.out.println("Chodze do pracy");
		
	}

}
