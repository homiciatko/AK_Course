package day_04.classes2.zad6;

import java.time.Year;

import day_04.classes2.zad6.exceptions.PeselExistInDataBaseException;

public class PeselMethods {

	
	static int getYearOfBirht(Integer pesel){
		String tmp = pesel.toString();
		int a = Integer.parseInt(tmp.substring(0, 1));
		int b = Integer.parseInt(tmp.substring(1, 2));
		int yearOfBirth = 10 * a + b;
		
		return yearOfBirth;	
	}
	
	//TODO
	static int getAge(Integer pesel) {
		return (Year.now().getValue() - 1900 )- getYearOfBirht(pesel);
	}

	//TODO
	static boolean checkPesel(Integer pesel) {
		return false;
	}
	
	static boolean isUsed(Integer pesel)  {
		if (Person.usedPesels.containsKey(pesel))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		int pesel = 85123123;
		System.out.println("Rok urodzenia: " + getYearOfBirht(pesel));
		System.out.println("wiek: " + getAge(pesel));
	}
	
}
