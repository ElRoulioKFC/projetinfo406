package controleur;

import javax.swing.JButton ;

import java.awt.event.ActionEvent;
import java.util.*;

public class ListeEmploye {
	private  ArrayList<Employe> listeEmployes;
	/*private int indiceEmp = 0 ;
	private Employe empcourant ;*/
	
	public ListeEmploye() {
		this.listeEmployes = new ArrayList<Employe>();
	}
	public void ajouter(Employe employes) {
		this.listeEmployes.add(employes);
	}
	public void supprimer(Employe employes) {
		this.listeEmployes.remove(employes);
	}
	public String toString() {
		String res = "";
		for(int i = 0;i<this.listeEmployes.size();i++) {
			res = res + this.listeEmployes.get(i).toString() + "\n";
		}
		return res;
	}
	
	public String[] listeNom() {
		String[] res = new String[this.taille()];
		for(int i=0; i<this.taille();i++) {
			res[i] = this.recupEmp(i).getNom();
		}
		return res;
	}
	
	public int recupLasteID() {
		if (this.taille() == 0) {
			return 0;
		}
		else {
			int i = this.taille() -1;
			return this.listeEmployes.get(i).getId();
		}

	}
	
	public int taille() {
		return this.listeEmployes.size();
	}
	
	public Employe recupEmpByNom(String nom) {
		int i = 0;
		Employe emp = new Employe();
		emp.EmpNull();
		boolean trouve = false;
		while (trouve == false && i != this.taille()) {
			if (this.listeEmployes.get(i).getNom() == nom) {
				trouve = true;
				emp = this.listeEmployes.get(i);
			}
			i++;
		}
		return emp;
	}
	public void triNom(){
		List<String> listnom = new ArrayList<String>();
		for(int i= 0; i<this.taille(); i++) {
			listnom.add(this.recupEmp(i).getNom());
		}
		Collections.sort(listnom);
		ListeEmploye res = new ListeEmploye();
		for (int i = 0 ; i<this.taille(); i++) {
			res.ajouter(this.recupEmpByNom(listnom.get(i)));
		}
		this.listeEmployes = res.listeEmployes;
	}
	
	public Employe recupEmp(int i) {
		Employe emp = new Employe();
		
		if(this.taille() > 0 && this.taille() >= i) {
			emp = this.listeEmployes.get(i);
		}
		return emp;
	}
	
	public Employe getNextEmp(int empcc) {
		Employe nextemp = this.recupEmp(empcc) ;
		if(empcc < this.taille() - 1 ) {
			empcc = empcc + 1 ;
		}
		return this.recupEmp(empcc) ;
	}
	

/*	public Employe EmpSuivant (ListeEmploye listeEmployes) {
		if( int i  < listeEmployes.taille() ) {
			return listeEmployes.recupEmp(i+1) ;
		}*/
		
		/*
		for (int i = 0 ; i < ((List<Employe>) listeEmployes).size() ; i++ ) {
			return  listeEmployes.get(i+1) ;	
		}
	}*/

	
	
	//public static void main(String[] args) {
		//Employes emp1 = new Employes(1,"Brivet","Alexis",1000, 35, "informaticiens", "alexis.brivet@onsenfou.fr");
		//Employes null1 = new Employes();
		//System.out.println(null1);
		//System.out.println(emp1.estEmpNull());
		//System.out.println(null1.estEmpNull());
		//ListeEmployes liste = new ListeEmployes();
		//liste.ajouter(emp1);
		//System.out.println(liste.recupEmpByNom("Rezader").estEmpNull());
		//liste.ajouter(new Employes(1,"Brivet","Jules",1000));
		//liste.ajouter(new Employes(1,"Real","Sandrine",4000));
		//System.out.println(liste);
		//liste.supprimer(emp1);
		//System.out.println(liste);
	//}

}
