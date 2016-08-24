package day_04.classes2.zad1;

public class Main {

	public static void main(String[] args) {

		Fraction u1 = new Fraction(1, 2);
		Fraction u2 = new Fraction(1, 3);
		Fraction u3 = new Fraction(4, 6);
		
//		System.out.println(u1);
		
		System.out.println(u1.add(u2));
		System.out.println(u1.subtract(u2));
		System.out.println(Fraction.shortForm(u3));
		System.out.println(Fraction.shortForm(u1));
		System.out.println(MathOperations.nwd(5, 5));

	}

}
