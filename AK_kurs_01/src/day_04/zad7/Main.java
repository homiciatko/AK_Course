package day_04.zad7;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Person p1 = new Person("Justyna", "Walicka");
		Person p2 = new Person("Ela", "Nowak");
		
		ArrayList<Person> people = (ArrayList<Person>) Person.getAllPeople();
		
		for (Person p : people) {
			System.out.println(p.fullName());
		}
		
		ArrayList<String> peopleString = (ArrayList<String>) Person.getAllFullNames();
		for (String s: peopleString) {
			System.out.println(s);
		}
		
		
	}

}
