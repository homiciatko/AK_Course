package git_example;

public class Paerson {
	
	private String name, surname;
	private int age;
	
	public Paerson(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public Paerson(String name, String surname, int age) {
		this(name, surname);
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		//komentarz
		return age;
	}
	public void setAge(int age) {
		if (age>0)
			this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Paerson [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
	
}
