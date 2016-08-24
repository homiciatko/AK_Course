package day_04.zad3;

public class Main {
	
	public static void main(String[] args) {
		Game game = new Game("Warcaby");
		game.addPlayer(new Player("Micha³", "michalos", 120));
		game.addPlayer(new Player("Zosia", "ziss", 140));
		game.addPlayer(new Player("Adam", "AA", 80));	
		
		game.printWinner();
		
	
	}

}
