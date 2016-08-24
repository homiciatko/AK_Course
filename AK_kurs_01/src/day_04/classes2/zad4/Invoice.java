package day_04.classes2.zad4;

import java.util.HashMap;
import java.util.Map;

public class Invoice {
	
	private int number;
	private int nip;
	private Subject subject;
	private double netPrice;
	Map<Product, Integer> products = new HashMap<Product, Integer>();
	
	public Invoice(int number, int nip, Subject subject) {
		this.number = number;
		this.nip = nip;
		this.subject = subject;
	}
	
	public void addProduct(Product product, Integer quantity) {
		products.put(product, quantity);
		netPrice += product.getNetPrice() * quantity.doubleValue();
	}
	
	public double getGrossPrice() {
		return netPrice * subject.getTax();
	}
	
	@Override
	public String toString() {
		return "Faktura nr: " + number + " wystawiona na: " + subject + " na kwote brutto: " + getGrossPrice(); 
	}
	

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNip() {
		return nip;
	}
	public void setNip(int nip) {
		this.nip = nip;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
}
