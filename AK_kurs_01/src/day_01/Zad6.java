package day_01;

import java.util.Scanner;

public class Zad6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if (number %4 == 0){
			System.out.println("liczba podzielna prze 4");
		}
		else
			System.out.println("liczba nie jest podzielna przez 4");
		sc.close();
	}

}
