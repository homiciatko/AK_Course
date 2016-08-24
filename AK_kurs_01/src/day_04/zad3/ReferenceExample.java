package day_04.zad3;

public class ReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 10;
		
		a = b;
		b = 25;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
				
		Player ania = new Player("ania", "kowal", 15);
		Player piotr = new Player("Piotr", "Kondej", 124);
		
		ania = piotr;
		piotr.setName("Jozef");
		piotr.setUserName("jozefos");
		piotr.setNumberOfPoints(18);
		
		System.out.println("ania to: " + ania + "\npiotr to: " + piotr);

	}

}
