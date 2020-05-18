package frameGestion;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controleur.Employes;
import controleur.ListeEmployes;
import frameGestion.FrameGestionEmployes;

public class SubFrameAjEmployes extends Frame {
	JTextField nom = new JTextField("",15);
	JTextField prenom = new JTextField("",15);
	JTextField metier = new JTextField("",15);
	JTextField mail = new JTextField("",15);
	JTextField nbh = new JTextField("0",15);
	JTextField salaire = new JTextField("0",15);
	JDialog d = new JDialog(this,"Information de l'Employ�",false);
	public SubFrameAjEmployes() {
		JButton ajouter = new JButton ("Ajouter");
		d.setSize(450,200);
		d.setLayout(new FlowLayout());
		//Label inf = new Label("Attention A bien remplire toutes les cases pour ajouter un employ�s");
		//d.add(inf,BorderLayout.NORTH);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(6,2));
		p.add(new Label("Nom : "));
		p.add(nom);
		p.add(new Label("Pr�nom : "));
		p.add(prenom);
		p.add(new Label("M�tier : "));
		p.add(metier);
		p.add(new Label("Mail : "));
		p.add(mail);
		p.add(new Label("Nb H/Sem : "));
		p.add(nbh);
		p.add(new Label("Salaire : "));
		p.add(salaire);
		d.add(p,BorderLayout.CENTER);
		ajouter.addActionListener(new AjoutEmp());
		d.add(ajouter,BorderLayout.SOUTH);
		//this.addWindowListener(new WindowClosing(this));
		d.setVisible(true);
	}
	public class AjoutEmp implements ActionListener{
		
		public AjoutEmp(){
			
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			ListeEmployes listeloc = new ListeEmployes();// = FrameGestionEmployes.liste;
			String nomE = nom.getText();
			String prenomE = prenom.getText();
			String metierE = metier.getText();
			String mailE = mail.getText();
			double nbhE;
			int salaireE;
			nbhE = Double.parseDouble(nbh.getText());
			salaireE = Integer.parseInt(salaire.getText());
			Employes emp = new Employes(nomE,prenomE,metierE,mailE,nbhE,salaireE);
			emp.setId(1);
			//System.out.println(FrameGestionEmployes.liste);
			listeloc.ajouter(emp);
			//FrameGestionEmployes.liste = listeloc;
			System.out.println(listeloc);
			d.setVisible(false);
		}
	}

}
