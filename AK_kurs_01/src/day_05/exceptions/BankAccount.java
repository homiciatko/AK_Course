package day_05.exceptions;

public class BankAccount {
	
	private String number;
	private Person owner;
	private int founds;
	
	public BankAccount(Person owner, String number) {
		this.owner = owner;
		this.number = number;
		founds = 0;
	}
	
	public void deposit(int depositedMoney) {
		founds += depositedMoney;
	}
	
	public void withdraw(int withdrawedMoney) throws InsufficientFundsException {
		System.out.println("probuje pobrac " + withdrawedMoney);
		if (founds < withdrawedMoney)
			throw new InsufficientFundsException("Brak œrodkó na koncie");
		else {
			founds =- withdrawedMoney;
			System.out.println("pobrano " + withdrawedMoney);
		}
			
	}
	

	public int getFounts() {
		return founds;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
}
