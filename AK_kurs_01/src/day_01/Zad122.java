package day_01;


 dupa
 
import java.util.Scanner;

public class Zad122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		StringBuilder nameBuilder = new StringBuilder(name);
		if ( nameBuilder.reverse().toString().equals(name) ){
			System.out.println("To jest palindrom");
		}
		else{
			System.out.println("To nie jest palindrom");
		}
	}

}