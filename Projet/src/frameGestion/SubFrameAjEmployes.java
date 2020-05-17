package frameGestion;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controleur.Employes;
import frameGestion.FrameGestionEmployes;

public class SubFrameAjEmployes extends Frame {
	JTextField nom = new JTextField("");
	JTextField prenom = new JTextField("");
	JTextField metier = new JTextField("");
	JTextField mail = new JTextField("",15);
	JTextField nbh = new JTextField("");
	JTextField salaire = new JTextField("");
	JDialog d = new JDialog(this,"Information de l'Employé",false);
	public SubFrameAjEmployes() {
		JButton ajouter = new JButton ("Ajouter");
		d.setSize(450,200);
		d.setLayout(new FlowLayout());
		//Label inf = new Label("Attention A bien remplire toutes les cases pour ajouter un employés");
		//d.add(inf,BorderLayout.NORTH);
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
		//this.addWindowListener(new WindowClosing(this));
		d.setVisible(true);
	}
	public class AjoutEmp implements ActionListener{
		
		public AjoutEmp(){
			
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String nomE = nom.getText();
			String prenomE = prenom.getText();
			String metierE = metier.getText();
			String mailE = mail.getText();
			double nbhE;
			int salaireE;
			if (nbh.getText() == "" ) {
				nbhE = 0;
			}else {
			nbhE = Double.parseDouble(nbh.getText());
			}
			if (salaire.getText() == "" ) {
				salaireE = 0;
			}else {
				salaireE = Integer.parseInt(salaire.getText());
			}
			Employes emp = new Employes(nomE,prenomE,metierE,mailE,nbhE,salaireE);
			FrameGestionEmployes.liste.ajouter(emp);
			
			d.setVisible(false);
		}
	}

}
