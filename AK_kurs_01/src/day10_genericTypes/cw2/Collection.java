package day10_genericTypes.cw2;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {
	
	public static <T extends Comparable<T>> void sort(ArrayList<T> elements) {
		for(int j = 0; j < elements.size(); j++) 
			for(int i =0; i < elements.size(); i++)
				if(elements.get(i).compareTo(elements.get(j)) > 0) 
						Collections.swap(elements, i, j);
	}
}
