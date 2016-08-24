package day_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Hello", "Witam");
		dictionary.put("Bye", "Spadaj");
		dictionary.put("cat", "kot");
		dictionary.put("ug", "kot");
		
		System.out.println(dictionary);
		
		System.out.println("podaj wyraz po angielsku");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		System.out.println(dictionary.get(word));
		
		// TODO Auto-generated method stub

	}

}
