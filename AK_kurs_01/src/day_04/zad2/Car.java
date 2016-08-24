package day_04.zad2;

public class Car {
	
	private String model;
	private double price;
	private String brand;
	
	
	public Car(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public void showOnScreen() {
		System.out.println(this.brand + " " + this.model);
	}


}
