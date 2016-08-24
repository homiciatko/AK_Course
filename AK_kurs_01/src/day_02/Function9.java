package day_02;

import java.util.Scanner;

public class Function9 {
	
	static boolean isCube(int number) {
		
		double cube = Math.pow(number, (double)(1.0/3.0));
		
		
		if (Math.pow(cube, 3) == number)
			return true;
		
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe");
		int number = sc.nextInt();
		sc.close();
		
		if (isCube(number))
			System.out.println("liczba: " + number + " jest szescianem liczby naturalnej");
		else
			System.out.println("zonk");
		
		
	}

}
