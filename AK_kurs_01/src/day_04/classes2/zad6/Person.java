package day_04.classes2.zad6;

import java.util.HashMap;
import java.util.Map;
import day_04.classes2.zad6.exceptions.PeselException;

import day_04.classes2.zad6.exceptions.PeselExistInDataBaseException;

// TODO:
// getAge - poprawne wyliczanie wieku i zamienic na stringa
// showAge - pokazywanie wieku w postaci stringa: 18.02.2012
// sprawdzanie poprawnosci nr pesel
// sprawdzanie jednoznacznosci peselu

public class Person {
	
	public static Map<Integer,Person> usedPesels = new HashMap<Integer, Person>();
	public static Person createPerson(String name, String surname, int pesel) throws PeselException {
		if (PeselMethods.isUsed(pesel))
			throw new PeselExistInDataBaseException("pesel ju¿ istnieje");
		
		return new Person(name, surname, pesel);
	}

	private String name;
	private String surname;
	private int pesel;
	private String adress;
	private int phoneNumber;
	
	protected Person(String name, String surname, int pesel) {
		super();
		this.name = name;
		this.surname = surname;
		this.pesel = pesel;
		usedPesels.put(pesel, this);
	}

	public String toString() {
		return name + " " + surname + " lat " + getAge();
	}
	
	private int getAge() {
		return PeselMethods.getAge(pesel);
	}

	public String getName() {
		return name;
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
	public int getPesel() {
		return pesel;
	}
	public void setPesel(int pesel) {
		this.pesel = pesel;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
