package edt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.mysql.jdbc.*;

public class PanelEDT{
	
	final static int HAUTEUR = 700;
	final static int LARGEUR = 1200;
	
	private Date date = new Date();
	private CalendrierCanvas cc= new CalendrierCanvas(date);
	
	public JPanel PanelEDT() {
		ajout("Daniel");
		recherche();
		JPanel EDT=new JPanel();
		EDT.setLayout(new BorderLayout());
		JButton mois_suivant=new JButton(">");
		EDT.add(mois_suivant,BorderLayout.EAST);
		
		JButton projet =new JButton ("Projet");
		JButton employe = new JButton ("Employe");
		JButton Salle = new JButton ("Salle");
		
		EDT.add(projet,BorderLayout.NORTH);
		EDT.add(employe,BorderLayout.NORTH);
		EDT.add(Salle,BorderLayout.NORTH);
		JButton mois_precedent=new JButton("<");
		EDT.add(mois_precedent,BorderLayout.WEST);
		
		mois_suivant.addActionListener(new Changer_mois_sup(date, cc));
		mois_precedent.addActionListener(new Changer_mois_prec(date,cc));
		
		
		
		
		EDT.add(cc ,BorderLayout.CENTER);
		
		
		return EDT;
	}

	private void ajout(String string) {

		String url = "jdbc:mysql://localhost:3306/l2_gr_3";
		String login = "l2_gr_3";
		String passwd ="CTICFcIA";
		java.sql.Connection cn = null;
		java.sql.Statement st = null;
		java.sql.ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url,login,passwd);
			st = cn.createStatement();
			String sql ="INSERT INTO `employe`(`idEmploye`,`nomEmp`,`prenomEmp`,`nbHeuresMoisEmp`,`nbHeureActEmp`,`metier`,`mailEmp`,`supperieurEmp`,`pseudoEmp`,`mdpEmp`,`roleEmp`,`salaireEmp`) VALUES ('5','"+ string +"','jean','35','32','metier','mail','null','jeand','1234','ninja','1234')" ;
			st.executeUpdate(sql);
			rs=st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("personne"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("erreur sql");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		}	
	

	private void recherche() {
		
		String url = "jdbc:mysql://localhost:3306/l2_gr_3";
		String login = "l2_gr_3";
		String passwd ="CTICFcIA";
		java.sql.Connection cn = null;
		java.sql.Statement st = null;
		java.sql.ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url,login,passwd);
			st = cn.createStatement();
			String sql ="SELECT `nom` INTO `nombdd`(`employe`VAL";
			st.executeUpdate(sql);
			rs=st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("personne"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	
	
////	public static class LancerFenetre {
//		//public static void main(String[] args) {
//			new FrameEDT();
//		}
//	}


}
