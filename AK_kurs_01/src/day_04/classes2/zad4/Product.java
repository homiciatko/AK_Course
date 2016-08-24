package day_04.classes2.zad4;

public class Product {
	
	private String name;
	private double netPrice;
	
	public Product(String name, double netPrice) {
		super();
		this.name = name;
		this.netPrice = netPrice;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	
	

}
