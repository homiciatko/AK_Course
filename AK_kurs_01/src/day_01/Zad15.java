package day_01;

import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		
		
		String testo;
		String userPassword = "Akademia";
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("podaj ciag znakow");
		testo = sc.nextLine();
		if (testo.equals(userPassword)) {
			System.out.println("haslo poprawne");
			break;
		}
			
		}
		
		sc.close();
		
	}
}
