package ayakut;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AnimatedButton extends JButton implements Runnable, ActionListener {
	public Top top;
	public boolean block = true;
	public int apo=0;
	int windowHeight = 0;
	int direction = 0; // 0: down, 1:up;
	
	public Main main;
	AnimatedButton(final String pText, int pXCoordinate, int pWindowHeight){
		super();
		windowHeight = pWindowHeight;
		setText( pText );
		setBounds(pXCoordinate, 0, 60, 30);
		this.addActionListener(this);
	}
	
	public AnimatedButton(Main main){
		this.main= main;
	}
	
	
	public void run(){ 
		// when the start() is called, run() will be executed. 
		
		Random r = new Random();
		//apo = top.x3;
	//	System.out.print("apodddd"+apo);
			int x = this.getX();
			int y = this.getY();
		
			//System.out.print("we4444");
			if (direction==0)				
				setBounds(x , y + r.nextInt(7), 90, 30);
			else 
				setBounds(x , y - r.nextInt(7), 90, 30);
		
		
			try{
				Thread.sleep(10);
			}catch(Exception e){
				
			}
		}
	
	
	public void actionPerformed(ActionEvent e) {
		block = false;
		//run();
	//	apo();
	//	main.apo=main.apo+1;
		this.setVisible(true);
	//	top.pleaseWait = !top.pleaseWait;
	//	ball.pleaseWait = !ball.pleaseWait;
		
	}
	public void apo(){
		
		//double x = s.getBounds().getX();
		
	//	apo = main.birincix;
	//	System.out.print("apo"+apo);
		
		try{
			FileOutputStream fos =
				new FileOutputStream("d:\\save.txt");
		//	fos.write(birinci);
				/*fos.write(65);	
				fos.write(66);
				fos.write(67);
				fos.write(68);*/
			//	String str = "To day, it is not raining.";
			//	for (char c : str.toCharArray()) {
			//		byte b = (byte)c;
			//		fos.write(b);
			//	}
				fos.close();
		}catch(Exception e){
			System.out.print("ap22o");
		}
	//	return apo;
	}
	
	

}
