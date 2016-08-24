package day10_lambda.cw2;

public class Calculator {
	
	public int operateBinary(int a, int b, IntegerMath integerMath) {
		return integerMath.operation(a, b);
	}
	
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		IntegerMath addition = (a,b) -> a+b;
		IntegerMath substraction = (a,b) -> a-b;
		
		System.out.println("dodawanie " + calculator.operateBinary(5, 3, addition));
		System.out.println("odejmowanie " + calculator.operateBinary(5, 3, substraction));
		System.out.println("mnozenie " + calculator.operateBinary(2, 9, (a,b) -> a*b));
	}
}
