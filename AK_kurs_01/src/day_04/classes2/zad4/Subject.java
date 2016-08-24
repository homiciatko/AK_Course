package day_04.classes2.zad4;

public class Subject {
	
	private String name;
	double tax;
	
	
	
	public Subject(String name, double tax) {
		super();
		this.name = name;
		this.tax = tax;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
