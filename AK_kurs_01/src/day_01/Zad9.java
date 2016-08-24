package day_01;

import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("podaj liczbe klockow");
		int numberOfBlocks = sc.nextInt();
		
		System.out.println("podaj pojemnoœæ pojemnika");
		int dimensionOfBlock = sc.nextInt();
		
		if (numberOfBlocks % dimensionOfBlock == 0) {
			System.out.println("potrzeba " + numberOfBlocks/dimensionOfBlock + " , aw ostatnim bedzie " + dimensionOfBlock + " klockow");
		}
		else 
			System.out.println("potrzeba " + (numberOfBlocks/dimensionOfBlock + 1) + " a w ostatnim bêdzie " + numberOfBlocks % dimensionOfBlock + " klockow");
			
		sc.close();

	}

}
