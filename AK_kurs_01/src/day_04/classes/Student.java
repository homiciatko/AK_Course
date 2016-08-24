package day_04.classes;

import java.util.ArrayList;

public class Student {
	private String name;
	private String surName;
	private ArrayList<Grade> grades = new ArrayList<Grade>();
	
	
	public void addGrade(Grade grade) {
		grades.add(grade);
	}

	
	

	public void setGrades(ArrayList<Grade> grades) {
		this.grades = grades;
	}


	public Student(String name, String surname) {
		this.name = name;
		this.surName = surname;
	}
	
	public ArrayList<Grade> getGrades() {
		return grades;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}

}
