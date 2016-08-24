package day_02;

import java.util.Scanner;

public class Function14 {
	
	static int nwd (int a, int b) {
		int tmp = a;
		
		while (b!=0) {
			tmp = a;
			a = b;
			b = tmp%b;
		}
		return a;
	}
	
	static int NWD (int a, int b, int c) {
		return nwd(nwd(a, b), c);
	}

	
	
	public static void main(String[] args) {
		System.out.println("podaj dwie liczby");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		System.out.println("najwiekszy wspony dzielnik: " + NWD(a, b, c));
		
	}

}
