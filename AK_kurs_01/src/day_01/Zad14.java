package day_01;

import java.util.Scanner;

public interface Zad14 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("podaj ciag znakow");
			String testo = sc.nextLine();
			sc.close();
			
			for (int i =0; i<testo.length(); i+=2) {
				System.out.print(testo.charAt(i));
			}
	}
}
