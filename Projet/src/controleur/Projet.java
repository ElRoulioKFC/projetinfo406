package controleur;

import java.sql.Date;

public class Projet {
	private int idP;
	private String nomP;
	private String nomClient;
	private double nbheureP;
	private double nbheure_actP;
	private Date datetime;
	private Employe chefDeProjet;
	
	public Projet(int id, String nom,String client, double nbH,Date datelimite, Employe chef) {
		this.idP = id;
		this.nomP = nom;
		this.nomClient = client;
		this.nbheure_actP = 0;
		this.nbheureP = nbH;
		this.datetime = datelimite;
		this.chefDeProjet = chef;
	}
	public Projet(String nom,String client, double nbH,Date datelimite, Employe chef) {
		this.nomP = nom;
		this.nomClient = client;
		this.nbheure_actP = 0;
		this.nbheureP = nbH;
		this.datetime = datelimite;
		this.chefDeProjet = chef;
	}
	public void setId(int id) {
		this.idP = id;
	}
	public String getNom() {
		return this.nomP;
	}
	public int getId() {
		return this.idP;
	}
	public String toString() {
		return "<html> Nom: " + this.nomP + 
				"<br> Client: " + this.nomClient +
				"<br> Nombre d'heure éstimer: " + this.nbheureP +
				"<br> Nombre d'heure accomplis: " + this.nbheure_actP +
				"<br> Date Limite: " + this.datetime.toString() +
				"<br> Chef de Projet" + this.chefDeProjet.getNom() + "</html>";
	} 
	
	
	
}
