package day_03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person michal = new Person();
		michal.firstName = "Micha³";
		michal.lastName = "Makaruk";
		michal.age = 12;
		
		Person ola = new Person();
		ola.firstName = "Ola";
		ola.lastName = "Nowak";
		ola.age = 18;
		
		System.out.println("Ola nazywa siê " + ola.lastName);
		System.out.println("michal ma " + michal.age + " lat");
		System.out.println("pelna ola " + ola.fullName());
		System.out.println(michal);

	}

}
