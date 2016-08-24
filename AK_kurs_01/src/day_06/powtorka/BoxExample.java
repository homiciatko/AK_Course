package day_06.powtorka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Box> boxes = new ArrayList<Box>();
		
		boxes.add(new Box(2, 5, 4));
		boxes.add(new Box(4, 3, 2));
		
		Collections.sort(boxes);
		
		for (Box box: boxes)
			System.out.println(box.getDepth());
		
	}

}
