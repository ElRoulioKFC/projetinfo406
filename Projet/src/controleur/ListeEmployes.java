package controleur;


import java.util.*;

public class ListeEmployes {
	public ArrayList<Employes> listeEmployes;
	
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
	public int recupLasteID() {
		if (this.listeEmployes == null) {
			return 0;
		}else {
			int i = this.taille() -1;
			return this.listeEmployes.get(i).getId();
		}

	}
	private int taille() {
		return this.listeEmployes.size();
	}
	//public static void main(String[] args) {
		//Employes emp1 = new Employes(1,"Brivet","Alexis",1000, 35, "informaticiens", "alexis.brivet@onsenfou.fr");
		//ListeEmployes liste = new ListeEmployes();
		//liste.ajouter(emp1);
		//liste.ajouter(new Employes(1,"Brivet","Jules",1000));
		//liste.ajouter(new Employes(1,"Real","Sandrine",4000));
		//System.out.println(liste);
		//liste.supprimer(emp1);
		//System.out.println(liste);
	//}

}
