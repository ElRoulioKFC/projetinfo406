package frameGestion;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import SQL.SqlEmploye;
import controleur.Employe;
import controleur.ListeEmploye;


public class SubFrameAjEmploye extends Frame {
	JTextField nom = new JTextField("",15);
	JTextField prenom = new JTextField("",15);
	JTextField metier = new JTextField("",15);
	JTextField mail = new JTextField("",15);
	JTextField nbh = new JTextField("0",15);
	JTextField salaire = new JTextField("0",15);
	JDialog d = new JDialog(this,"Information de l'Employé",false);
	public SubFrameAjEmploye() {
		JButton ajouter = new JButton ("Ajouter");
		d.setSize(450,200);
		d.setLayout(new FlowLayout());
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(6,2));
		p.add(new Label("Nom : "));
		p.add(nom);
		p.add(new Label("Prénom : "));
		p.add(prenom);
		p.add(new Label("Métier : "));
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
		d.setVisible(true);
	}
	public class AjoutEmp implements ActionListener{
		
		public AjoutEmp(){
			
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			ListeEmploye liste = new ListeEmploye();//Ajouter la base de donnée
			String nomE = nom.getText();
			String prenomE = prenom.getText();
			String metierE = metier.getText();
			String mailE = mail.getText();
			int nbhE;
			int salaireE;
			nbhE = Integer.parseInt(nbh.getText());
			salaireE = Integer.parseInt(salaire.getText());
			Employe emp = new Employe(nomE,prenomE,metierE,mailE,nbhE,salaireE);
			SqlEmploye.insertion(nomE, prenomE, nbhE, 0, metierE, mailE, 1, nomE + prenomE, nomE + prenomE, "Le Role est inutile", salaireE);
			emp.setId(1);
			double nb = (double)nbhE;
			liste.ajouter(emp);//Ajouter la base de donnée
			System.out.println(liste);
			d.setVisible(false);
		}
	}

}
