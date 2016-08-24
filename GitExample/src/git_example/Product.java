package git_example;

public class Product {
	
	String name, description;

	public Product(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + " " + description;
	}


	public Product(String name, String description) {
		this.name = name;
		this.description = description;
	}	
}
