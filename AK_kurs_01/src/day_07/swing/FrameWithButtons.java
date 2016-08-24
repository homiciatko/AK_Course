package day_07.swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class FrameWithButtons extends JFrame{
	
	static int ROWS = 2;
	static int COLUMNS = 6;
	
	public FrameWithButtons() {
		super("Przyciski");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 700);
		addButtons();
		setLayout(new GridLayout(ROWS, COLUMNS));
		
		setVisible(true);
	}

	private void addButtons() {
		JButton button;
		for (int i = 0; i< ROWS*COLUMNS; i++) {
			button = new JButton(""+(i+1));
//			button.setOpaque(true);
//			button
			add(button);
		}
	}

}
