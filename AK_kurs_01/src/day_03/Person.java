package day_03;

public class Person {
	String firstName;
	String lastName;
	int age;
	
	String fullName() {
		return firstName + " " + lastName;
	}
	
	@Override
	public String toString() {
		return fullName();
	}
	

}
