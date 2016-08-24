package day_04.classes.zad3;

public class Main {

	public static void main(String[] args) {
		
		Player p1 = new Player("P", "hk", 90);
		Player p2 = new Player("J", "m", 120);
		Player p3 = new Player("A", "b", 101);
		
		Game g1 = new Game("Giera");
		
		g1.addPlayers(p1);
		g1.addPlayers(p2);
		g1.addPlayers(p3);
		
		g1.winner();
		

	}

}
