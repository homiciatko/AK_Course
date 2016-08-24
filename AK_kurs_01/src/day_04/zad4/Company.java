package day_04.zad4;

import java.util.ArrayList;
import java.util.List;

import day_04.zad1.Person;

public class Company {
	public static void main(String[] args) {
		
		Employee polak = new Employee("pawel", "rzyha", 120);
//		System.out.println(polak);
		
		Person ania = new Person("ania", "Konstantynowicz");
		
//		Polimorfizm
		
		List<Person> people = new ArrayList<>();
		people.add(polak);
		people.add(ania);
		
		for (Person p : people)
			System.out.println(p);
		
		Person zdzislaw = new Employee("zdzislaw", "maly", 12.2);
		System.out.println( ((Employee)zdzislaw).getSalary() );
	}

}
