package day_01;



import java.util.Scanner;

public class Zad8 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj liczbe");
		int a = sc.nextInt();
		sc.close();
		int factorial = 1;
		
		
		for (int i=1; i <=a; i++) {
			factorial = factorial *i;
		}
		
		System.out.println("silnia z " + a + " to: " + factorial);
	}

}
