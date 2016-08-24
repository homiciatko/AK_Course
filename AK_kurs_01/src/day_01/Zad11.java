package day_01;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new Scanner(System.in).next();
		int length = name.length();
		// Kotek  5
		// 01234
		System.out.println("ostatnia litera to: " + name.charAt(length-1));
	}

}