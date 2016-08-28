package pl.homik.domain;

public class Book implements Comparable<Book>{
	
	private int id;
	private String title;
	private String author;
	private int pages;

	public Book(String title, String author, int pages) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	public Book(int id, String title, String author, int pages) {
		this(title, author, pages);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}

	
	@Override
	public String toString() {
		return "title=" + title + " author=" + author + " pages=" + pages + "]";
	}

	public int compareTo(Book book) {
		return 0;
	}
	
	
	

}
