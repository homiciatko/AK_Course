package day10_genericTypes.cw2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee("michal", 120));
		e.add(new Employee("maciek", 10));
		e.add(new Employee("Ola", 50));
		Collection.sort(e);
		
		for (Employee s:e){
			System.out.println(s);
		}
	}
}
