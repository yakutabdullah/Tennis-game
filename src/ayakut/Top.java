package ayakut;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Top extends JButton implements  ActionListener {
	public boolean pleaseWait = true;
		private static final int DIAMETER = 30;
		int x = 10;
		int y = 10;
		int xa = 1;
		int ya = 1;
		public int x2=420,x3=200,x4=250;
		int y2=420,y3=200,y4=250;
		int a2=1,a3=1,a4=1;
		int b2=1,b3=1,b4=1;
		
		private Main main;

		public Top(Main Main) {
			this.main= Main;
		}

		void move() {
			
			if (x + xa < 0)
				xa = 1;
			else if (x + xa > main.getWidth() - DIAMETER)
				xa = -1;
			else if (y + ya < 0)
				ya = 1;
			else if (y + ya > main.getHeight() - DIAMETER){
				ya = -1;
			main.puan = main.puan-5;
			}
			else if (collision()){
				ya = -1;
				y = main.barier.getTopY() - DIAMETER;
				main.puan = main.puan+10;
			}
			else if (collision2()){
				ya = -1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			else if (collision3()){
				ya = 1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			else if (collision4()){
				ya = -1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			else if (collision5()){
				ya = 1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			else{}
			
			x = x + xa;
			y = y + ya;
		
		}

		void move2() {
			
			if (x2 + a2 < 0)
				a2 = 1;
			else if (x2 + a2 > main.getWidth() - DIAMETER)
				a2 = -1;
			else if (y2 + b2 < 0)
				b2 = 1;
			else if (y2 + b2 > main.getHeight() - DIAMETER){
				
				b2 = -1;
				main.puan = main.puan-5;				
			}
			
			else if (collision6()){
				b2 = -1;
				y2 = main.barier.getTopY() - DIAMETER;
				main.puan = main.puan+10;
			}
			else if (collision7()){
				b2 = -1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			else if (collision8()){
				b2 = 1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			else if (collision9()){
				b2 = -1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			else if (collision10()){
				b2 = 1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			x2 = x2 + a2;
			y2 = y2 + b2;
		
		}
		
		void move3() {
		
			if (x3 + a3 < 0)
				a3 = 1;
			else if (x3 + a3 > main.getWidth() - DIAMETER)
				a3 = -1;
			else if (y3 + b3 < 0)
				b3 = 1;
			else if (y3 + b3 > main.getHeight() - DIAMETER){
				b3 = -1;
				main.puan = main.puan-5;
			}			
			else if (collision11()){
				b3 = -1;
				y3 = main.barier.getTopY() - DIAMETER;
				main.puan = main.puan+10;
			}
			else if (collision12()){
				b3 = -1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			else if (collision13()){
				b3 = 1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			else if (collision14()){
				b3 = -1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			else if (collision15()){
				b3 = 1;
			//	y = main.barier.getTopY() - DIAMETER;
			}
			x3 = x3 + a3;
			y3 = y3 + b3;
		
		}
		
		//1.top kontrol..
		private boolean collision() {
			return main.barier.kordinat().intersects(getBounds());
		}
		private boolean collision2() {
			return main.barier.kordinat2().intersects(getBounds());
		}
		private boolean collision3() {
			return main.barier.kordinat3().intersects(getBounds());
		}
		private boolean collision4() {
			return main.barier.kordinat4().intersects(getBounds());
		}
		private boolean collision5() {
			return main.barier.kordinat5().intersects(getBounds());
		}
		//2.top kontrol..
		private boolean collision6() {
			return main.barier.kordinat().intersects(getBounds2());
		}
		private boolean collision7() {
			return main.barier.kordinat2().intersects(getBounds2());
		}
		private boolean collision8() {
			return main.barier.kordinat3().intersects(getBounds2());
		}
		private boolean collision9() {
			return main.barier.kordinat4().intersects(getBounds2());
		}
		private boolean collision10() {
			return main.barier.kordinat5().intersects(getBounds2());
		}
		//3.top kontrol..
		private boolean collision11() {
			return main.barier.kordinat().intersects(getBounds3());
		}
		private boolean collision12() {
			return main.barier.kordinat2().intersects(getBounds3());
		}
		private boolean collision13() {
			return main.barier.kordinat3().intersects(getBounds3());
		}
		private boolean collision14() {
			return main.barier.kordinat4().intersects(getBounds3());
		}
		private boolean collision15() {
			return main.barier.kordinat5().intersects(getBounds3());
		}

		public void paint(Graphics2D g) {
			g.fillOval(x3, y3, DIAMETER, DIAMETER);
			g.fillOval(x2, y2, DIAMETER, DIAMETER);
			g.fillOval(x, y, DIAMETER, DIAMETER);
			
		}
		
		public Rectangle getBounds() {
			return new Rectangle(x, y, DIAMETER, DIAMETER);
		}
		public Rectangle getBounds2() {
			return new Rectangle(x2, y2, DIAMETER, DIAMETER);
		}
		public Rectangle getBounds3() {
			return new Rectangle(x3, y3, DIAMETER, DIAMETER);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}