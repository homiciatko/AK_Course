package day_08.klasyAbstrakcyjne;

public class Student extends Person{

	public Student(String name, String surname, int age) {
		super(name, surname, age);
	}

	@Override
	public void live() {
		System.out.println("ide na uczelnie");
	}
}
