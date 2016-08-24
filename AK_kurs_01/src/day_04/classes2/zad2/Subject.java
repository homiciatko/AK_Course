package day_04.classes2.zad2;

public class Subject {
	
	private String name;
	
	public Subject(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + "]";
	}

	
	
	

}
