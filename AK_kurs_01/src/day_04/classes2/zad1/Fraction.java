package day_04.classes2.zad1;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	
	public Fraction() {
		System.out.println("stworzony domyœlny u³amek, licznik = 1, mianownik = 1");
		this.numerator = this.denominator = 1;
	}
	
	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		
		if(denominator != 0)
			this.denominator = denominator;
		else {
			this.denominator = 1;
			System.out.println("Konstruktor: mianownik nie mo¿e byæ zerem, ustawiono domyœlny mianownik = 1");
		}
	}
	
	public Fraction add (Fraction fraction) {
		return  new Fraction((this.numerator * fraction.denominator + this.denominator * fraction.numerator), this.denominator * fraction.denominator);
	}
	
	public Fraction subtract (Fraction fraction) {
		return  new Fraction((this.numerator * fraction.denominator - this.denominator * fraction.numerator), this.denominator * fraction.denominator);
	}
	
	
	@Override
	public String toString() {
		return "Fraction: " + numerator + "/" + denominator;
	}
	
	public static Fraction shortForm (Fraction fraction) {
		int nwd = MathOperations.nwd(fraction.numerator, fraction.denominator);
		return new Fraction(fraction.numerator / nwd, fraction.denominator / nwd);
	}

	public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		if(denominator != 0)
			this.denominator = denominator;
		else {
			this.denominator = 1;
			System.out.println("mianownik nie mo¿e byæ zerem, ustawiono domyœlny mianownik = 1");
		}
	} 
	
	

}
