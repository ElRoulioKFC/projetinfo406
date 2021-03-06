package edt;

import java.awt.*;
import java.util.*;

public class CalendrierCanvas extends Canvas {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Date date;
	
	
	public CalendrierCanvas (Date date) {
		this.date=date;
	}
	
	@SuppressWarnings("deprecation")
	public void paint (Graphics g) {
		int nb_jour=0;
		
		nb_jour=dessin_nom_mois(date.getMonth(),g,date.getYear());
		
		dessin_cases_calendrier(date,nb_jour,g);
		
		date.setDate(1);
		System.out.println(date.getMonth());
		
	}

	@SuppressWarnings("deprecation")
	private void dessin_cases_calendrier(Date date, int nb_jour, Graphics g) {
		int largeur=this.getWidth();
		int hauteur=this.getHeight();
		int num�ro_semaine=0;
		for (int i=1;i<=nb_jour;i++) {
			date.setDate(i);
			
			switch (date.getDay()) {
				case 0:	
					g.drawRect((largeur-100)/7+650, (hauteur-100)/5+100*num�ro_semaine, (largeur-100)/7, (hauteur-100)/5);
					g.drawString(String.valueOf(date.getDate()),850, 200+100*num�ro_semaine);
					num�ro_semaine++;
					break;
				case 1:	
					g.drawRect((largeur-100)/7+50, (hauteur-100)/5+100*num�ro_semaine, (largeur-100)/7, (hauteur-100)/5);
					g.drawString(String.valueOf(date.getDate()),250, 200+100*num�ro_semaine);
					break;
				case 2:	
					g.drawRect((largeur-100)/7+150, (hauteur-100)/5+100*num�ro_semaine, (largeur-100)/7, (hauteur-100)/5);
					g.drawString(String.valueOf(date.getDate()),350, 200+100*num�ro_semaine);
					break;
				case 3:	
					g.drawRect((largeur-100)/7+250, (hauteur-100)/5+100*num�ro_semaine, (largeur-100)/7, (hauteur-100)/5);
					g.drawString(String.valueOf(date.getDate()),450, 200+100*num�ro_semaine);
					break;
				case 4:	
					g.drawRect((largeur-100)/7+350, (hauteur-100)/5+100*num�ro_semaine, (largeur-100)/7, (hauteur-100)/5);
					g.drawString(String.valueOf(date.getDate()),550, 200+100*num�ro_semaine);
					break;
				case 5:	
					g.drawRect((largeur-100)/7+450, (hauteur-100)/5+100*num�ro_semaine, (largeur-100)/7, (hauteur-100)/5);
					g.drawString(String.valueOf(date.getDate()),650, 200+100*num�ro_semaine);
					break;
				case 6:	
					g.drawRect((largeur-100)/7+550, (hauteur-100)/5+100*num�ro_semaine, (largeur-100)/7, (hauteur-100)/5);
					g.drawString(String.valueOf(date.getDate()),750, 200+100*num�ro_semaine);
					break;
				default :
					break;
			}
		}
		
	}

	private int dessin_nom_mois(int month, Graphics g, int i) {
		int nb_jour=0;
		switch (month){
		case 0 :
			g.drawString("Janvier", 200, 150);
			nb_jour=31;
			break;
		case 1 :
			g.drawString("F�vrier", 200, 150);
			if(i%4==0) {
				nb_jour=29;
			} else {
				nb_jour=28;
			}
			break;
		case 2 :
			g.drawString("Mars", 200, 150);
			nb_jour=31;
			break;
		case 3 :
			g.drawString("Avril", 200, 150);
			nb_jour=30;
			break;
		case 4 :
			g.drawString("Mai", 200, 150);
			nb_jour=31;
			break;
		case 5 :
			g.drawString("Juin", 200, 150);
			nb_jour=30;
			break;
		case 6 :
			g.drawString("Juilet", 200, 150);
			nb_jour=31;
			break;
		case 7 :
			g.drawString("Ao�t", 200, 150);
			nb_jour=31;
			break;
		case 8 :
			g.drawString("Septembre", 200, 150);
			nb_jour=30;
			break;
		case 9 :
			g.drawString("Octobre", 200, 150);
			nb_jour=31;
			break;
		case 10 :
			g.drawString("Novembre", 200, 150);
			nb_jour=30;
			break;
		case 11 :
			g.drawString("D�cembre", 200, 150);
			nb_jour=31;
			break;
		default :
			break;
	}
		g.drawString(String.valueOf(date.getYear()+1900), 250, 150);
	return nb_jour;	
	}

	public void update(CalendrierCanvas calendrierCanvas,Object arg1) {
		this.repaint();
	}
	

	public Date mois_sup(Date date2) {
		if (date.getMonth()==11) {
			date.setMonth(0);
			date.setYear(date.getYear()+1);
		} else {
			date.setMonth(date.getMonth()+1);
		}
		update(this,date);
		return date;
		
	}

	public Date mois_prec(Date date2) {
		if (date.getMonth()==0) {
			date.setMonth(11);
			date.setYear(date.getYear()-1);
		} else {
			date.setMonth(date.getMonth()-1);
		}
		update(this,date);
		return date;
	}
}
