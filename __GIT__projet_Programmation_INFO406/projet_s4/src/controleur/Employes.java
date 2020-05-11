package controleur;

public class Employes {
	private int idE;
	private String nomE;
	private String prenomE;
	private int salaireE;
	private double nb_heureE;
	public Employes(int id, String nom, String prenom, int salaire, double nb_heure) {
		this.idE = id;
		this.nomE = nom;
		this.prenomE = prenom;
		this.salaireE = salaire;
		this.nb_heureE =nb_heure;
	}
	public Employes(int id, String nom, String prenom, int salaire) {
		this.idE = id;
		this.nomE = nom;
		this.prenomE = prenom;
		this.salaireE = salaire;
		this.nb_heureE = 35;
	}
	public String getNom() {
		return this.nomE;
	}
	public String getPrenom() {
		return this.prenomE;
	}
	public String toString() {
		return "Nom: "+this.nomE+" Prenom: "+this.prenomE;
	}
	// Travaille est une méthode qui permet de retirer les heures qu'un employé a travailler de ce qui lui reste pour la semaine
	public void travaille(double heure) {
		this.nb_heureE = this.nb_heureE - heure;
		
	}

}
