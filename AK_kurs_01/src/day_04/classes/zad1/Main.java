package day_04.classes.zad1;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person("pawel", "p", 21, "male");
		Person p2 = new Person("Ola", "u", 21, "female");
		
		System.out.println(p2.getName() + " " + p2.getSurname() + " " + p2.getAge() + " " + p2.getGender());
		System.out.println(p1);
	}

}
