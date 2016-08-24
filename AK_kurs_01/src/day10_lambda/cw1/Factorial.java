package day10_lambda.cw1;

interface Score {
	int value(int a);
}

public class Factorial {
	
	public static int factorial(int n) {
		int score = 1;
		for(int i = 1; i <=n; i++)
			score *= i;
		return score;
	}

	public static void main(String[] args) {
		Score silnia = (a) -> {
			int score = 1;
			for(int i = 1; i <=a; i++)
				score *= i;
			return score;
		};
		System.out.println(silnia.value(5));
	}
}
