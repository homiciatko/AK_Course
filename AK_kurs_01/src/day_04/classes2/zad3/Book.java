package day_04.classes2.zad3;

import java.util.HashSet;
import java.util.Set;

public class Book {
	static private int isbnCounter = 0;
	
	private String name;
	private String description;
	private Author author;
	private int isbn;
	
	private Set<Author> subAuthors = new HashSet<Author>();
			
	
	private Book(){
		isbnCounter++;
		isbn = isbnCounter;
	}
	public Book(String name, String description, Author author) {
		this();
		this.name = name;
		this.description = description;
		this.author = author;
	}
	
	public void addSubAuthor(Author subAuthor) {
		if (!this.author.equals(subAuthor))
			subAuthors.add(subAuthor);
		else
			System.out.println("glowny autor nie moze byc pomocnikiem");
		
	}

	
	public int getIsbn() {
		return isbn;
	}

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

	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		
		String tmp = "Ksia¿ka o isbn: " + isbn + "\n"
				+ "name= " + name + ",\n"
				+ "description= " + description	+ ",\n"
				+ "author= " + author + ",\n";
				
		
		if (subAuthors.isEmpty())
			return tmp + "subAuthors= BRAK";
		
		return tmp + "subAuthors= "	+ subAuthors;
	}
	
	
}
