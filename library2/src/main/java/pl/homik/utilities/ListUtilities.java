package pl.homik.utilities;

import java.util.List;

public class ListUtilities {

	public static <T extends Comparable<T>> void displayListByNumbers(List<T> list) {
		for(int i=0; i<list.size(); i++)	
			System.out.println((i+1)+ ") " + list.get(i));
	}

}
