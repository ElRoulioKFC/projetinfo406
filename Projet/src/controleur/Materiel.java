package controleur;

public class Materiel {
	private int idM;
	private String nomM;
	private String typeM;
	private Salle localisationM;
	
	public Materiel(int id, String nom, String type, Salle localisation) {
		this.idM = id;
		this.nomM = nom;
		this.typeM = type;
		this.localisationM = localisation;
	}
	
	public int getid() {
		return this.idM;
	}
	
	public String getType() {
		return this.typeM;
	}
	
	public Salle getLocalisation() {
		return this.localisationM;
	}
	
	public String getNom() {
		return this.nomM;
	}
	
	public void setid(int id) {
		this.idM = id;
	}
	
	public void setType(String type) {
		this.typeM = type;
	}
	
	public void setLocalisation(Salle localisation) {
		this.localisationM = localisation;
	}
	
	public void setNom(String nom) {
		this.nomM = nom;
	}
	
	public String toString() {
		return ("<html> Nom: " + this.nomM + 
				"<br> Type: " + this.typeM + 
                "<br> Salle:  " + this.localisationM.getNom() +
				" </html>");
	}
}
