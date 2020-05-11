package controleur;

import java.util.*;


public class ListeProjet {
	private ArrayList<Projet> listeProjet;
	
	
	public ListeProjet() {
		this.listeProjet = new ArrayList<Projet>();
	}
	public void ajouter(Projet projet) {
		this.listeProjet.add(projet);
	}
	public void supprimer(Projet projet) {
		this.listeProjet.remove(projet);
	}
	public String toString() {
		String res = "";
		for(int i = 0;i<this.listeProjet.size();i++) {
			res = res + this.listeProjet.get(i).toString();
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		Employes chef = new Employes(1,"Brivet","Alexis","Informaticien",1000);
		Projet projet1 = new Projet(1,"Projet 1",0,chef);
		Projet projet2 = new Projet(2,"Projet 2",0,chef);
		Projet projet3 = new Projet(3,"Projet 3",0,chef);
		ListeProjet liste = new ListeProjet();
		liste.ajouter(projet1);
		liste.ajouter(projet2);
		liste.ajouter(projet3);
		System.out.println(liste);
		liste.supprimer(projet2);
		System.out.println(liste);
		
	}
}