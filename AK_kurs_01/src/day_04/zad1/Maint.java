package day_04.zad1;

public class Maint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		
		p.setName("Adam");
		p.setSurname("Kowalski");
		p.setGender("male");
		p.setAge(21);
		
		Person secondPerson = new Person("Adam", "Kowalski", "male", 11);
		System.out.println(p.getName());
		System.out.println(secondPerson.getName());
		
		secondPerson.setName("wojciech");
		System.out.println(secondPerson.getName());

	}

}
