package gestion;

import java.awt.*;
import javax.swing.*;

import controleur.ListeProjet;

public class FrameGestionProjet extends JFrame {
	private ListeProjet lp;
	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	JPanel gauche = new JPanel(new BorderLayout());
	JPanel bas = new JPanel(new GridLayout(1,2));
	
	public FrameGestionProjet() {
		
		this.setTitle("Gestion des Projets");
		
		this.setSize(LARGEUR,HAUTEUR);
		
		JButton ajouter = new JButton("Ajouter un Projet");
		JButton supprimer = new JButton("Supprimer un Projet");
		
		bas.add(ajouter);
		bas.add(supprimer);
		
		this.add(gauche,BorderLayout.WEST);
		gauche.add(bas,BorderLayout.SOUTH);
		
		
		
		this.setVisible(true);
	}

}
