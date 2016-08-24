package day_04.classes2.zad2;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private String surname;
	private String specialization;
	
	private List<Grade> grades = new ArrayList<Grade>();
	
	public Student(String name, String surname, String specialization) {
		super();
		this.name = name;
		this.surname = surname;
		this.specialization = specialization;
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", specialization=" + specialization + ", grades="
				+ grades + "]";
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	
	
	public void addGrade(Grade grade) {
		grades.add(grade);
	}
	

}
