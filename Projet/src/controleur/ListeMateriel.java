package controleur;

import java.util.*;

public class ListeMateriel {
	private ArrayList<Materiel> listeMateriel;
	
	public ListeMateriel() {
		this.listeMateriel = new ArrayList<Materiel>();
	}
	public void ajouter(Materiel materiel) {
		this.listeMateriel.add(materiel);
	}
	public void supprimer(Materiel materiel) {
		this.listeMateriel.remove(materiel);
	}
	public String toString() {
		String res = "";
		for(int i = 0;i<this.listeMateriel.size();i++) {
			res = res + this.listeMateriel.get(i).toString();
		}
		return res;
	}
}
