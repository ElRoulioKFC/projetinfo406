package frameGestion;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controleur.Employe;
import controleur.ListeEmploye;

public class SupEmp extends Frame{
	public SupEmp(ListeEmploye liste) {
		String[] listeNom = liste.listeNom();
		System.out.println(liste);
		String employe = (String) JOptionPane.showInputDialog(
				null, "Suppression d'employé ", "Liste des des Employés"
				, JOptionPane.QUESTION_MESSAGE, null, listeNom, listeNom[0]);
		liste.supprimer(liste.recupEmpByNom(employe));
		System.out.println(liste);
		revalidate();
	}
	

}
