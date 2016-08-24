package day_06.enums;

public enum Color {
	RED(false), GREEN(true), BLUE(true);

	private boolean pretty;

	Color(boolean pretty) {
		this.pretty = pretty;
	}

	public boolean isPretty() {
		return pretty;
	}

	public void setPretty(boolean pretty) {
		this.pretty = pretty;
	}
	
	public void printInformation() {
		if (isPretty()) {
			System.out.println("kolor jest piekny");
		}
		else
			System.out.println("kolor nie jest ladny");
	}

}