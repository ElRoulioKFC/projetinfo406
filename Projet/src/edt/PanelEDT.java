package edt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

import javax.swing.JPanel;

public class PanelEDT{
	
	final static int HAUTEUR = 700;
	final static int LARGEUR = 1200;
	
	private Date date = new Date();
	private CalendrierCanvas cc= new CalendrierCanvas(date);
	
	public JPanel PanelEDT() {
		JPanel EDT=new JPanel();
		EDT.setLayout(new BorderLayout());
		
		
		Button mois_suivant=new Button(">");
		EDT.add(mois_suivant,BorderLayout.EAST);
		
		Button mois_precedent=new Button("<");
		EDT.add(mois_precedent,BorderLayout.WEST);
		
		mois_suivant.addActionListener(new Changer_mois_sup(date, cc));
		mois_precedent.addActionListener(new Changer_mois_prec(date,cc));
		
		
		
		
		EDT.add(cc ,BorderLayout.CENTER);
		
		
		return EDT;
	}
	
	
	
////	public static class LancerFenetre {
//		//public static void main(String[] args) {
//			new FrameEDT();
//		}
//	}


}
