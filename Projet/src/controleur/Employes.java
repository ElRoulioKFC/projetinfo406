package controleur;


public class Employes {
	private int idE;
	private Employes idSup;
	private String nomE;
	private String prenomE;
	private int salaireE;
	private double nb_heur_sem;
	private double nb_heur_act;
	private String metier;
	private String mail;
	Employes empnull = new Employes(-1,"","",0,0,"","");
	public Employes(int id, String nom, String prenom, int salaire, double nb_heure,String metier, String mail) {
		this.idE = id;
		this.idSup = null;
		this.nomE = nom;
		this.prenomE = prenom;
		this.salaireE = salaire;
		this.nb_heur_sem =nb_heure;
		this.nb_heur_act = 0;
		this.metier = metier;
		this.mail = mail;
	}
	public Employes(String nom, String prenom ,String metier, String mail, double nb_heure ,int salaire) {
		this.idSup = null;
		this.nomE = nom;
		this.prenomE = prenom;
		this.salaireE = salaire;
		this.nb_heur_sem =nb_heure;
		this.nb_heur_act = 0;
		this.metier = metier;
		this.mail = mail;
	}
	public Employes(int id, String nom, String prenom, int salaire, double nb_heure,String metier, String mail,Employes sup) {
		this.idE = id;
		this.nomE = nom;
		this.prenomE = prenom;
		this.salaireE = salaire;
		this.nb_heur_sem =nb_heure;
		this.nb_heur_act = 0;
		this.metier = metier;
		this.mail = mail;
		this.idSup = sup;
	}
	public String getNom() {
		return this.nomE;
	}
	public void setId(int id) {
		this.idE = id ;
	}
	public void setIdSup(Employes id) {
		this.idSup = id;
	}
	public String getPrenom() {
		return this.prenomE;
	}
	public String toString() {
		return "Nom: "+this.nomE+" Prenom: "+this.prenomE;
	}
	// Travaille est une méthode qui permet de retirer les heures qu'un employé a travailler de ce qui lui reste pour la semaine
	public void travaille(double heure) {
		this.nb_heur_sem = this.nb_heur_sem - heure;
		
	}
	public int getId() {
		return this.idE;
	}
	
	public Employes() {
		this.idE = -1;
		this.idSup = null;
		this.nomE = "";
		this.prenomE = "";
		this.salaireE = 0;
		this.nb_heur_sem = 0;
		this.nb_heur_act = 0;
		this.metier = "";
		this.mail = "";
	}
	public boolean estEmpNull() {
		return (this == empnull);
	}

}
