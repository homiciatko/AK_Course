package day_03;

import java.util.Scanner;

public class Zad10 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		int n = 37;
		int[] remainders = new int[n];
		// 0 , 1 , 2, 3, 4, 5
		// 5 % 35
		// 37 % 35 = 2
		// 2
		for (int i = 1; i <= 15; i++) {
			a = sc.nextInt();
			remainders[a % n]++;
			// ++ zwiêkszenia o 1
		}
		int different = 0;
		for (int i=0;i<n;i++){
			if (remainders[i]>0)
				different++;
		}
		
		System.out.println(different);
	}

}