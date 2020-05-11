package controleur;

public class Employes {
	private int idE;
	private String nomE;
	private String prenomE;
	private String metierE;
	private String mailE;
	private int salaireE;
	private double nb_heure_semE;
	private double nb_heure_actE;
	public Employes(int id, String nom, String prenom, String metier,String mail, int salaire, double nb_heure_sem) {
		this.idE = id;
		this.nomE = nom;
		this.prenomE = prenom;
		this.metierE = metier;
		this.salaireE = salaire;
		this.nb_heure_semE = nb_heure_sem;
		this.nb_heure_actE = 0;
	}
	public Employes(int id, String nom, String prenom, String metier, int salaire) {
		this.idE = id;
		this.nomE = nom;
		this.prenomE = prenom;
		this.metierE = metier;
		this.salaireE = salaire;
		this.nb_heure_semE = 35;
		this.nb_heure_actE = 0;
	}
	public String getNom() {
		return this.nomE;
	}
	public String getPrenom() {
		return this.prenomE;
	}
	public double getHeureSem() {
		return this.nb_heure_semE;
	}
	public double getHeureAct() {
		return this.nb_heure_actE;
	}
	public String toString() {
		return "Nom: "+this.nomE+" Prenom: "+this.prenomE;
	}
	// Travaille est une méthode qui permet de retirer les heures qu'un employé a travailler de ce qui lui reste pour la semaine
	public void travaille(double heure) {
		this.nb_heure_actE = this.nb_heure_actE + heure;
		
	}

}
