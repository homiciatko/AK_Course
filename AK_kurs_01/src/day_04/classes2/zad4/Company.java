package day_04.classes2.zad4;

public class Company extends Subject{
	
	private int nip;

	public Company(String name, double tax, int nip) {
		super(name, tax);
		this.nip = nip;
	}

	public int getNip() {
		return nip;
	}
	public void setNip(int nip) {
		this.nip = nip;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + nip;
	}
}
