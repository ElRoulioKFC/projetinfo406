package frameGestion;

import java.awt.*;
import javax.swing.*;

public class FrameGestionOrdinateur extends JFrame {

	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	JPanel gauche = new JPanel(new BorderLayout());
	JPanel bas = new JPanel(new GridLayout(1,2));
	
	public FrameGestionOrdinateur() {
		this.setTitle("Gestion des Ordinateurs");
		this.setSize(LARGEUR,HAUTEUR);
		JButton ajouter = new JButton("Ajouter un Ordinateur");
		JButton supprimer = new JButton("Supprimer un Ordinateur");
		bas.add(ajouter);
		bas.add(supprimer);
		this.add(gauche,BorderLayout.WEST);
		gauche.add(bas,BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
}
