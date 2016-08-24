package day_06.enums;

public enum Answer {
	TAK(true),
	NIE(false),
	T(true),
	N(false),
	YES(true),
	NO(false),
	OK(true),
	SURE(true),
	NOPE(false);
	
	private boolean value;
	
	private Answer(boolean value) {
		this.value = value;
	}
	
	boolean getValue() {
		return value;
	}
	
	String getStringValue() {
		if (getValue())
			return "poprawna odpowiedz";
		else
			return "Niepoprawna odpowiedZ";
	}

}
