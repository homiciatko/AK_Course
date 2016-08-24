package day_03;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
	
	public static void main(String[] args) {
	List<Integer> elements = new ArrayList<Integer>();
	
	elements.add(5);
	elements.add(6);
	elements.add(1);
	elements.add(3);
	elements.remove(1);
	
	for (int i=0;i<elements.size(); i++)
		System.out.println(elements.get(i));
	
	System.out.println();
	
	for(Integer a : elements)
		System.out.println(a);
	
	}
}
