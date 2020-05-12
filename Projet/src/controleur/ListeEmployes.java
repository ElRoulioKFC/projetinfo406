package controleur;


import java.util.*;

public class ListeEmployes {
	private ArrayList<Employes> listeEmployes;
	
	public ListeEmployes() {
		this.listeEmployes = new ArrayList<Employes>();
	}
	public void ajouter(Employes employes) {
		this.listeEmployes.add(employes);
	}
	public void supprimer(Employes employes) {
		this.listeEmployes.remove(employes);
	}
	public String toString() {
		String res = "";
		for(int i = 0;i<this.listeEmployes.size();i++) {
			res = res + this.listeEmployes.get(i).toString() + "\n";
		}
		return res;
	}
	public static void main(String[] args) {
		Employes emp1 = new Employes(1,"Brivet","Alexis",1000);
		ListeEmployes liste = new ListeEmployes();
		liste.ajouter(emp1);
		liste.ajouter(new Employes(1,"Brivet","Jules",1000));
		liste.ajouter(new Employes(1,"Real","Sandrine",4000));
		System.out.println(liste);
		liste.supprimer(emp1);
		System.out.println(liste);
	}

}
