package day_08.ticTacToe;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ComunicationWindow extends JFrame{
	
	private static final int WIDTH = 100;
	private static final int HEIGHT = 100;
	
	public ComunicationWindow() {
		super("Zwyciêstwo!");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true);
		JOptionPane.showMessageDialog(null, "Wygral X", "Zwyciêstwo!!!", JOptionPane.CANCEL_OPTION);
	}
}
