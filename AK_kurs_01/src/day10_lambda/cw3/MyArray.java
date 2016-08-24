package day10_lambda.cw3;

import java.util.ArrayList;
import java.util.List;

interface MyValue {
	Integer value(Integer a);
}

public class MyArray {
	
	public static List<Integer> map(List<Integer> elements, MyValue value) {
		List<Integer> newList = new ArrayList<>();
		for (Integer a : elements)
			newList.add(value.value(a));
		return newList;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> elements = new ArrayList<Integer>();
		elements.add(5);
		elements.add(8);
		elements.add(12);
		System.out.println(MyArray.map(elements, (a)-> a+5));
		System.out.println(MyArray.map(MyArray.map(elements,(a)->a+5),(a)->5*a));
	}

}
