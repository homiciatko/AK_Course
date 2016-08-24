package day_04.Interface;

public class Cat implements Speakable {

	@Override
	public void giveVoice(int value) {
		if (value == Speakable.QUIET )
			System.out.println("miau miau miau");
		else if (value == Speakable.LOUD)
			System.out.println("MIAU MIAU MIAU");
		else
			System.out.println("nie miaucze");
		
	}
	
	void sleep() {
		System.out.println("ide spac");
	}

}
