package day_06.enums;

import java.util.Scanner;

public class AnswerExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj odpowiedü");
		String answer = scanner.next();
		scanner.close();
		
		try {
			System.out.println(AnswerExample.getUserAnswer(answer));
		} catch (UnknownAnswerException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static String getUserAnswer(String answer) throws UnknownAnswerException {
		for (Answer enumAnswer : Answer.values())
			if (answer.equals(enumAnswer.toString()))
				return enumAnswer.getStringValue();
		
		throw new UnknownAnswerException("Nieznana odpowiedz");
	}
	
}
