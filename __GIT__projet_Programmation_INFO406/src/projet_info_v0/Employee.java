package projet_info_v0;

public class Employee /**extends Ressource**/{
	
	private int num_emp;
	private String nom_emp;
	private String prenom_emp;
	
	
	
	public Employee(int num, String nom, String prenom) {
		this.num_emp=num;
		this.nom_emp=nom;
		this.prenom_emp=prenom;
	}
	
	
	
	/**
	 * @return the num_emp
	 */
	public int getNum_emp() {
		return num_emp;
	}
	/**
	 * @param num_emp the num_emp to set
	 */
	public void setNum_emp(int num_emp) {
		this.num_emp = num_emp;
	}
	/**
	 * @return the nom_emp
	 */
	public String getNom_emp() {
		return nom_emp;
	}
	/**
	 * @param nom_emp the nom_emp to set
	 */
	public void setNom_emp(String nom_emp) {
		this.nom_emp = nom_emp;
	}
	/**
	 * @return the prenom_emp
	 */
	public String getPrenom_emp() {
		return prenom_emp;
	}
	/**
	 * @param prenom_emp the prenom_emp to set
	 */
	public void setPrenom_emp(String prenom_emp) {
		this.prenom_emp = prenom_emp;
	}
	
	public String toString() {
		return this.prenom_emp+" "+this.nom_emp;
	}
	
	
}
