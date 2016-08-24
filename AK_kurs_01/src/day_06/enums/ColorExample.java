package day_06.enums;

public class ColorExample {
	
	public static void main(String[] args) {
		Color myColor = Color.RED;
		Color yourColor = Color.BLUE;
		
		if (myColor == yourColor)
			System.out.println("kolory sa takie same");
		else
			System.out.println("kolory sie roznia");
		
		for (Color color : Color.values())
			System.out.println(color);
		
//		System.out.println(Color.valueOf("WHITE").ordinal());
		System.out.println(myColor);
	}

}
