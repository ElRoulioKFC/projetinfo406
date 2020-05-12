package frameGestion;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controleur.*;
import framePrincipale.FramePrincipale;

public class PanelGestion {
	

	JPanel accueil = new JPanel(new GridLayout(3,5));

	public JPanel PanelGest(JButton ressource) {
		
		JButton projet = new JButton("Projets");
			
		
		accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		
		accueil.add(projet);
		
		accueil.add(new Label(" "));
		
		accueil.add(ressource);
		
		accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		
		projet.addActionListener(new ProjetListener());
//		ressource.addActionListener(new RessourcesListener());
		

		return accueil;
	}
	

	

	
//	public class RessourcesListener implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent arg0) {
//			FramePrincipale.ressources(this.ressources);
//			
//		}
//		
//	}


}
