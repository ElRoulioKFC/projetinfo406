package frameGestion;

import java.util.ArrayList;

public class ListeProjet {
	private ArrayList<Projet> list;
	
	public ListeProjet() {
		//this.list = new ArrayList<Projet>();
	}
	public void ajouter(Projet projet) {
		this.list.add(projet);
	}
	public void supprimer(int numprojet) {
		this.list.remove(numprojet);
	}
	//public void modifier()
}
