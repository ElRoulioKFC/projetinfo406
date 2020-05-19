package controleur;

import java.awt.event.ActionListener;

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
	public Employes(int id, String nom, String prenom, int salaire, double nb_heure,String metier, String mail) {
		this.idE = id;
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
	

}
