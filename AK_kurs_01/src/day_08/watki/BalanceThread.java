package day_08.watki;

public class BalanceThread extends Thread {
	
	private Balance balance;
	private int counter;
	
	public BalanceThread(String name, Balance balance, int counter) {
		super(name);
		this.balance = balance;
		this.counter = counter;
		start();
	}
	@Override
	public void run() {
		int score = 0;
		for (int i=0; i<counter; i++){
			score = balance.balance();
			System.out.println(Thread.currentThread().getName() + " wywolanie balance() nr: " +i);
//			if (score != 0) {
//				break;
//			}
		}
//		System.out.println(Thread.currentThread().getName()+" wynik to "+score);
	}
	

}
