package pl.homik.library2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import pl.homik.dao.BookDao;
import pl.homik.dao.BookDaoSqlite;
import pl.homik.domain.Book;
import pl.homik.utilities.ListUtilities;

public class Main {
	
	public static void main(String[] args) {
		
		BookDao bookDao;
		bookDao = new BookDaoSqlite();
		
		
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int pages, id = 0;
		String author, title, titleOrAuthor;
		int counter;
		Map<Integer, Book> booksMap = new HashMap<Integer, Book>();
		List<Book> books;
		
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
			System.out.println("dodano ksiazke");
			break;
			
		case 2:
//			TO DO
			System.out.println("Podaj tytuł ksiązki lub autora ksiazki");
			titleOrAuthor = scanner.next();
			books = bookDao.findBook(titleOrAuthor);
			ListUtilities.displayListByNumbers(books);
		
			if (books.size() > 1) {
				System.out.println("podaj numer ksiązki, który chcesz usunąć");
				id = scanner.nextInt();
			}
			else if (books.size() ==1) {
				id = books.get(0).getId();
				System.out.println("wybrales id: " + id);
			}
			else {
				System.out.println("Nie znalazlem takiej ksiązki\n");
				break;
			}
			System.out.println("usuwam wybraną ksiązkę:"
					+ "");
			bookDao.removeBook(id);
			id = -1;
			break;
			
		case 3:
			ListUtilities.displayListByNumbers(bookDao.allBooks());
			System.out.println();
			break;

		default:
			break;
		}

		} while(number!=4);
	}
}
