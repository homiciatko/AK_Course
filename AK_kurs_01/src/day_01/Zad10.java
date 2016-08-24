package day_01;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj liczby");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		if ( a == b){
			System.out.println("Obie liczby s¹ równe");
		}
		else{
			System.out.println("Liczby nie s¹ równe");
		}
		String name = "Adam";
		String nextName = "Wojciech";
		if ( !name.equals(nextName)  ){
			System.out.println("Stringi nie s¹ równe");
		}
		
		
	}

}