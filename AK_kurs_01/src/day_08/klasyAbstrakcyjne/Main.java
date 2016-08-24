package day_08.klasyAbstrakcyjne;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Person p1 = new Employee("Adam", "Kowalski", 19);
		Person p2 = new Student("Michal", "mielczarek", 25);
		
		List<Person> people = new ArrayList<Person>();
		people.add(new Student("ania", "l", 18));
		people.add(new Employee("liska", "suka", 17));
		people.add(p2);
		people.add(p1);
		
		
		System.out.println(p1.getName());
		
		
		for(Person p : people) {
			p.live();
		}
		
		
	}

}
