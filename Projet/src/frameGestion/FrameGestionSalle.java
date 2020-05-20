package frameGestion;

import java.awt.*;
import javax.swing.*;

import controleur.FraAjSalleListener;


public class FrameGestionSalle extends JFrame{
	//private ListeProjet lp;
	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	private CanvasEmploye canvas = new CanvasEmploye() ; 
	
	JPanel gauche = new JPanel(new BorderLayout());
	JPanel bas = new JPanel(new GridLayout(1,2));
	
	public FrameGestionSalle() {
		this.setTitle("Gestion des Salles");
		this.setSize(LARGEUR,HAUTEUR);
		JButton ajouter = new JButton("Ajouter une Salle");
		JButton supprimer = new JButton("Supprimer une Salle");
		ajouter.addActionListener(new FraAjSalleListener());
		bas.add(ajouter);
		bas.add(supprimer);
		this.add(gauche,BorderLayout.WEST);
		gauche.add(bas,BorderLayout.SOUTH);
		
		this.add(canvas) ;
		
		this.setVisible(true);
	}
	
	public static void main (String args[]) {
		new FrameGestionSalle() ;
	}

}
