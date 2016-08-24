package day_02;

import java.util.Scanner;

public class Function10 {
	
	static int max(int int1, int int2) { 
		return (int1 > int2) ? int1 : int2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("podaj 2 liczby");
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		System.out.println("maximum to " + max(firstNumber, secondNumber));
		
		
		
	}
	
}
