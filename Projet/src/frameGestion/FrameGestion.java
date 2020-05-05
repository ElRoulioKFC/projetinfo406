package frameGestion;

import java.awt.*;
import javax.swing.*;

import controleur.ProjetListener;

public class FrameGestion extends JFrame{
	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	
	public FrameGestion() {
		this.setTitle("Gestion des Ressources");
		this.setSize(LARGEUR,HAUTEUR);
//		MenuBar mb = new MenuBar();
//		Menu m1 = new Menu("Ajouter");
//		MenuItem i11 = new MenuItem("Personne");
//		MenuItem i12 = new MenuItem("Salle");
//		MenuItem i13 = new MenuItem("Ordinateur");
//		m1.add(i11);  
//        m1.add(i12);  
//        m1.add(i13);
//        Menu m2 = new Menu("Supprimer");
//		MenuItem i21 = new MenuItem("Personne");
//		MenuItem i22 = new MenuItem("Salle");
//		MenuItem i23 = new MenuItem("Ordinateur");
//		m2.add(i21);  
//        m2.add(i22);  
//        m2.add(i23);
//        Menu m3 = new Menu("Projet");
//        MenuItem i31 = new MenuItem("Créer");
//        MenuItem i32 = new MenuItem("Supprimer");
//        m3.add(i31);
//        m3.add(i32);
//        mb.add(m3);
//        mb.add(m1);
//		mb.add(m2);
//		this.setMenuBar(mb);
		
		JPanel p = new JPanel(new GridLayout(3,7));
		JButton projet = new JButton("Projet");
		JButton personne = new JButton("Personne");
		JButton materiel = new JButton("Matérielles");
		p.add(new Label(" "));p.add(new Label(" "));p.add(new Label(" "));p.add(new Label(" "));p.add(new Label(" "));p.add(new Label(" "));p.add(new Label(" "));
		p.add(new Label(" "));p.add(projet);p.add(new Label(" "));
		p.add(personne);p.add(new Label(" "));
		p.add(materiel);p.add(new Label(" "));
		p.add(new Label(" "));p.add(new Label(" "));p.add(new Label(" "));p.add(new Label(" "));
		p.add(new Label(" "));p.add(new Label(" "));p.add(new Label(" "));
		projet.addActionListener(new ProjetListener());
		this.add(p);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FrameGestion();

	}

}
