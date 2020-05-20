package frameGestion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controleur.ListeSalle;
import controleur.Salle;
import frameGestion.SubFrameAjProjets.AjoutProj;

public class SubFrameAjSalle extends Frame{
	JTextField nom = new JTextField("",15);
	Object[] typeRegist = new Object[] {"Salle de Réunion","Salle Informatique","Laboratoire","Autre"};
	JComboBox type = new JComboBox(typeRegist);
	JTextField capacite = new JTextField("0",15);
	JDialog d = new JDialog(this,"Information de la Salle",false);
	public SubFrameAjSalle() {
		JButton ajouter = new JButton ("Ajouter");
		d.setSize(450,120);
		d.setLayout(new FlowLayout());
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,2));
		p.add(new Label("Nom Salle : "));
		p.add(nom);
		p.add(new Label("Type de Salle : "));
		p.add(type);
		p.add(new Label("Nombre de place : "));
		p.add(capacite);
		d.add(p,BorderLayout.CENTER);
		ajouter.addActionListener(new AjoutSal());
		d.add(ajouter,BorderLayout.SOUTH);
		d.setVisible(true);
	}
	public class AjoutSal implements ActionListener{
		public AjoutSal() {
			
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			ListeSalle liste = new ListeSalle();//Ajouter la base de donnée
			String nomS = nom.getText();
			String typeS ="" + type.getSelectedItem();
			int capaciteS = Integer.parseInt(capacite.getText());
			Salle sal = new Salle(typeS,capaciteS,nomS);
			liste.ajouter(sal);
			System.out.println(liste);
			d.setVisible(false);
		}
	}
}
