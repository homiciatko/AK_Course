package day_02;

import java.util.Scanner;

public class Function1 {
	
	int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Function1 f = new Function1();
		
		System.out.println("Suma to: " + f.add(a, b));
	}

}
