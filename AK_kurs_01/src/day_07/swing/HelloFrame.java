package day_07.swing;

import javax.swing.JFrame;

public class HelloFrame extends JFrame{
	
	public HelloFrame() {
		super("Hello world");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

}
