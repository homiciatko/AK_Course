package day_02;

import java.util.Scanner;

public class Function6 {
	
	public static int digitSum(int number) {
		int sum = 0;
		int last = number;
		do {
			sum += last%10;
			last /= 10;
			
		} while (last >0);
		
		
		return sum;
	}
	
	public static int sumOfDigits(int n){
		int sum = 0;
		int last;
		while ( n!=0){
			last = n% 10;
			sum += last; // sum = sum +last
			n = n/10; // n/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(sumOfDigits(a));
		System.out.println(digitSum(a));
		
	}

}
