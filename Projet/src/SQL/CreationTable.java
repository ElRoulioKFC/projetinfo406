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
				+ "superieurEmp INT,"
				+ "pseudoEmp VARCHAR(45) NOT NULL ,"
				+ "mdpEmp VARCHAR(45) NOT NULL,"
				+ "roleEmp VARCHAR(20) NOT NULL,"
				+ "salaireEmp NUMERIC(10)," + 
				"CONSTRAINT fk_Employe_superieurEmp FOREIGN KEY(superieurEmp) " + 
				"REFERENCES Employe(idEmploye)," + 
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
			 
			 sql = " CREATE TABLE IF NOT EXISTS materiel(" + 
			 		" idMat INT AUTO_INCREMENT," + 
			 		" nomMat VARCHAR(30) ," + 
			 		" typeMAT VARCHAR(20)," + 
			 		" idSalle NUMERIC(10)," + 
			 		" CONSTRAINT uq_materiel_idMat UNIQUE(idMat)," + 
			 		" CONSTRAINT materiel PRIMARY KEY (idMat)," + 
			 		" CONSTRAINT materiel_idSalle FOREIGN KEY (idSalle)" + 
			 		" REFERENCES salle(idSalle)" + 
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
			 		" CONSTRAINT uq_projet_idProjet UNIQUE(nomProjet)," + 
			 		" CONSTRAINT uq_projet_nomProjet UNIQUE(nomProjet)," + 
			 		" CONSTRAINT fk_projet_idChef FOREIGN KEY(idChef) " + 
			 		" REFERENCES Employe(idEmploye)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Projet faite");
			 
			 sql = "CREATE TABLE IF NOT EXISTS Employe_Projet(" + 
			 		" idEmploye NUMERIC(10) NOT NULL," + 
			 		" idProjet NUMERIC (10) NOT NULL," + 
			 		" nbHeureEmpProj (20)," + 
			 		" CONSTRAINT pk_Employe_projet PRIMARY KEY (idEmploye)," + 
			 		" CONSTRAINT pk_Employe_projet PRIMARY KEY (idProjet)," + 
			 		" CONSTRAINT fk_Employe_projet_idEmploye (idEmploye) " + 
			 		" REFERENCES Employe(idEmploye)," + 
			 		" CONSTRAINT fk_Employe_projet_idProjet (idProjet)" + 
			 		" REFERENCES projet(idProjet)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Employe_Projet faite");
			 
			 sql = "CREATE TABLE IF NOT EXISTS Competence_Employe(" + 
			 		" idComp NUMERIC(10) NOT NULL," + 
			 		" idEmploye NUMERIC(10) NOT NULL," + 
			 		" niveauMaitrise CHAR NOT NULL," + 
			 		" CONSTRAINT pk_competence_Employe PRIMARY KEY (idEmploye)," + 
			 		" CONSTRAINT pk_competenec_Employe PRIMARY KEY(idComp)," + 
			 		" CONSTRAINT fk_competence_Employe_idEmploye FOREIGN KEY (idEmploye)" + 
			 		" REFERENCES Employe(idEmploye)," + 
			 		" CONSTRAINT fk_competence_Employe_idComp FOREIGN KEY(idComp)" + 
			 		" REFERENCES competence(idComp)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Competence_Employe faite");
			 
			 sql = "CREATE TABLE IF NOT EXISTS Creneau(" + 
			 		" idCreneau INT AUTO_INCREMENT," + 
			 		" debutCreneau DATETIME NOT NULL," + 
			 		" finCreneau DATETIME NOT NULL," + 
			 		" idProjet NUMERIC (10)," + 
			 		" idSalle NUMERIC(10)," + 
			 		" confirmation CHAR NOT NULL," + 
			 		" CONSTRAINT uq_creneau_idCreneau UNIQUE(idCreneau)," + 
			 		" CONSTRAINT pk_creneau PRIMARY KEY(idCreneau)," + 
			 		" CONSTRAINT fk_creneau_idProjet FOREIGN KEY (idProjet)" + 
			 		" REFERENCES projet(idProjet)," + 
			 		" CONSTRAINT fk_creneau_idSalle FOREIGN KEY(idSalle)" + 
			 		" REFERENCES salle(idSalle)" + 
			 		" );" + 
			 		" ";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Creneau faite");
			 
			 sql = "CREATE TABLE IF NOT EXISTS Employe_Creneau(" + 
			 		" idEmploye NUMERIC(10) NOT NULL," + 
			 		" idCreneau NUMERIC(10) NOT NULL," + 
			 		" CONSTRAINT pk_Employe_creneau PRIMARY KEY(idEmploye)," + 
			 		" CONSTRAINT pk_Employe_creneau PRIMARY KEY(idCreneay)," + 
			 		" CONSTRAINT fk_Employe_creneau_idEmploye FOREIGN KEY (idEmploye)" + 
			 		" REFERENCES Employe(idEmploye)," + 
			 		" CONSTRAINT fk_Employe_creneau_idCreneau FOREIGN KEY (idCreneau)" + 
			 		" REFERENCES creneau(idCreneau)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Employe_Creneau faite");
			 
			 
			 sql = " CREATE TABLE IF NOT EXISTS Notif( " + 
			 		" idNotif INT AUTO_INCREMENT," + 
			 		" typeNotif VARCHAR(45)," + 
			 		" idCreneau NUMERIC(10)," + 
			 		" etatNOTIF CHAR," + 
			 		" idEmploye NUMERIC(10)," + 
			 		" CONSTRAINT uq_notif_idNotif UNIQUE(idNotif)," + 
			 		" CONSTRAINT pk_notif PRIMARY KEY (idNotif)," + 
			 		" CONSTRAINT fk_notif_idCreneau FOREIGN KEY (idCreneau) " + 
			 		" REFERENCES creneau(idCreneau)," + 
			 		" CONSTRAINT fk_notif_idEmploye FOREIGN KEY (idEmploye)" + 
			 		" REFERENCES Employe(idEmploye)" + 
			 		" );";
			 stmt.executeUpdate(sql);
			 System.out.println("Table Notif faite");
			
			 
			 con.close();
		} catch(SQLException e){
			e.printStackTrace();
	}

}


}