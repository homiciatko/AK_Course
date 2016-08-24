package day_04.classes2.zad4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subject firma = new Company("Tobi", 20.0, 866);
		
		Subject client = new Client("Pawel", "Rz", 10.0);
		Client c1 = new Client("JJ", "Jaro", 2.0);
		
		Company c2 = new Company("Luna", 1.0, 123);
		Invoice invoice1 = new Invoice(01, 222, client);
		Invoice invoice2 = new Invoice(02, 333, firma);
		Invoice invoice3 = new Invoice(03, 111, c1);
		Invoice invoice4 = new Invoice(04, 444, c2);
		Product p1 = new Product("karma", 2.0);
		Product p2 = new Product("chleb", 3.0);
		
		invoice1.addProduct(p1, 1);
		invoice1.addProduct(p2, 1);
		invoice2.addProduct(p1, 2);
		invoice3.addProduct(p1, 1 );
		invoice4.addProduct(p1, 1);
		
		System.out.println(invoice1);
		System.out.println(invoice2);
		System.out.println(invoice3);
		System.out.println(invoice4);

	}

}
