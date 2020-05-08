package edt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class FramePrincipale extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	 JPanel Gestion=new JPanel();
	 JPanel PP= new JPanel(new GridLayout(3,5));
	 PanelEDT PEDT = new PanelEDT();
	 JPanel EDT= new JPanel();
	 JButton EspaceEDT = new JButton ("EDT");
	 JButton EspaceGestion = new JButton ("Gestion des Ressources");
	 JButton Home = new JButton ("Home");
	JMenuBar mb = new JMenuBar();

	public FramePrincipale () {

		this.setTitle("EDT");
		this.setSize(LARGEUR,HAUTEUR);



		//mise en palce du Panel Page Principale
		this.PP.add(this.EspaceGestion);
		this.PP.add(EspaceEDT);
		this.setContentPane(this.PP);


		// mise en place du Boutton Home
		this.Home.addActionListener(new RetourPP());
		mb.add(Home);
		this.setJMenuBar(mb);



						//positionnement des boutton EDT et Gestion
						this.PP.add(new Label (""));
						this.PP.add(new Label (""));
						this.PP.add(new Label (""));
						this.PP.add(new Label (""));
						this.PP.add(new Label (""));
						this.PP.add(new Label (""));
						this.PP.add(EspaceEDT);

						this.PP.add(new Label (""));
						this.PP.add(EspaceGestion);

						this.PP.add(new Label (""));
						this.PP.add(new Label (""));
						this.PP.add(new Label (""));
						this.PP.add(new Label (""));

		//Application des bouttons � leur effets respectifs
		this.EspaceGestion.addActionListener(new AccederGestion());
		this.EspaceEDT.addActionListener(new AccederEDT());

		EDT=PEDT.PanelEDT();
		this.Gestion.add(new Label ("Bienvenu dans l'Espace Gestion !"));


		this.addWindowListener(new WindowClosing(this));
		this.setVisible(true);
	}

	public static void main (String [] args){
		new FramePrincipale ();

	}

	//fonction pour passer sur le Panel de la Page Principale
	public void PanelPP() {
		if (this.getContentPane()!=PP) {
			this.setContentPane(this.PP);
		}
		this.revalidate();

	}
	//fonction pour passer sur le Panel de la Page Gestion
	public void PanelGestion() {
		this.setContentPane(this.Gestion);
		this.revalidate();

	}
	//fonction pour passer sur le Panel de la Page EDT
	public void PanelEDT() {
		this.setContentPane(this.EDT);
		this.revalidate();

	}





	//Classe Evenement Retour Page Principale
	public class RetourPP implements  ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			FramePrincipale.this.PanelPP();
		}
	}
	//Classe Evenement Acceder � la Page Gestion
	public class AccederGestion implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			FramePrincipale.this.PanelGestion();
		}
	}
	//Classe Evenement Acceder � la page EDT
	public class AccederEDT implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			FramePrincipale.this.PanelEDT();
		}
	}


}