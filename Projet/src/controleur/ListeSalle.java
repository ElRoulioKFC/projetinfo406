package controleur;

import java.util.*;

public class ListeSalle {
	private ArrayList<Salle> listeSalle;
	
	public ListeSalle() {
		this.listeSalle = new ArrayList<Salle>();
	}
	public void ajouter(Salle salle) {
		this.listeSalle.add(salle);
	}
	public void supprimer(Salle salle) {
		this.listeSalle.remove(salle);
	}
	public String toString() {
		String res = "";
		for(int i = 0;i<this.listeSalle.size();i++) {
			res = res + this.listeSalle.get(i).toString();
		}
		return res;
	}
}