package day_08.ballsExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopListener implements ActionListener {
	private static int speed = BallRunnable.getSpeed();
	private static int ON = 0;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (ON) {
		case 0:
			ON = 1;
			BallRunnable.setStop(ON);
			System.out.println("ON " + ON);
			break;
		case 1:
			ON = 0;
			BallRunnable.setStop(ON);
			System.out.println("ON " + ON);
			break;
		default:
			break;
		}
	}

}
