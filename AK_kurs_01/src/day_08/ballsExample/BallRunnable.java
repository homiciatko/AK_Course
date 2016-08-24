package day_08.ballsExample;

public class BallRunnable implements Runnable {
	
	BallPanel ballPanel;
	private Ball ball;
	private static int speed = 10;
	private static int stop = 0;
	
	public BallRunnable(Ball ball, BallPanel ballPanel) {
		this.ball = ball;
		this.ballPanel = ballPanel;
	}
	
	
	@Override
	public void run() {
		
		int max = 2000;
		
		for (int i =0; i<max; i++) {
			while (stop == 1) {}
				
			ball.move(ballPanel.getBounds());
			ballPanel.repaint();
//			if ((i)%(233 +t) ==0) {
//				ball.collision();; 
//				System.out.println("collision = i: " + i + " t: " +t);
//				t += i/2 +1;
//			}
//			ballPanel.paint(ballPanel.getGraphics());
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

	public static int getStop() {
		return stop;
	}
	public static void setStop(int stop) {
		BallRunnable.stop = stop;
	}
	public static int getSpeed() {
		return speed;
	}
	public static void setSpeed(int speed) {
		BallRunnable.speed = speed;
	}
	
}
