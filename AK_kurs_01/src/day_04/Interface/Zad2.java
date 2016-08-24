package day_04.Interface;

import java.util.ArrayList;
import java.util.Collections;

public class Zad2 {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Jan","Kowal",2121.44));
		employees.add(new Employee("Justyna","Mydlak",1500.32));
		employees.add(new Employee("Piotr","Nowakowski",4000));
		employees.add(new Employee("Grzegorz","Python",3590.2));
		
		Collections.sort(employees);
		
		for (Employee e: employees)
			System.out.println(e);
		
	}

}
