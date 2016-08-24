package day_04.classes2.zad2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("pawel", "h", "polsk");
		Student student2 = new Student("Luna", "kot", "dietetyk");
		Subject math = new Subject("Matematyka");
		Subject inf = new Subject("Informatyka");
		Subject diet = new Subject("Dietetyka");
		
		student1.addGrade(new Grade(5, math));
		student2.addGrade(new Grade(2, diet));
		student1.addGrade(new Grade(2, math));
		student1.addGrade(new Grade(3, inf));
		
		System.out.println(student1);
		
	}

}
