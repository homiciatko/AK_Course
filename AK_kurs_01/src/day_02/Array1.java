package day_02;

import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj ile liczb chcesz wprowadziæ do tablicy");
		int n = sc.nextInt();
//		sc.close();
		
		int[] array = new int[n];
		
		for (int i=0; i<array.length; i++) 
			array[i] = sc.nextInt();

		for (int i = array.length-1; i>=0; i--)
			System.out.println(array[i]);
		
		
	}
	

}
