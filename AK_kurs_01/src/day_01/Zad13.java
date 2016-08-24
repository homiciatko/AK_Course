package day_01;

import java.util.Scanner;

public class Zad13 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("podaj ciag znakow");
	String testo = sc.nextLine();
	sc.close();
	
	System.out.println("String " + testo + " od tylu: ");
	for (int i = testo.length() -1; i>=0; i--) {
		System.out.print(testo.charAt(i));
	}
	
	}

}
