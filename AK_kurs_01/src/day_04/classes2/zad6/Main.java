package day_04.classes2.zad6;

import day_04.classes2.zad6.exceptions.PeselException;

public class Main {

	public static void main(String[] args) throws PeselException {
		Clinic klinika = new Clinic("Zoo");
		
		klinika.addPatient(Patient.createPatient("Pawe³", "nowak", 851234));
		klinika.addPatient(Patient.createPatient("jan", "kowalski", 32451));
		klinika.addDoctor(Doctor.createDoctor("Gregory", "house", 98, "kidneys", 100));
		klinika.addDoctor(Doctor.createDoctor("Jim", "Wilson", 78, "Cancer", 99));
		
		
		
		TUI.showMainMenu(klinika);

	}

}
