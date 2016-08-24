package pl.homik.library2;

import java.util.Scanner;

import pl.homik.dao.BookDao;
import pl.homik.dao.BookDaoSqlite;
import pl.homik.domain.Book;

public class Main {
	
	public static void main(String[] args) {
		
		BookDao bookDao;
		bookDao = new BookDaoSqlite();
		
		
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int pages;
		String author, title;
		
		do{
			
		System.out.println("1: dodaj ksiazkę.");
		System.out.println("2: usun książkę.");
		System.out.println("3: wyświetl wszystkie ksiązki.");
		System.out.println("4: koniec programu.");
		
		number = scanner.nextInt();
		switch (number) {
		case 1:
			System.out.println("Podaj autora");
			author = scanner.next();
			System.out.println("Podaj tytul");
			title = scanner.next();
			System.out.println("podaj liczbe stron");
			pages = scanner.nextInt();
			
			bookDao.addBook(new Book(title, author, pages));
			break;
			
		case 2:
//			TO DO
			System.out.println("trzeba napisac usuwanie książek");
			break;
			
		case 3:
			for (Book book : bookDao.listBooks())
				System.out.println(book);
			break;

		default:
			break;
		}

		} while(number!=4);
	}
}
