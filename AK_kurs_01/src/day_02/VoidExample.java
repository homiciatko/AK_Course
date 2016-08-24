package day_02;

public class VoidExample {
	
	public static void hello() {
		System.out.println("hello");
		
	}
	
	public static void FiveTimesHello() {
		for (int i =0;i<5;i++)
			hello();
	}
	
	public static void main(String[] args) {
		
		hello();
		FiveTimesHello();
		
	}

}
