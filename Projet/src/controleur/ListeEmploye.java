package controleur;


import java.util.*;

public class ListeEmploye {
	public ArrayList<Employe> listeEmployes;
	
	public ListeEmploye() {
		this.listeEmployes = new ArrayList<Employe>();
	}
	public void ajouter(Employe employes) {
		this.listeEmployes.add(employes);
	}
	public void supprimer(Employe employes) {
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
	
	public Employe recupEmpByNom(String nom) {
		int i = 0;
		Employe emp = new Employe();
		emp.EmpNull();
		boolean trouve = false;
		while (trouve == false && i != this.taille()) {
			if (this.listeEmployes.get(i).getNom() == nom) {
				trouve = true;
				emp = this.listeEmployes.get(i);
			}
			i++;
		}
		return emp;
	}
	
	//public static void main(String[] args) {
		//Employes emp1 = new Employes(1,"Brivet","Alexis",1000, 35, "informaticiens", "alexis.brivet@onsenfou.fr");
		//Employes null1 = new Employes();
		//System.out.println(null1);
		//System.out.println(emp1.estEmpNull());
		//System.out.println(null1.estEmpNull());
		//ListeEmployes liste = new ListeEmployes();
		//liste.ajouter(emp1);
		//System.out.println(liste.recupEmpByNom("Rezader").estEmpNull());
		//liste.ajouter(new Employes(1,"Brivet","Jules",1000));
		//liste.ajouter(new Employes(1,"Real","Sandrine",4000));
		//System.out.println(liste);
		//liste.supprimer(emp1);
		//System.out.println(liste);
	//}

}
