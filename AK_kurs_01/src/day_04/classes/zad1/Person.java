package day_04.classes.zad1;

public class Person {
	
	private String name;
	private String surname;
	private int age;
	private String gender;
	
	
	
	public Person(String name, String surname, int age, String gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() {
		return this.getName() + " " + this.getSurname() + " " + " " + this.getAge() + " " + this.getGender();
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



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}

}
