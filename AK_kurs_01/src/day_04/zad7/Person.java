package day_04.zad7;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private static List<Person> people = new ArrayList<Person>();
	
	private String name;
	private String surname;
	
	
	
	public Person(String name, String surname) {
		this.setName(name); 
		this.setSurname(surname);
		Person.people.add(this);
		
	}

	public String fullName() {
		return name + " " + surname;
	}
	
	public static List<Person> getAllPeople() {
		return people;
	}
	
	public static List<String> getAllFullNames() {
		List<String> elements = new ArrayList<String>();
		for (Person e : Person.people)
			elements.add(e.fullName());
		return elements;
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
	
	
	
	

}
