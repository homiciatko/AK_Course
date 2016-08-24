package day10_Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		HashMap<String,String> classNames = new HashMap<String,String>();
		classNames.put("kot","Cat");
		classNames.put("Kot","Cat");
		classNames.put("pies", "Dog");
		classNames.put("Pies", "Dog");
		System.out.println("Podaj nazwê zwierz¹tka:)");
		Scanner sc = new Scanner(System.in);
		String className = classNames.get(sc.next());
		System.out.println("Podaj nazwê odg³osu");
		String methodName = sc.next();
		System.out.println("Podaj nazwê imienia");
		String parameterName = sc.next();
		
		Class<?> c;
		try {
			c = Class.forName("reflexction."+className);
			Object object = c.newInstance();
			Method setNameMethod = object.getClass().getMethod(methodName, String.class);
			setNameMethod.invoke(object, parameterName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}