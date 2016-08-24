package day10_Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		HashMap<String, String> classNames = new HashMap<String, String>();
		classNames.put("kot", "Cat");
		classNames.put("Kot", "Cat");
		classNames.put("pies", "Dog");
		classNames.put("Pies", "Dog");
		
		System.out.println("Podaj nazwê zwierzatka: ");
		Scanner sc = new Scanner(System.in);
		String className = classNames.get(sc.next());
		System.out.println("podaj nazwê odg³osu");
		String methodName = sc.next();
		System.out.println("podaj nazwê imienia");
		String parametrName = sc.next();
		
		Class<?> c;
		try {
			c = Class.forName("day10_Reflections." + className);
			Object object = c.newInstance();
			Method setNameMethod = object.getClass().getMethod(methodName, String.class);
			setNameMethod.invoke(object, parametrName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
