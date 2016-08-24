package day_02;

import java.util.Scanner;

public class Function4 {

	public static double divide(double a,double b){
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
	
		if ( a/b == Double.POSITIVE_INFINITY  ){
			System.out.println("Nie dziel przez 0");
		}
		else{
			System.out.println("Wynik to "+a/b);
		}
		
	}

}