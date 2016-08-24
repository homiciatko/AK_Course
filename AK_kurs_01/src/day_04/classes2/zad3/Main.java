package day_04.classes2.zad3;

public class Main {
	
	public static void main(String[] args) {
		
		Author a1 = new Author("Andrzej", "sapkowski");
		Author a2 = new Author("Jan", "Kowalsky");
		Author a3 = new Author("Michal", "Nowak");
		Author a4 = new Author("JRR", "Martin");
		
		
		Book k1 = new Book("wiedzmak", "opis wiedzmaka", a1);
		k1.addSubAuthor(a1);
		k1.addSubAuthor(a2);
		k1.addSubAuthor(a3);
		
		Book k2 = new Book("got", "every body dies", a4);
		
		System.out.println(k1);
		System.out.println(k2);
	}

}
