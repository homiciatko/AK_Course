package day_02;

import java.util.Scanner;

public class Function7 {
	public static boolean isSquare(int a) {
		int sqrRoot = (int) Math.sqrt(Math.abs(a));
		System.out.println(sqrRoot);
		if (sqrRoot * sqrRoot == Math.abs(a))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		System.out.println("liczba: " + a + " ma pierwiastek ca³kowity: " + isSquare(a) );
		
	}

}
