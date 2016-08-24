package day_04.zad3;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private String name;
	private List<Player> players = new ArrayList<Player>();
	
		
	public Game(String name) {
		super();
		this.name = name;
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public Player winner(){
		Player max = players.get(0);
		for (Player p : players) {
			if (p.getNumberOfPoints() > max.getNumberOfPoints())
				max = p;
		}
		if (max.getNumberOfPoints() > 100)
			return max ;
		
		return null;
	}
	
	public void printWinner() {
		Player player = winner();
		
		if (player != null) {
			System.out.println(player);
		}
		else 
			System.out.println("Brak zwyciêzców");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	

}
