package day_01;




import java.util.Scanner;

public class Zad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		
		if (age >= 18) {
			System.out.println("jestes dorosly");
		}
		else if ((0 < age) && (age < 18))
			System.out.println("jestes dzieckiem");
		else 
			System.out.println("cos poszlo nie tak");
		
	}

}
