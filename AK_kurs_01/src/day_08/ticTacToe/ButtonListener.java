package day_08.ticTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {
	
	private int counter = 0;
	private int tmp = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
//		System.out.println(counter);
		if (counter %2 == 0) {
			clickedButton.setText("X");
		}
		
		if (counter %2  == 1) {
			clickedButton.setText("O");
		}
		counter++;
//		System.out.println("tmp: " + tmp);
//		System.out.println("tmp++ % 2: " + tmp++ %2);
//		System.out.println("tmp: " + tmp);
		clickedButton.setEnabled(false);
	}
	
}
