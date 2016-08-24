package day_04.classes2.zad1;

public class MathOperations {
	static int nwd (int a, int b) {
		int tmp = a;
		
		while (b!=0) {
			tmp = a;
			a = b;
			b = tmp%b;
		}
		return a;
	}

}
