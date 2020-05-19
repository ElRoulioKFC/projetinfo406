package controleur;

import java.sql.Date;

public class Projet {
	private int idP;
	private String nomP;
	private String nomClient;
	private double nbheureP;
	private double nbheure_actP;
	private Date datetime;
	private Employes chefDeProjet;
	
	public Projet(int id, String nom,String client, double nbH,Date datelimite, Employes chef) {
		this.idP = id;
		this.nomP = nom;
		this.nomClient = client;
		this.nbheure_actP = 0;
		this.nbheureP = nbH;
		this.datetime = datelimite;
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
