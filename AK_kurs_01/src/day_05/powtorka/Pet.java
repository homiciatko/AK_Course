package day_05.powtorka;

public class Pet implements Printable {
	
	private String name;
	private String description;
	
	public Pet(String name, String description) {
		this.name = name;
		this.description = description;
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

	@Override
	public void print() {
		System.out.println("Moje zwierzatko to " + getName() + " " + getDescription());
		
	}
	
	
}
