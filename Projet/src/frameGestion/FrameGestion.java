package frameGestion;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import controleur.*;

public class FrameGestion extends JFrame{
	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	JPanel accueil = new JPanel(new GridLayout(3,5));
	JPanel ressources = new JPanel(new GridLayout(3,7));
	
	
	
	public FrameGestion() {
		this.setTitle("Gestion des Ressources");
		this.setSize(LARGEUR,HAUTEUR);
		

		this.setContentPane(accueil);
		JButton projet = new JButton("Projets");
		JButton ressource = new JButton("Ressources");
		JButton employe = new JButton("Employés");
		JButton ordinateur = new JButton("Ordinateur");
		JButton salle = new JButton("Salles");
		accueil.add(new Label(" "));accueil.add(new Label(" "));accueil.add(new Label(" "));accueil.add(new Label(" "));accueil.add(new Label(" "));
		accueil.add(new Label(" "));accueil.add(projet);accueil.add(new Label(" "));
		accueil.add(ressource);accueil.add(new Label(" "));
		accueil.add(new Label(" "));accueil.add(new Label(" "));accueil.add(new Label(" "));accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		projet.addActionListener(new ProjetListener());
		ressource.addActionListener(new RessourcesListener());
		
		ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));
		ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));
		ressources.add(employe);ressources.add(new Label(" "));
		ressources.add(ordinateur);ressources.add(new Label(" "));
		ressources.add(salle);ressources.add(new Label(" "));
		ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));
		ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));
		this.setVisible(true);
		

	}
	public void ressources(JPanel ress) {
		this.setContentPane(ress);
		this.revalidate();
	}
	
	public class RessourcesListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			FrameGestion.this.ressources(ressources);
			
		}
		
	}


	public static void main(String[] args) {
		new FrameGestion();

	}

}
