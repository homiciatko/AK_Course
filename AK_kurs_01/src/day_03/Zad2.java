package day_03;

import java.util.Scanner;

public class Zad2 {
	
	static int min(int[] table) {
		int min = table[0];
		
		for (int i=1; i<table.length; i++) {
			if(min > table[i])
				min = table[i];
		}
		
		return min;
	}
	

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] elements = new int[n];
	
	for(int i=0; i<elements.length; i++) {
		elements[i] = sc.nextInt();
	}
		sc.close();
		
	System.out.println(min(elements));
	for(int i=0; i<elements.length; i++) {
		System.out.println(elements[i]);
	}
	
	}

}
