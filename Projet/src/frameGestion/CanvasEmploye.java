package frameGestion;

import java.awt.*;

import javax.swing.JButton;

public class CanvasEmploye extends Canvas {
	
	public void paint(Graphics g) {
		
		this.setTitle("Canvas Employés") ;
		g.setColor(Color.RED);
		g.drawLine(250, 60, 600, 60);
		g.drawLine(250, 110, 600, 110);
		g.drawLine(250, 160, 600, 160);
		g.drawLine(250, 210, 600, 210);
		g.drawLine(250, 260, 600, 260);
		g.drawLine(250, 310, 600, 310);
		g.drawLine(250, 360, 600, 360);
		g.drawLine(250, 410, 600, 410);
		g.drawLine(250, 460, 600, 460);
		g.setColor(Color.BLUE); 
		
		g.drawLine(250, 60, 250, 460);
		g.drawLine(600, 60, 600, 460);
	}
 
	


	private void setTitle(String string) {
		
		
	}
	
	public static void main(String[] args) {
		new CanvasEmploye() ;
		
	}

}
