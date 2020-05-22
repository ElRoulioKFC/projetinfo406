package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
}
