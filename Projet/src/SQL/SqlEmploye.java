package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Employe;
import controleur.ListeEmploye;

public class SqlEmploye extends CreationTable{

	
	
	
	
	public static void insertion(String nom, String prenom,int nbHeuresSemEmp,int nbHeureActEmp, String metier, String mailEmp,  String pseudoEmp, String mdpEmp, String roleEmp, int salaireEmp  ) throws SQLException{
		String sql = "INSERT INTO Employe(nomEmp, prenomEmp,nbHeuresSemEmp,nbHeureActEmp,metier, mailEmp, pseudoEmp, mdpEmp, roleEmp, salaireEmp ) VALUE('" + nom + "' ,  '"+prenom+"' , '"+nbHeuresSemEmp + "' , '" + nbHeureActEmp+"' , '"+ metier  +"' , '"+ mailEmp  + "' , '" + pseudoEmp + "' , '" + mdpEmp + "' , '" + roleEmp + "' , '" + salaireEmp + "';";
		try{
			 Statement stmt = getCon().createStatement();
			 stmt.executeUpdate(sql);
			 System.out.println("insertion fait");
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void supprime(int idEmploye) throws SQLException{
		try{// a rajouter les autres suppression car clef etrangere
			 Statement stmt = getCon().createStatement();
			 String sql = "DELETE FROM ParticipeSalarie WHERE numSalarie ="+ idEmploye;
			 stmt.executeUpdate(sql);
			 
			 sql = "DELETE FROM Employe_Projet WHERE numSalarie ="+ idEmploye;
			 stmt.executeUpdate(sql);
			
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static ListeEmploye recupere() throws SQLException{
		
		Employe empCour = null;
		ListeEmploye liste = new ListeEmploye();
		String sql = " SELECT * FROM Employe ;";
		try{
			Statement stmt = getCon().createStatement();
			try (ResultSet res = stmt.executeQuery(sql)){
				 while(res.next()) {
					empCour = new Employe(res.getInt("idEmp"),res.getString("prenomEmp"),res.getString("nomEmp"),res.getInt("salaireEmp"),res.getInt("nbHeuresSemEmp") ,res.getString("metier"),res.getString("mailEmp")) ;
					liste.ajouter(empCour);
				 }
			}			 
		} catch(SQLException e){
			e.printStackTrace();
		}
				return liste;

	}
	
}

