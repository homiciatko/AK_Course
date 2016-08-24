package day_05.exceptions;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws DivideZeroException {
//		Scanner sc = new Scanner(System.in);
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		sc.close();
		
//		try {
//			System.out.println(Number.divide(a, b));
//		} catch (DivideZeroException e) {
//			System.out.println(e.getMessage());
//		}
		
//		System.out.println(Number.divide(a, b));
		
		Person p1 = new Person("Pawe", "rz");
		BankAccount b1 = new BankAccount(p1, "10");
		
		b1.deposit(10);
		
		try {
			b1.withdraw(8);
			b1.withdraw(8);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
