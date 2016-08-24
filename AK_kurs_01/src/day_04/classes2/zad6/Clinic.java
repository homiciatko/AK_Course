package day_04.classes2.zad6;


// TODO sprawdzanie poprawnosci danych przy dodawaniu wizyty: id doctora, pesel pacienta

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clinic {
	
	private String name;
	private Map<Integer, Patient> patients2 = new HashMap<Integer, Patient>();
	private List<Patient> patients = new ArrayList<Patient>();
	private Map<Integer, Doctor> doctors2 = new HashMap<Integer, Doctor>();
	private List<Doctor> doctors = new ArrayList<Doctor>();
//	private Map<Integer, Appointment> appointements2 = new HashMap<Integer, Appointment>();
	private List<Appointment> appointments = new ArrayList<Appointment>();
	
	public Clinic(String name) {
		super();
		this.name = name;
	}
	
	public Patient getPatientByPesel(int pesel) {
		return patients2.get(pesel);
	}
	
	public Doctor getDoctorById(int idDoctor) {
		return doctors2.get(idDoctor);
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
		patients2.put(patient.getPesel(), patient);
	}
	
	public void addDoctor(Doctor doctor){
		doctors.add(doctor);
		doctors2.put(doctor.getIdDoctor(), doctor);
	}
	
	public void addAppointment(Appointment appointment){
		appointments.add(appointment);
	}
	
	public void showPatients() {
		System.out.println(patients);
	}
	
	public void showDoctors() {
		System.out.println(doctors);
	}
	
	public void showAppointments() {
		System.out.println(appointments);
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
