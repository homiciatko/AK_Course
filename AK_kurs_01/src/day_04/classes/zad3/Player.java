package day_04.classes.zad3;

public class Player {
	
	private String name;
	private String username;
	private int points;
	
	public void fullName() {
		System.out.println(getName() + " " + getUsername());
	}

	public Player(String name, String username, int points) {
		super();
		this.name = name;
		this.username = username;
		this.points = points;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", username=" + username + ", points=" + points + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}


}
