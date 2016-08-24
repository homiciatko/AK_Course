package day_02;

import java.util.Scanner;

public class Function13 {
	
	static int myPow(int number, int power) {
		int myPow = number;
		
		for (int i=1; i<power; i++)
			myPow *= number;
		
		return myPow;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj dwie liczby");
		int number = sc.nextInt();
		int power = sc.nextInt();
		sc.close();
		
		System.out.println(number + " do potegi " + power + " to: " + myPow(number, power));
		
	}

}
