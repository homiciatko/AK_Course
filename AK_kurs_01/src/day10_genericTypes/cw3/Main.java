package day10_genericTypes.cw3;

public class Main {

	public static void main(String[] args) {
		Integer[] integerArray = { 1, 2 , 7, -3 };
		String[] stringArray = { "A", "Z", "C" };
		GenericArray<Integer> genericArray = new GenericArray<Integer>(integerArray);
		MinMax<Integer> minMax = genericArray.getMinMax();
		System.out.println(minMax.getMax());
		System.out.println(minMax.getMin());
	}

}
