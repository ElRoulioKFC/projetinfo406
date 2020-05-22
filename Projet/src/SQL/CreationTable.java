package SQL;
import java.sql.*;


public class CreationTable {

	protected static Connection con;
	protected static ResultSet res;

	public static Connection getCon(){
		return con;
	}
	
	public ResultSet getRes(){
		return res;
	}
	
	
	public static void messageErreur(String message) {
	      System.err.println(message);
	      System.exit(99);
	   }
	
	
	public static void connection(){
		System.out.println("connection pilote");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			messageErreur(" pb pilote");
		}
		System.out.println("connection bdd");
		try {
			String URLdb = "jdbc:mysql://localhost:3306/l2_gr_3";
	       con = DriverManager.getConnection(URLdb,"l2_gr_3","CTICFcIA");
	   } catch (SQLException e) {
	       messageErreur("pb connection bdd");
	   }

	}
	public static void creation() throws SQLException{

		
		String sql = "CREATE TABLE IF NOT EXISTS Employe(idEmploye  INT PRIMARY KEY AUTO_INCREMENT,"
				+ "nomEmp VARCHAR (40) NOT NULL ,"
				+ "prenomEmp VARCHAR (20) NOT NULL,"
				+ "nbHeuresSemEmp INT (10) ,"
				+ "nbHeureActEmp INT (10),"
				+ "metier VARCHAR(40) NOT NULL,"
				+ "mailEmp VARCHAR(50) NOT NULL,"
				+ "pseudoEmp VARCHAR(45) NOT NULL ,"
				+ "mdpEmp VARCHAR(45) NOT NULL,"
				+ "roleEmp VARCHAR(20) NOT NULL,"
				+ "salaireEmp INT," + 
				"CONSTRAINT uq_Employe_mailEmp UNIQUE(mailEmp)," + 
				"CONSTRAINT uq_Employe_pseudoEmp UNIQUE(pseudoEmp)" + 
				");";
		try{
			 connection();
			 
			 Statement stmt = getCon().createStatement();
			 
			 stmt.executeUpdate(sql);
			 System.out.println("Table Employe faite");
			 
			 sql = "CREATE TABLE IF NOT EXISTS Salle(" + 
			 		" idSalle INT PRIMARY KEY AUTO_INCREMENT," + 
			 		" typeSalle VARCHAR(20) NOT NULL," + 
			 		" capaciteSalle INT ," + 
			 		" nomSalle VARCHAR(45) NOT NULL, " + 
			 		" CONSTRAINT uq_salle_nomSalle UNIQUE(nomSalle)" + 
			 		" );" + 
			 		" ";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Salle faite");
			 
			 sql = " CREATE TABLE IF NOT EXISTS Materiel(" + 
			 		" idMat INT AUTO_INCREMENT," + 
			 		" nomMat VARCHAR(30) ," + 
			 		" typeMAT VARCHAR(20)," + 
			 		" idSal INT," + 
			 		" CONSTRAINT uq_Materiel_idMat UNIQUE(idMat)," + 
			 		" CONSTRAINT Materiel PRIMARY KEY (idMat)," + 
			 		" CONSTRAINT Materiel_idSal FOREIGN KEY (idSal)" + 
			 		" REFERENCES Salle(idSalle)" + 
			 		" );" + 
			 		" ";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Materiel faite");
			 
			 sql = " CREATE TABLE IF NOT EXISTS Projet(" + 
			 		" idProjet INT PRIMARY KEY AUTO_INCREMENT," + 
			 		" nbHeureProj NUMERIC(20) NOT NULL," + 
			 		" nbHeureActProj NUMERIC(20)," + 
			 		" deadline DATETIME ," + 
			 		" nomClientProj VARCHAR(45) NOT NULL," + 
			 		" nomProjet VARCHAR(45) NOT NULL," + 
			 		" idChef INT," + 
			 		" CONSTRAINT uq_Projet_nomProjet UNIQUE(nomProjet)," + 
			 		" CONSTRAINT fk_Projet_idChef FOREIGN KEY(idChef) " + 
			 		" REFERENCES Employe(idEmploye)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Projet faite");
			 
			 sql = "CREATE TABLE IF NOT EXISTS Competence  (" + 
			 		" idComp INT AUTO_INCREMENT," + 
			 		" nomComp VARCHAR (45) NOT NULL," + 
			 		" typeComp VARCHAR (45) NOT NULL," + 
			 		" CONSTRAINT uq_Competence_idComp UNIQUE(idComp)," + 
			 		" CONSTRAINT pk_Competence PRIMARY KEY (idComp)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Competence faite");
			 
			 sql = "CREATE TABLE IF NOT EXISTS Employe_Projet(" + 
			 		" idEmploye INT," + 
			 		" idProjet INT," + 
			 		" nbHeureEmpProj INT," + 
			 		" CONSTRAINT fk_Employe_Projet_idEmploye FOREIGN KEY(idEmploye) " + 
			 		" REFERENCES Employe(idEmploye)," + 
			 		" CONSTRAINT fk_Employe_Projet_idProjet FOREIGN KEY(idProjet)" + 
			 		" REFERENCES Projet(idProjet)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Employe_Projet faite");
			 
			 sql = "CREATE TABLE IF NOT EXISTS Competence_Employe(" + 
			 		" idCompetence INT," + 
			 		" idEmp INT," + 
			 		" niveauMaitrise INT NOT NULL," + 
			 		" CONSTRAINT fk_Competence_Employe_idCompetence FOREIGN KEY(idCompetence)" + 
			 		" REFERENCES Competence(idComp)," + 
			 		" CONSTRAINT fk_Competence_Employe_idEmp FOREIGN KEY (idEmp)" + 
			 		" REFERENCES Employe(idEmploye)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Competence_Employe faite");
			 
			 sql = "CREATE TABLE IF NOT EXISTS Creneau(" + 
			 		" idCreneau INT AUTO_INCREMENT," + 
			 		" debutCreneau DATETIME NOT NULL," + 
			 		" finCreneau DATETIME NOT NULL," + 
			 		" idProj INT," + 
			 		" idSal INT," + 
			 		" confirmation INT NOT NULL," + 
			 		" CONSTRAINT pk_Creneau PRIMARY KEY(idCreneau)," + 
			 		" CONSTRAINT fk_Creneau_idProj FOREIGN KEY (idProj)" + 
			 		" REFERENCES Projet(idProjet)," + 
			 		" CONSTRAINT fk_Creneau_idSal FOREIGN KEY(idSal)" + 
			 		" REFERENCES Salle(idSalle)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Creneau faite");
			 
			 sql = "CREATE TABLE IF NOT EXISTS Employe_Creneau(" + 
			 		" idEmp INT," + 
			 		" idCren INT ," + 
			 		" CONSTRAINT fk_Employe_Creneau_idEmp FOREIGN KEY (idEmp)" + 
			 		" REFERENCES Employe(idEmploye)," + 
			 		" CONSTRAINT fk_Employe_Creneau_idCren FOREIGN KEY (idCren)" + 
			 		" REFERENCES Creneau(idCreneau)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Employe_Creneau faite");
			 
			 
			 sql = " CREATE TABLE IF NOT EXISTS Notif( " + 
			 		" idNotif INT AUTO_INCREMENT," + 
			 		" typeNotif VARCHAR(45)," + 
			 		" idCren INT," + 
			 		" etatNOTIF INT," + 
			 		" idEmp INT," + 
			 		" CONSTRAINT uq_Notif_idNotif UNIQUE(idNotif)," + 
			 		" CONSTRAINT pk_Notif PRIMARY KEY (idNotif)," + 
			 		" CONSTRAINT fk_Notif_idCren FOREIGN KEY (idCren) " + 
			 		" REFERENCES Creneau(idCreneau)," + 
			 		" CONSTRAINT fk_Notif_idEmp FOREIGN KEY (idEmp)" + 
			 		" REFERENCES Employe(idEmploye)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Notif faite");
			
			 
			 con.close();
		} catch(SQLException e){
			e.printStackTrace();
	}

}
	public static void drop() throws SQLException{
		String sql = "DROP TABLE IF EXISTS Competence_Employe";
		try{
			 connection();
			 Statement stmt = getCon().createStatement();
			 stmt.executeUpdate(sql);
			 System.out.println("drop Competence_Employe fait");
			 
			 sql = "DROP TABLE IF EXISTS Materiel";
			 stmt.executeUpdate(sql);
			 System.out.println("drop Materiel fait");
			 
			 sql = "DROP TABLE IF EXISTS Notif";
			 stmt.executeUpdate(sql);
			 System.out.println("drop Notif fait");
			 
			 sql = "DROP TABLE IF EXISTS Employe_Creneau";
			 stmt.executeUpdate(sql);
			 System.out.println("drop Employe_Creneau fait");
			 
			 sql = "DROP TABLE IF EXISTS Creneau";
			 stmt.executeUpdate(sql);
			 System.out.println("drop Creneaux fait");
			 
			 
			 sql = "DROP TABLE IF EXISTS Employe_Projet";
			 stmt.executeUpdate(sql);
			 System.out.println("drop Employe_Projet fait");

			 sql = "DROP TABLE IF EXISTS Competence";
			 stmt.executeUpdate(sql);
			 System.out.println("drop Competence fait");

			 
			 sql = "DROP TABLE IF EXISTS Salle";
			 stmt.executeUpdate(sql);
			 System.out.println("drop Salle fait");
			 
			 sql = "DROP TABLE IF EXISTS Projet";
			 stmt.executeUpdate(sql);
			 System.out.println("drop Projet fait");
			 
			 sql = "DROP TABLE IF EXISTS Employe";
			 stmt.executeUpdate(sql);
			 System.out.println("drop Employe fait");
			 
			 

			 
			 
			 con.close();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}

}