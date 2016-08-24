package day_08.ballsExample;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class BounceFrame extends JFrame implements ActionListener{
	private static final int WIDTH = 450;
	private static final int HEIGHT = 350;
	private BallPanel ballPanel;
	
	public BounceFrame(){
		super("W¹tki pileczka");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		setSize(WIDTH,HEIGHT);
		
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setVisible(true);
		
		addButtonToJPanel(buttonsPanel, "START", this);
		addButtonToJPanel(buttonsPanel, "STOP", new StopListener());
		addButtonToJPanel(buttonsPanel, "CLEAR", new ClearBallPanelListener());
		addButtonToJPanel(buttonsPanel, "CLOSE", new CloseListener());
		
		add(buttonsPanel, BorderLayout.SOUTH);
		ballPanel = new BallPanel();
		add(ballPanel, BorderLayout.CENTER);
		
	}
	
	

	private void addButtonToJPanel(JPanel panel, String buttonTitle, ActionListener actionListener) {
		JButton button = new JButton(buttonTitle);
		panel.add(button);
		button.addActionListener(actionListener);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Ball ball = new Ball();
		ballPanel.add(ball);
		Runnable ballRunnable = new BallRunnable(ball, ballPanel);
		Thread t = new Thread(ballRunnable);
		t.start();

		
	}
	
	
	

	

}
