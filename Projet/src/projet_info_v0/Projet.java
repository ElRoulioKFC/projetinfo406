package projet_info_v0;

import java.util.ArrayList;

public class Projet {
	
	private int num_proj;
	private String nom_proj;
	private Employee chef_de_projet;
	protected ArrayList<Ressource> ressources;
	
	
	
	public Projet(int i, String string) {
		this.num_proj=i;
		this.nom_proj=string;
	}
	/**
	 * @return the num_proj
	 */
	public int getNum_proj() {
		return num_proj;
	}
	/**
	 * @param num_proj the num_proj to set
	 */
	public void setNum_proj(int num_proj) {
		this.num_proj = num_proj;
	}
	/**
	 * @return the nom_proj
	 */
	public String getNom_proj() {
		return nom_proj;
	}
	/**
	 * @param nom_proj the nom_proj to set
	 */
	public void setNom_proj(String nom_proj) {
		this.nom_proj = nom_proj;
	}
	/**
	 * @return the chef_de_projet
	 */
	public Employee getChef_de_projet() {
		return chef_de_projet;
	}
	/**
	 * @param chef_de_projet the chef_de_projet to set
	 */
	public void setChef_de_projet(Employee chef_de_projet) {
		this.chef_de_projet = chef_de_projet;
	}
	/**
	 * @return the ressources
	 */
	
	
	
	public String toString() {
		return this.nom_proj;
	}
	
}
