package FramePrincipale;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import controleur.*;



public class FramePrincipale extends JFrame {
	final static int HAUTEUR = 600;
	final static int LARGEUR = 1200;
	JPanel demarrage = new JPanel (new GridLayout(3,5));
	JPanel accueil = new JPanel(new GridLayout(3,5));
	JPanel ressources = new JPanel(new GridLayout(3,7));
	JPanel dessus = new JPanel (new BorderLayout());
	
	public FramePrincipale () {
		
		this.setTitle("Projet Groupe 3");
		this.setSize(LARGEUR,HAUTEUR);
		this.setLayout(new BorderLayout());
		
		JButton espaceEDT = new JButton (" EMPLOI DU TEMPS ");
		JButton espaceGestion = new JButton (" GESTION DES RESSOURCES ");
		JButton projet = new JButton("Projets");
		JButton ressource = new JButton("Ressources");
		JButton employe = new JButton("Employés");
		JButton ordinateur = new JButton("Ordinateur");
		JButton salle = new JButton("Salles");
		JButton home = new JButton("<=|");
		this.add(dessus,BorderLayout.NORTH);
		dessus.add(home,BorderLayout.WEST);
		

		
					
		
		demarrage.add(new Label (""));demarrage.add(new Label (""));demarrage.add(new Label (""));demarrage.add(new Label (""));demarrage.add(new Label (""));
		demarrage.add(new Label (""));demarrage.add(espaceEDT);demarrage.add(new Label (""));demarrage.add(espaceGestion);demarrage.add(new Label (""));
		demarrage.add(new Label (""));demarrage.add(new Label (""));demarrage.add(new Label (""));demarrage.add(new Label (""));demarrage.add(new Label (""));
		espaceGestion.addActionListener(new GestionsListener());
		
		accueil.add(new Label(" "));accueil.add(new Label(" "));accueil.add(new Label(" "));accueil.add(new Label(" "));accueil.add(new Label(" "));
		accueil.add(new Label(" "));accueil.add(projet);accueil.add(new Label(" "));
		accueil.add(ressource);accueil.add(new Label(" "));
		accueil.add(new Label(" "));accueil.add(new Label(" "));accueil.add(new Label(" "));accueil.add(new Label(" "));
		accueil.add(new Label(" "));
		
		projet.addActionListener(new ProjetListener());
		ressource.addActionListener(new RessourcesListener());
		employe.addActionListener(new EmployesListener());
		ordinateur.addActionListener(new OrdinateurListener());
		salle.addActionListener(new SalleListener());
		
		ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));
		ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));
		ressources.add(employe);ressources.add(new Label(" "));
		ressources.add(ordinateur);ressources.add(new Label(" "));
		ressources.add(salle);ressources.add(new Label(" "));
		ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));
		ressources.add(new Label(" "));ressources.add(new Label(" "));ressources.add(new Label(" "));
		
		this.add(demarrage,BorderLayout.CENTER);
		
		this.addWindowListener(new WindowClosing(this));
		this.setVisible(true);
	}
	public void changeJPanel(JPanel anc,JPanel nouv) {
		this.remove(anc);
		this.add(nouv,BorderLayout.CENTER);
		this.revalidate();
	}
	
	public class RessourcesListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			FramePrincipale.this.changeJPanel(accueil , ressources);
			
		}
		
	}
	public class GestionsListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			//JButton retour = new JButton("Précédent");
			//dessus.add(retour);
			FramePrincipale.this.changeJPanel(demarrage, accueil);
		}
	}
	public class Home implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton retour = new JButton("Précédent");
			dessus.add(retour);
			FramePrincipale.this.changeJPanel(demarrage, accueil);
		}
	}

	public static void main (String [] args){
		new FramePrincipale ();
	}

	public void changerMenu(JPanel e) {
		this.setContentPane(e);
		
	}
}
