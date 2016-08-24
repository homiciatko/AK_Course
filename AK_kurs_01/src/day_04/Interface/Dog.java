package day_04.Interface;

public class Dog implements Speakable	{

	@Override
	public void giveVoice(int value) {
		if (value == Speakable.QUIET )
			System.out.println("hau hau hau");
		else if (value == Speakable.LOUD)
			System.out.println("HAU HAU HAU");
		else
			System.out.println("nie szczekam");
	}
	
	public void eat() {
		System.out.println("ide jesc");
	}

}
