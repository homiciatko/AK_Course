package pl.homik.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import pl.homik.domain.Book;

public class BookDaoSqLite implements BookDao {
	
	private Connection connection;
	
	public BookDaoSqLite() {
		try{
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:library.db");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void createTable() {
		String sql = "CREATE TABLE IF NOT EXISTS Books("
				+"id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+"title TEXT NOT NULL, "
				+"author TEXT NOT NULL, "
				+"pages INTEGER DEFAULT 0"
				+")";
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub

	}

	public void removeBook(Book book) {
		// TODO Auto-generated method stub

	}

	public void getAllBooks() {
		// TODO Auto-generated method stub

	}

}
