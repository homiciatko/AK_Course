package day_02;

public class FunctionExample {

	public static int f(int x){
		return x+2;
	}
	
	public int f2(int x){
		return x+10;
	}
	
	public static void main(String[] args) {
		// Scanner sc = new Scanner();
		// String name = sc.next();
		
		int y = f(2); // 2+2 => y = 4
		int z = FunctionExample.f(3); // 3+2
		FunctionExample fe = new FunctionExample();
		System.out.println(fe.f2(10));
		
		System.out.println("y to "+y+" a z to "+z);
	}

}
