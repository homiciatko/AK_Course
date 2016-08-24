package day_04.classes2.zad6;

import day_04.classes2.zad6.exceptions.PeselException;
import day_04.classes2.zad6.exceptions.PeselExistInDataBaseException;

public class Patient extends Person{
	
	private static int idPatientCounter = 0;
	
	public static Patient createPatient(String name, String surname, int pesel) throws PeselException {
		if (PeselMethods.isUsed(pesel))
			throw new PeselExistInDataBaseException("pesel ju¿ istnieje");
		return new Patient(name, surname, pesel);
	}
	
	private int idPatient;
	

	private Patient(String name, String surname, int pesel) {
		super(name, surname, pesel);
		idPatient = idPatientCounter;
		idPatientCounter++;
	}

	public int getIdPatient() {
		return idPatient;
	}
}
