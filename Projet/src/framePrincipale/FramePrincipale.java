package framePrincipale;

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
	
	 JPanel PP= new JPanel(new GridLayout(3,5));
	 
	 edt.PanelEDT PEDT = new edt.PanelEDT();
	 frameGestion.PanelGestion PGest = new frameGestion.PanelGestion();
	 frameGestion.PanelRessource PRess = new frameGestion.PanelRessource();
	 
	 JPanel EDT= new JPanel();
	 JPanel Gest = new JPanel();
	 JPanel ress = new JPanel();
	 
	 JButton EspaceEDT = new JButton ("Emplois Du Temps");
	 JButton EspaceGestion = new JButton ("Gestion");
	 JButton Ressources = new JButton ("Ressources");
	 
	 JButton Home = new JButton ("Home");
	 JMenuBar mb = new JMenuBar();
	 JMenuBar mb2 = new JMenuBar();

	public FramePrincipale () {

		this.setTitle("EDT");
		this.setSize(LARGEUR,HAUTEUR);



		//mise en palce du Panel Page Principale
		this.PP.add(this.EspaceGestion);
		this.PP.add(EspaceEDT);
		this.setContentPane(this.PP);


		// mise en place du Boutton Home
		this.Home.addActionListener(new RetourPP());
		this.mb.add(Home);
		this.setJMenuBar(this.mb);
		JMenu edtElement = new JMenu();
	JMenuItem projet = new JMenuItem();
//		JMenuItem Employe = new JMenuItem();
//		JMenuItem Salles = new JMenuItem();
		edtElement.add(projet);
//		edtElement.add(Employe);
//		edtElement.add(Salles);
		this.mb.add(edtElement);
		this.setJMenuBar(this.mb);



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
		this.Ressources.addActionListener(new AccederRessources());

		EDT=PEDT.PanelEDT();
		Gest=PGest.PanelGest(Ressources);
		ress = PRess.PanelRess();


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
			this.setJMenuBar(mb);
		}
		this.revalidate();

	}
	//fonction pour passer sur le Panel de la Page Gestion
	public void PanelGestion() {
		this.setContentPane(this.Gest);
		this.revalidate();

	}
	//fonction pour passer sur le Panel de la Page EDT
	public void PanelEDT() {
		this.setContentPane(this.EDT);
		this.setJMenuBar(mb2);
		this.revalidate();

	}
	
	//fonction pour passer sur le Panel de la Page Ressource
	public void PanelRessource() {
		this.setContentPane(this.ress);
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
	//Classe Evenement Acceder � la page Ressource
	public class AccederRessources implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			FramePrincipale.this.PanelRessource();
			
		}
	}
	
	public  void ressources(JPanel ress) {
		this.setContentPane(ress);
		this.revalidate();
	}


}