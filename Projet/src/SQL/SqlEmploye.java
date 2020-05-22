package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SqlEmploye extends CreationTable{

	
	
	
	
	public static void insertion(String nom, String prenom, String role, String motDePasse, ArrayList<String> tag, ArrayList<Integer> niveau) throws SQLException{
		String sql = "INSERT INTO Employe(nomEmp, nom, prenom, role, motDePasse) VALUE('" + nom + "' ,  '"+prenom+"' , '"+role+"' , '"+motDePasse+"');";
		try{
			 Statement stmt = getCon().createStatement();
			 stmt.executeUpdate(sql);
			 System.out.println("insertion fait");
		} catch(SQLException e){
			e.printStackTrace();
		}
		String sql2 = "SELECT * FROM Personne ORDER BY numSalarie DESC;";
		try{
			 Statement stmt2 = getCon().createStatement();
			 try (ResultSet res2 = stmt2.executeQuery(sql2)){
				 res2.next();
				 for (int i=0; i<tag.size(); i++){
					 System.out.println(res2.getInt("numSalarie") + " " + tag.get(i) + " " + niveau.get(i));
					 JavaSQLCompetence.insertion(res2.getInt("numSalarie"),tag.get(i), niveau.get(i));
				 }
			 }
		} catch(SQLException e){
			e.printStackTrace();
		}
}
}
