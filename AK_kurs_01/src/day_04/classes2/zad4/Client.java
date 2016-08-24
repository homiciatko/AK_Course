package day_04.classes2.zad4;

public class Client extends Subject{
	private String surname;

	public Client(String name, String surname, double tax) {
		super(name, tax);
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + surname;
	}
}
