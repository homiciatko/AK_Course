package day_08.watki;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int numberOfThreads = 100;
		int counter = 10;
		
		Balance balance = new Balance();
		List<Thread> balances = new ArrayList<Thread>();
		
		for(int i=0; i<numberOfThreads; i++)
			balances.add(new BalanceThread("Watek "+i, balance, counter));
	}
}
