package day_04.zad3;

public class Player {

	private String name;
	private String userName;
	private int numberOfPoints;

	public Player(String name, String userName) {
		super();
		this.name = name;
		this.userName = userName;
		this.numberOfPoints = 0;
	}

	public Player(String name, String username, int numberOfPoints) {
		this(name, username);
		this.numberOfPoints = numberOfPoints;
	}
	
	@Override
	public String toString() {
		return name + " " + userName + " liczba punktow: " + numberOfPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getNumberOfPoints() {
		return numberOfPoints;
	}

	public void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}

}
