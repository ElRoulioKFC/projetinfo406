package controleur;

public class Salle {
	private int idS;
	private String typeSalleS;
	private int capaciteS;
	private String nomS;
	
	public Salle(int id, String type, int capacite, String nom ) {
		this.idS = id;
		this.typeSalleS = type;
		this.capaciteS = capacite;
		this.nomS = nom;
	}
	public Salle(String type, int capacite, String nom ) {
		this.typeSalleS = type;
		this.capaciteS = capacite;
		this.nomS = nom;
	}
	
	public int getid() {
		return this.idS;
	}
	
	public String getType() {
		return this.typeSalleS;
	}
	
	public int getCapacite() {
		return this.capaciteS;
	}
	
	public String getNom() {
		return this.nomS;
	}
	
	public String toString() {
		return ("<html> Nom: " + this.nomS + 
				"<br> Type: " + this.typeSalleS + 
                "<br> Capacité:  " + this.capaciteS +
				" </html>");
	}
	public void setid(int id) {
		this.idS = id;
	}
	
	public void setType(String type) {
		this.typeSalleS = type;
	}
	
	public void setCapacite(int capacite) {
		this.capaciteS = capacite;
	}
	
	public void setNom(String nom) {
		this.nomS = nom;
	}
}
