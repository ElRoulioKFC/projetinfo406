package frameGestion;

import java.awt.*;
import javax.swing.*;

public class FrameGestionProjet extends JFrame {
	private ListeProjet lp;
	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	public FrameGestionProjet() {
		this.setTitle("Gestion des Projets");
		this.setSize(LARGEUR,HAUTEUR);
		//ProjetCanvas pc = new ProjetCanvas(lp);
		
		
		this.setVisible(true);
	}

}
