package frameGestion;

import java.awt.*;
import javax.swing.*;
import controleur.*;
import framePrincipale.FramePrincipale;

public class FrameGestionEmployes extends JFrame {
	private ListeEmployes le;
	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	JPanel gauche = new JPanel(new BorderLayout());
	JPanel bas = new JPanel(new GridLayout(1,2));
	
	public FrameGestionEmployes() {
		this.setTitle("Gestion des Employes");
		this.setSize(LARGEUR,HAUTEUR);
		JButton ajouter = new JButton("Ajouter un Employ�");
		JButton supprimer = new JButton("Supprimer un Employ�");
		ajouter.addActionListener(new AjoutEmployesListener());
		bas.add(ajouter);
		bas.add(supprimer);
		this.add(gauche,BorderLayout.WEST);
		gauche.add(bas,BorderLayout.SOUTH);

		this.setVisible(true);
	}

}
