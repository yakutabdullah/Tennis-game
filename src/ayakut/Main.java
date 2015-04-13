package ayakut;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.*;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Main extends JPanel implements ActionListener{
	public int puan=50;
//	public boolean pleaseWait = false;
	Top top = new Top(this);
	Barier barier = new Barier(this);
	AnimatedButton ani = new AnimatedButton(this);
	public int apo=0;
int x=250;
int y=350;
int width=170;
int height=180;
public int birincix;

	public Main() {
		
		
		setLayout(null);
		setVisible(true);
		setSize(640, 480);
		
		for(int i=0; i<1; i++){
			AnimatedButton a1 = new AnimatedButton("Save" , i*65, this.getHeight());
			add( a1);
			Thread t1 = new Thread(a1);
			t1.start();
		}
		
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				barier.keyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				barier.keyPressed(e);
			}
		});
		setFocusable(true);
	}
	
	private void move() {
		barier.move();
		top.move2();
		top.move3();
		//ball2.move();
		top.move();
		if(puan ==0){
			Bitti();
		}
		
		while(!ani.block){
			
			
			System.out.print("apoqqqqqqqqq");
		}
		
		
	}

	@Override
	public void paint(Graphics g) {
		Random r = new Random();
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		r.nextInt(232);
		g2d.setColor(Color.orange );
		top.paint(g2d);
	//	top.paint(g2d);
		//ball2.paint(g2d);
		
		barier.paint(g2d);
		g2d.setFont(new Font("Verdana", Font.BOLD, 20));
		g.drawString("Points "+puan+"", 250, 25);
	}
	
	public void Bitti() {
		JOptionPane.showMessageDialog(this, "Oyun Bitti", "Bitti", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Abdullah Yakut");
	 
		Main main = new Main();
		frame.add(main);
		frame.setSize(700, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			main.move();
			
			main.repaint();
			Thread.sleep(5);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
	/*	for (BallPanel ball : ballVector) {
			ball.pleaseWait = !ball.pleaseWait;
		}
		System.out.print("apo"+apo);
		if( btnStop.getText().equalsIgnoreCase("STOP"))
			btnStop.setText("START");
		else
			btnStop.setText("STOP");
			*/
		System.out.print("apo"+apo);
	}

}