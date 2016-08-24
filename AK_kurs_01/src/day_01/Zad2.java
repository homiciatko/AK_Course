package day_01;

import java.util.Scanner;

public class Zad2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		a += b;
		b = a - b;
		a = a - b;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
		sc.close();
	}

}
