package day_04.classes.zad3;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private String name;
	private List<Player> players = new ArrayList<Player>();
	
	
	
	public Game(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addPlayers(Player player) {
		players.add(player);
	}
	
	public void winner() {
		Player maxPlayer = players.get(0);
		
		for(Player p : players)
			if (maxPlayer.getPoints() < p.getPoints())
				maxPlayer = p;
		if (maxPlayer.getPoints() >= 100)
			System.out.println("zwyciezca to: " + maxPlayer);
		else
			System.out.println("brak zwyciezcow :(");
		
	}

}
