package day_03;

public class Product {
	
	private String name;
	private String description;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			System.out.println("cena ma byc wiêksza od 0!");
	}

}
