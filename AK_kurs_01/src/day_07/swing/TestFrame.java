package day_07.swing;

import java.awt.Event;
import java.awt.EventQueue;

public class TestFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
//				new HelloFrame();
				new FrameWithButtons();
			}
		});
		
	}

}
