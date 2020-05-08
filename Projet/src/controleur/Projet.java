package controleur;

public class Projet {
	private int idP;
	private String nomP;
	private int nbheureP;
	private Employes chefDeProjet;
	
	public Projet(int id, String nom, int nb, Employes chef) {
		this.idP = id;
		this.nomP = nom;
		this.nbheureP = nb;
		this.chefDeProjet = chef;
	}
	public String getNom() {
		return this.nomP;
	}
	public int getId() {
		return this.idP;
	}
	public String toString() {
		return "Projet: "+this.nomP+" Nombre d'heure: "+this.nbheureP+" Chef: "+this.chefDeProjet.toString();
	} 
	
	
	
}
