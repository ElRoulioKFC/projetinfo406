package frameGestion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.*;

import controleur.*;
import frameGestion.SubFrameAjEmployes.AjoutEmp;

public class SubFrameAjProjets extends Frame{
	JTextField nom = new JTextField("",15);
	JTextField client = new JTextField("",15);
	JTextField nbh = new JTextField("0",15);
	JTextField date = new JTextField("jj/mm/aaaa",15);
	JTextField chef = new JTextField("",15);
	JDialog d = new JDialog(this,"Information du projet",false);
	public SubFrameAjProjets() {
		JButton ajouter = new JButton ("Ajouter");
		d.setSize(450,200);
		d.setLayout(new FlowLayout());
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(6,2));
		p.add(new Label("Nom Projet : "));
		p.add(nom);
		p.add(new Label("Nom Client : "));
		p.add(client);
		p.add(new Label("Estimation Heure : "));
		p.add(nbh);
		p.add(new Label("Date Limite : "));
		p.add(date);
		p.add(new Label("Nom Chef Projet : "));
		p.add(chef);
		d.add(p,BorderLayout.CENTER);
		ajouter.addActionListener(new AjoutProj());
		d.add(ajouter,BorderLayout.SOUTH);
		d.setVisible(true);
	}
	public class AjoutProj implements ActionListener{
		public AjoutProj() {
			
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			ListeEmployes listeEmp = new ListeEmployes();//Ajouter la base de donnée
			ListeProjet liste = new ListeProjet();//Ajouter la base de donnée
			String nomP = nom.getText();
			String clientP = client.getText();
			double nbhP = Double.parseDouble(nbh.getText());
			int jour = Integer.parseInt(date.getText().substring(0,2));
			int mois = Integer.parseInt(date.getText().substring(3,5));
			int annee = Integer.parseInt(date.getText().substring(6,10));
			Date dateP = new Date(annee -1900, mois -1 , jour);
			Employes chefP;
			chefP = listeEmp.recupEmpByNom(chef.getText());
			Projet projet = new Projet(nomP, clientP, nbhP, dateP, chefP);
			liste.ajouter(projet);//Ajouter la base de donnée
			System.out.println(liste);
			d.setVisible(false);
		}
	}
}
