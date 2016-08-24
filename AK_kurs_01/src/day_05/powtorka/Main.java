package day_05.powtorka;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Person p = new Person("adam", "Kowalsky");
		Employee e = new Employee("aneta", "Nowak", 9000);
		Employee e2 = new Employee("Piotr", "kondej", 10);
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(e2);
		people.add(p);
		people.add(e);
		
		
		for (Person person : people){
			System.out.println(person instanceof Person);
			System.out.println(person instanceof Employee);
		}
		
		Pet pet = new Pet("Luna", "luna jest gruba i spi");
		Pet pet2 = new Pet("azor", "Azor szczeka");
		
		List<Printable> prints = new ArrayList<Printable>();
		prints.add(pet2);
		prints.add(pet);
		prints.add(e2);
		prints.add(e);
		
		for(Printable print : prints) {
			print.print();
		}
	}
}
