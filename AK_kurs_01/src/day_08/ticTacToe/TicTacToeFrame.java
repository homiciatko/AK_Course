package day_08.ticTacToe;

import java.awt.GridLayout;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToeFrame extends JFrame{
	
	private static final int ROWS = 3;
	private static final int COLS = 3;
	private static final int NUMBER_OF_FIELDS = 9;
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	private List<JButton> buttons = new ArrayList<JButton>();
	
	public TicTacToeFrame() {
		super("Kó³ko i krzy¿yk");
		setLayout(new GridLayout(ROWS, COLS));
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addButtons();
	}
	
	void addButtons() {
		JButton button;
		ButtonListener listener = new ButtonListener();
		
		for(int i=0; i<NUMBER_OF_FIELDS; i++) {
			button = new JButton("");
			button.addActionListener(listener);
			add(button);
			buttons.add(button);
		}
	}
	
}
