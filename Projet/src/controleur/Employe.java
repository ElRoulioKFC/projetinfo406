package controleur;


public class Employe {
	private int idE;
	private Employe idSup;
	private String nomE;
	private String prenomE;
	private int salaireE;
	private double nb_heur_sem;
	private double nb_heur_act;
	private String metier;
	private String mail;
	public Employe(int id, String nom, String prenom, int salaire, double nb_heure,String metier, String mail) {
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
	public Employe(String nom, String prenom ,String metier, String mail, double nb_heure ,int salaire) {
		this.idSup = null;
		this.nomE = nom;
		this.prenomE = prenom;
		this.salaireE = salaire;
		this.nb_heur_sem =nb_heure;
		this.nb_heur_act = 0;
		this.metier = metier;
		this.mail = mail;
	}
	public Employe(int id, String nom, String prenom, int salaire, double nb_heure,String metier, String mail,Employe sup) {
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
	public Employe() {

	}
	public String bouton() {
		return this.getNom() + " " + this.getPrenom();
	}
	public void EmpNull(){
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
	public String getNom() {
		return this.nomE;
	}
	public double getNbHAct() {
		return this.nb_heur_act;
	}
	public void setId(int id) {
		this.idE = id ;
	}
	public Employe getSuperieur(){
		return this.idSup;
	}
	public void setIdSup(Employe id) {
		this.idSup = id;
	}
	public String getPrenom() {
		return this.prenomE;
	}
	public int getSalaire() {
		return this.salaireE ;
	}
	public double getNbheure() {
		return this.nb_heur_sem ;
	}
	public String getMetier() {
		return this.metier ;
	}
	public String getMail() {
		return this.mail ;
	}
	
	public String toString() {
		return ("<html> Nom: " + this.nomE + "<br> Prenom: " + this.prenomE + 
				                             "<br> Salaire: " + this.salaireE + " Euros" +
				                             "<br> Nombre d'heures par semaine: " + this.nb_heur_sem + " Heures" +
				                             "<br> Métier: " + this.metier +
				                             "<br> Adresse mail: " + this.mail +
				" </html>") ;
				
				/* + "\nSalaire: " + this.salaireE+
				"\nNombre d'heures par semaine: "+this.nb_heur_sem + "\nMétier: "+ this.metier+
				"\nAdresse mail: "+ this.mail ;*/
	}
	
	// Travaille est une méthode qui permet de retirer les heures qu'un employé a travailler de ce qui lui reste pour la semaine
	public void travaille(double heure) {
		this.nb_heur_sem = this.nb_heur_sem - heure;
		
	}

	public int getId() {
		return this.idE;
	}
	
	public boolean estEmpNull() {
		return (this.idE == -1);
	}
}