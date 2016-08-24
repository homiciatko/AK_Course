package day_04.Interface;

import java.util.ArrayList;

public class Zad1 {
	
	public static void main(String[] args) {
	
	Dog dog = new Dog();
	Cat cat = new Cat();
	
	ArrayList<Speakable> animals = new ArrayList<Speakable>();
	animals.add(dog);
	animals.add(cat);
	

	
	for(Speakable s:animals) {
		if (s instanceof Cat ) {
			s.giveVoice(Speakable.QUIET);
			((Cat) s).sleep();
		}
			
		if (s instanceof Dog) {
			s.giveVoice(Speakable.LOUD);
			((Dog) s).eat();
		}
	}
	
	}
}
