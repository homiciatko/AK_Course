package day_04.classes2.zad6;

import day_04.classes2.zad6.exceptions.PeselException;
import day_04.classes2.zad6.exceptions.PeselExistInDataBaseException;

public class Doctor extends Person {
	
	private static int idDoctorCounter = 0;
	public static Doctor createDoctor(String name, String surname, int pesel, String specialization, int charge) throws PeselException {
		if (PeselMethods.isUsed(pesel))
			throw new PeselExistInDataBaseException("pesel ju¿ istnieje");
		
		return new Doctor(name, surname, pesel, specialization, charge);
	}
	
	private int idDoctor;
	private String specialization;
	private int charge;
	
	private Doctor(String name, String surname, int pesel, String specialization, int charge) {
		super(name, surname, pesel);
		this.specialization = specialization;
		idDoctor = idDoctorCounter;
		idDoctorCounter++;
		this.charge = charge;
	}
	
	public int getIdDoctor() {
		return idDoctor;
	}

	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	

}
