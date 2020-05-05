package FramePrincipale;

import java.awt.*;
import javax.swing.*;

import frameGestion.FrameGestion;

public class FramePrincipale extends JFrame {
	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	
	
	public FramePrincipale () {
		
		this.setTitle("EDT");
		this.setSize(LARGEUR,HAUTEUR);
		this.setLayout(new BorderLayout());
		
		Button EspaceEDT = new Button (" EMPLOI DU TEMPS ");
		Button EspaceGestion = new Button (" GESTION DES RESSOURCES ");

		
				Button Home = new Button("<=|");
				Panel dessus = new Panel (new BorderLayout());
				this.add(dessus,BorderLayout.NORTH);
				dessus.add(Home,BorderLayout.WEST);
		
					JPanel centre = new JPanel (new GridLayout(3,5));
		
						centre.add(new Label (""));
						centre.add(new Label (""));
						centre.add(new Label (""));
						centre.add(new Label (""));
						centre.add(new Label (""));
						centre.add(new Label (""));
						centre.add(EspaceEDT);
		
						centre.add(new Label (""));
						centre.add(EspaceGestion);
						
						centre.add(new Label (""));
						centre.add(new Label (""));
						centre.add(new Label (""));
						centre.add(new Label (""));
		
					this.add(centre,BorderLayout.CENTER);
		
		JPanel EDT = new JPanel (new FlowLayout());
		EDT.add(new Label ("Bonjour"));
		
		
		
		this.addWindowListener(new WindowClosing(this));
		this.setVisible(true);
	}
	
	public static void main (String [] args){
		new FramePrincipale ();
	}

	public void changerMenu(JPanel e) {
		this.setContentPane(e);
		
	}
}
