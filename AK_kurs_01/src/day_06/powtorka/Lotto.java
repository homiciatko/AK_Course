package day_06.powtorka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfdraws = sc.nextInt() ;
		int range = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i =0; i < numberOfdraws; i++) {
			list.add(new Random().nextInt(range)+1);
		}
		
		Collections.sort(list);
		System.out.println(list);


	}

}
