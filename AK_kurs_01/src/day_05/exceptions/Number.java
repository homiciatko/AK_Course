package day_05.exceptions;

public class Number {
	
	public static double divide(double a, double b) throws DivideZeroException{
		if ( b== 0) {
			throw new DivideZeroException("Nie mo¿na dzielic przez zero");
		}
		else 
			return a/b;
	}
}
