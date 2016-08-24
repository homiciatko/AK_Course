package day_03;

public class ProductExample {
	
	public static void main(String[] args) {
		
		Product laptop = new Product();
		
		laptop.setName("Lenovo");
		System.out.println("Produkt to " + laptop.getName());
		laptop.setPrice(-2.0);
	}

}
