package day_04.classes;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("Józef", "M³ynarczyk");
		Subject matematyka = new Subject("Matematyka");
		Subject polski = new Subject("Polski");
		
		student.addGrade(new Grade(3.5, student, matematyka));
		student.addGrade(new Grade(4.0, student, polski));
		student.addGrade(new Grade(5.5, student, polski));
		
		for (Grade g: student.getGrades()) {
			System.out.println(g.getValue() + " " + g.getSubject().getName());
		}
	}

}
