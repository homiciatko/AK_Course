package day_02;

import java.util.Scanner;

public class Function8 {
	
	static boolean isFirstNumber(int number) {
		if (number < 2)
			return false;
		
		for (int i=2;i*i <= number;i++)
			if (number%i==0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe");
		int number = sc.nextInt();
		sc.close();
		
		if(isFirstNumber(number))
			System.out.println("Liczba: " +number+ " jest pierwsza");
		else
			System.out.println("Liczba: " +number+ " nie jest pierwsza");
		
	}

}
