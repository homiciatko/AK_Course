package day_04.classes2.zad6;


public class Appointment {
	
	private static int idAppointmentCounter = 0;
	
	private int idAppointment;
	private Patient patient;
	private Doctor doctor;
	private String decription;

	public Appointment(Patient patient, Doctor doctor, String decription) {
		super();
		this.patient = patient;
		this.doctor = doctor;
		this.decription = decription;
		idAppointment = idAppointmentCounter;
		idAppointmentCounter++;
		
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	
	public int getIdAppointemnt() {
		return idAppointment;
	}
	
	public String toString(){
		return "Wizyta " + getDecription() + " pacient: " + patient.getSurname()+ " doktor: " + doctor.getName();
	}

}
