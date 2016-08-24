package pl.homik.dao;

import java.util.List;

import pl.homik.domain.Book;

public interface BookDao {
	
	public void addBook(Book book);
	public void removeBook(Book book);
	public List<Book> listBooks();

}
