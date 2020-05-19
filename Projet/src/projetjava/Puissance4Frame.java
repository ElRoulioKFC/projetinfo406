package projetjava;



import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
 
public class Puissance4Frame extends Canvas
{
	public static final int WIDTH=500;
	public static final int HEIGHT=500;
	JFrame maFrame;
 
	/*création des boutons de colonne*/
	JButton c0,c1,c2,c3,c4,c5,c6;
	JPanel mesBoutons, test2;
 
	Puissance4Frame()
	{
		super();
		maFrame=new JFrame("Puissance 4");
		maFrame.setSize(WIDTH,HEIGHT);
		mesBoutons=new JPanel();
		test2=new JPanel();
 
		c0=new JButton("1");
		c1=new JButton("2");
		c2=new JButton("3");
		c3=new JButton("4");
		c4=new JButton("5");
		c5=new JButton("6");
		c6=new JButton("7");
 
		mesBoutons.add(c0);
		mesBoutons.add(c1);
		mesBoutons.add(c2);
		mesBoutons.add(c3);
		mesBoutons.add(c4);
		mesBoutons.add(c5);
		mesBoutons.add(c6);
 
		test2.add(this);
		maFrame.getContentPane().add(mesBoutons);
		maFrame.getContentPane().add(test2);
 
		//maFrame.setContentPane(this);
 
		maFrame.setVisible(true);
	}
 
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.drawLine(20,20,20,200);
	}
 
	public static void main(String []args)
	{
		Puissance4Frame p=new Puissance4Frame();
	}
}
