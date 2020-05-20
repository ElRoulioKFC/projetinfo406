package frameGestion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controleur.ListeMateriel;
import controleur.ListeSalle;
import controleur.Materiel;
import controleur.Salle;



public class SubFrameAjMateriel extends Frame {
	JTextField nom = new JTextField("",15);
	Object[] typeRegist = new Object[] {"Ordinateur","Super Calculateur","Maeriel d'analyse","Autre"};
	JComboBox type = new JComboBox(typeRegist);
	JTextField localisation = new JTextField("0",15);
	JDialog d = new JDialog(this,"Information de la Salle",false);
	public SubFrameAjMateriel() {
		JButton ajouter = new JButton ("Ajouter");
		d.setSize(450,120);
		d.setLayout(new FlowLayout());
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,2));
		p.add(new Label("Nom Materielle : "));
		p.add(nom);
		p.add(new Label("Type de Materielle : "));
		p.add(type);
		p.add(new Label("Salle : "));
		p.add(localisation);
		d.add(p,BorderLayout.CENTER);
		ajouter.addActionListener(new AjoutMat());
		d.add(ajouter,BorderLayout.SOUTH);
		d.setVisible(true);
	}
	public class AjoutMat implements ActionListener{
		public AjoutMat() {
			
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			ListeSalle listeSalle = new ListeSalle();//Ajouter la base de donnée
			ListeMateriel liste = new ListeMateriel();
			String nomM = nom.getText();
			String typeM ="" + type.getSelectedItem();
			Salle localisationM = listeSalle.recupSallebyNom(localisation.getText());
			Materiel mat = new Materiel(nomM,typeM,localisationM);
			liste.ajouter(mat);
			System.out.println(liste);
			d.setVisible(false);
		}

	}
}
