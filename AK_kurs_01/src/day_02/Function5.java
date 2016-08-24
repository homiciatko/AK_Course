package day_02;
import java.util.Scanner;

public class Function5 {
	public static boolean isPythagorean(int a, int b, int c) {
		if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (isPythagorean(a, b, c))
			System.out.println("to s¹ liczby pitagorejskie");
		else
			System.out.println("nie sa :(");
	}

}
