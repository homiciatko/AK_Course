package day_08.ticTacToe;

import java.awt.EventQueue;

import day_07.swing.FrameWithButtons;

public class Main {
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new TicTacToeFrame();
				new ComunicationWindow();
			}
		});
	}
}
