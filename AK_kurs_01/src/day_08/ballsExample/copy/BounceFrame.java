package day_08.ballsExample.copy;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class BounceFrame extends JFrame implements ActionListener {
	private static final int WIDTH = 450;
	private static final int HEIGHT = 350;
	private BallPanel ballPanel;
	
	public BounceFrame(){
		super("W¹tki pi³eczka");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		setSize(WIDTH,HEIGHT);
		
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setVisible(true);
		
		addButton(buttonsPanel,"Start",this);
		addButton(buttonsPanel,"Close",new CloseListener());
		
		add(buttonsPanel, BorderLayout.SOUTH);
		ballPanel = new BallPanel();
		add(ballPanel,BorderLayout.CENTER);
	}

	private void addButton(JPanel panel,String title,ActionListener listener){
		JButton button = new JButton(title);
		panel.add(button);
		button.addActionListener(listener);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		Ball ball = new Ball();
		ballPanel.add(ball);
		int max = 2000;
		
		for (int i=1;i<=max;i++){
			ball.move(ballPanel.getBounds());
			ballPanel.paint(ballPanel.getGraphics());
			try {
				Thread.sleep(2);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	
}
