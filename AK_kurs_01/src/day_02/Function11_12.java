package day_02;

import java.util.Scanner;

public class Function11_12 {
	
	static int dividersCounter(int number) {
		int counter = 0;
		
//		System.out.println("przed for");
		
		for(int i=2; i<=number/2;i++) {
//			System.out.println("przed if");
			if (number % i == 0) {
				counter++;
//				System.out.println("po if");
			}
		}	
//		System.out.println("przed return");
		return counter;
	}
	
	static int maxDividers() {
		int max = 2;
		
		for (int i=3; i<=10000; i++) {
			if (dividersCounter(max) < dividersCounter(i))
				max = i;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj liczbe");
		int number = sc.nextInt();
		sc.close();
//		System.out.println(number);
		
		System.out.println("liczba dzielników (bez 1 i siebie samej) to: " + dividersCounter(number));
		
		System.out.println("liczba z najwieksza liczba dzielników z przedzialu 2-10000 to: " + maxDividers()); 
		
		
	}

}
