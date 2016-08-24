package day_04.Interface;

import java.util.ArrayList;
import java.util.LinkedList;

public class Zad3 {
	
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setConnector(new DatabaseConnector());
		p.save();
		
		p.setConnector(new CashConnector());
		p.save();
		
		
		p.setList(new ArrayList<String>());
		p.setList(new LinkedList<String>());
		
		
		
	}

}
