package day_08.klasyAbstrakcyjne;

public interface Hello {
	
	default void hello() {
		System.out.println("hello");
	}

}
