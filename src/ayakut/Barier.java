package ayakut;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Barier {
	private static final int Y =540;
	private static final int WIDTH = 60;
	private static final int HEIGHT = 10;
	int x = 0;
	int xa = 0;
	
	// barierlerin kordinatlarý
	int x2=200,x3=200,x4=200,x5=200;
	int y2=140,y3=145,y4=310,y5=315;
	
	private Main main;
	public Graphics2D apo = null;
	public Barier(Main main) {
		this.main = main;
	}

	public void move() {
		if (x + xa > 0 && x + xa < main.getWidth() - WIDTH)
			x = x + xa;
	}

	public void paint(Graphics2D g) {
		
		//apo.fillRect(200, 211, 200, 5);
		g.setColor(Color.red );
		g.fillRect(x2,y2,200,5);
		g.fillRect(x3,y3,200,5);
		g.fillRect(x4, y4, 200, 5);
		g.fillRect(x5, y5, 200, 5);
		g.fillRect(x5, y5, 200, 5);
		//g.setColor(Color.BLUE );
		g.fillRect(x, Y, WIDTH, HEIGHT);
		
	}

	public void keyReleased(KeyEvent e) {
		xa = 0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -1;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 1;
	}

	public Rectangle kordinat() {
		return new Rectangle(x, Y, WIDTH, HEIGHT);
	}
	public Rectangle kordinat2() {
		return new Rectangle(x2, y2, 200, 5);
	}
	public Rectangle kordinat3() {
		return new Rectangle(x3, y3, 200, 5);
	}
	public Rectangle kordinat4() {
		return new Rectangle(x4, y4, 200, 5);
	}
	public Rectangle kordinat5() {
		return new Rectangle(x5, y5, 200, 5);
	}

	public int getTopY() {
		return Y;
	}

	
}