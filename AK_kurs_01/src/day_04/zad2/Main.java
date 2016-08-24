package day_04.zad2;

public class Main {
	
	public static void main(String[] args) {
		
		Car myCar = new Car("A6", 20.0, "Audi");
		Car seat = new Car("ibiza", 10.0, "Seat");
		
		seat.showOnScreen();
		myCar.showOnScreen();
	}

}
