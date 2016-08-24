package day_02;

public class FunctionExample2 {

	static int factorial(int n){
		int score = 1;
		for (int i=1;i<=n;i++){
			score *=i;
		}
		return score;
	}
	
	public static void main(String[] args) {
		int n =5;
		System.out.println("Wynik to "+factorial(n+3)+factorial(n+5));
			
	}

}