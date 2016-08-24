package day10_Adnotations;

import java.lang.reflect.Method;

public class Main {
	
	@PawelAnnotatnion(to="Pawel")
	public int main() {
		return 5;
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Main m = new Main();
		m.locate();
	}
	
	public void locate() throws NoSuchMethodException, SecurityException{
		Class c = getClass();
		Method m = c.getMethod("main");
		PawelAnnotatnion annotatnion = m.getAnnotation(PawelAnnotatnion.class);
		System.out.println(annotatnion.to());
	}
}
