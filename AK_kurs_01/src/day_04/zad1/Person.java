package day_04.zad1;

//Lombok

public class Person extends Object{
	private String name;
	private String surname;
	private int age;
	private String gender = "nieustawiono";

	public Person(String name, String surname, String gender, int age) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.age = age;
		
	}
	
	public Person() {
	}
	
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return name + " " + surname ;
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
		if (age > 0)
			this.age = age;
		else
			System.out.println("wiek musi byæ wiêkszy od zera");
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
