package gestion;
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
	JPanel ressources = new JPanel(new GridLayout(3,7));

	public JPanel PanelGest() {
		
		JButton projet = new JButton("Projets");
		JButton ressource = new JButton("Ressources");
		JButton employe = new JButton("Employés");
		JButton ordinateur = new JButton("Ordinateur");
		JButton salle = new JButton("Salles");
		
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
		
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		
		ressources.add(employe);
		
		ressources.add(new Label(" "));
		
		ressources.add(ordinateur);
		
		ressources.add(new Label(" "));
		
		ressources.add(salle);
		
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		
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
