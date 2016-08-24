package day_08.klasyAbstrakcyjne;

public interface Workable {
	
	public abstract void live();
	
	public default void work() {
		for(int i = 0; i <10;i++) {
			System.out.println("HARD WORK!");
		}
	}

}
