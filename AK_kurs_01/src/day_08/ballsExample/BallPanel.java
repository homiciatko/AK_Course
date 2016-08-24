package day_08.ballsExample;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

public class BallPanel extends JPanel{
	
	private static List<Ball> balls = new ArrayList<Ball>();
//	private Map<Ball, Position> area = new HashMap<Ball, Position>();
	
	public void add(Ball ball) {
		balls.add(ball);
	}
	
	public static void resetList(){
		balls.clear();
	}

	@Override
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D graphics2d = (Graphics2D) graphics;
		
		for (Ball ball : balls)
			graphics2d.fill(ball.getShape());
		
	}

	public static List<Ball> getBalls() {
		return balls;
	}
	public void setBalls(List<Ball> balls) {
		this.balls = balls;
	}

}
