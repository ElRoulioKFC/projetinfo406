package frameGestion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import controleur.*;
import framePrincipale.FramePrincipale;

public class FrameGestionEmploye extends JFrame {
	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	
	private ListeEmploye le = new ListeEmploye() ;
	private CanvasEmploye canvas = new CanvasEmploye() ; 
	int i = 0 ;
	/*private ImageIcon monimage ;*/
	
	Employe employe1 = new Employe(1,"Massag","Paule Cadrelle",7000,40,"Data Scientist","massagcadrelle@gmail.com" ) ; 
	Employe employe2 = new Employe(2,"Brivet","Alexis",5000,45,"Data Ingeneer","alexisbrivet@gmail.com") ;
	Employe employe3 = new Employe(3,"Geyer","Jules",5000,45,"Data Analyst","geyerjules@gmail.com") ;
	Employe employe4 = new Employe(4,"El ouali","Ines",5000,45,"Developpeur web","elouali@gmail.com") ;
	Employe employe5 = new Employe(5,"Signorina","Bianca",5000,45,"Data Ingeneer","signorinabianca@gmail.com") ;
	Employe employe6 = new Employe(6,"Maulet","Morgane",8000,45,"Prof de maths","mauletmorgane@gmail.com") ;
	Employe employe7 = new Employe(7,"Kenny","Davila",5000,45,"Data Ingeneer","geyerjules@gmail.com") ;
	Employe employe8 = new Employe(8,"Plassass","Alexia",8000,45,"Data Scientist","alexiaplassass@gmail.com") ;
	Employe employe9 = new Employe(9,"Kemegni","Clarisse",7850,40,"Data Scientist","clarisse@gmail.com" ) ; 
	Employe employe10 = new Employe(10,"Megno","Irène",5000,45,"Comptable","ivikemson@gmail.com") ;
	Employe employe11 = new Employe(11,"Toya","Steve Frank",5000,45,"Data Ingeneer","toyasteve@gmail.com") ;
	Employe employe12 = new Employe(12,"Tchoule","vadaise",5000,45,"Developpeur web","vadaise@gmail.com") ;
	Employe employe13 = new Employe(13,"Makussu","Elisabete",5000,45,"Fiscaliste","elisabetemakussu@gmail.com") ;
	Employe employe14 =  new Employe(14,"Biwele","Dorette",8000,45,"Chef de projet web technique","dorette@gmail.com") ;
	Employe employe15 = new Employe(15,"Ouakam","scarlène",5000,45,"Data Ingeneer","scarlène@gmail.com") ;
	Employe employe16 = new Employe(16,"Nde","Darielle",8000,45,"Ingenieur Mécatronicienne","ndedarielle@gmail.com") ;
	
	JPanel gauche = new JPanel(new BorderLayout());
	JPanel bas = new JPanel(new GridLayout(1,2));
	
	JButton plushaut = new JButton ("UP") ;
	JButton plusbas = new JButton("DOWN") ;
	
	/*JPanel hautdroite = new JPanel(new BorderLayout()) ;
	JPanel basdroite = new JPanel(new BorderLayout()) ;*/
	
	JPanel centredroite = new JPanel(new BorderLayout()) ;
	
	
	
/*	JButton bouton1 = new JButton(employe1.getNom() + " " + employe1.getPrenom()) ;
	JButton bouton2 = new JButton(employe2.getNom() + " " + employe2.getPrenom()) ;
	JButton bouton3 = new JButton(employe3.getNom() + " " + employe3.getPrenom()) ;
	JButton bouton4 = new JButton(employe4.getNom() + " " + employe4.getPrenom()) ;
	JButton bouton5 = new JButton(employe5.getNom() + " " + employe5.getPrenom()) ;
	JButton bouton6 = new JButton(employe6.getNom() + " " + employe6.getPrenom()) ;
	JButton bouton7 = new JButton(employe7.getNom() + " " + employe7.getPrenom()) ;
	JButton bouton8 = new JButton(employe8.getNom() + " " + employe8.getPrenom()) ;

	JButton bouton9 = new JButton(employe9.getNom() + " " + employe9.getPrenom()) ;
	JButton bouton10 = new JButton(employe10.getNom() + " " + employe10.getPrenom()) ;
	JButton bouton11 = new JButton(employe11.getNom() + " " + employe11.getPrenom()) ;
	JButton bouton12 = new JButton(employe12.getNom() + " " + employe12.getPrenom()) ;
	JButton bouton13 = new JButton(employe13.getNom() + " " + employe13.getPrenom()) ;
	JButton bouton14 = new JButton(employe14.getNom() + " " + employe14.getPrenom()) ;
	JButton bouton15 = new JButton(employe15.getNom() + " " + employe15.getPrenom()) ;
	JButton bouton16 = new JButton(employe16.getNom() + " " + employe16.getPrenom()) ; */

	
   
	public FrameGestionEmploye() {
		
	/*	monimage = new ImageIcon("/Téléchargements/"+"background.jpg") ;
		this.add(monimage) ; */
		
	    le.ajouter(employe1) ;
	    le.ajouter(employe2) ;
	    le.ajouter(employe3) ;
	    le.ajouter(employe4) ;
	    le.ajouter(employe5) ;
	    le.ajouter(employe6) ;
	    le.ajouter(employe7) ;
	    le.ajouter(employe8) ;

	    le.ajouter(employe9) ;
	    le.ajouter(employe10) ;
	    le.ajouter(employe11) ;
	    le.ajouter(employe12) ;
	    le.ajouter(employe13) ;
	    le.ajouter(employe14) ;
	    le.ajouter(employe15) ;
	    le.ajouter(employe16) ;
	    
	    JButton bouton1 = new JButton(le.recupEmp(i+0).bouton()) ;
		JButton bouton2 = new JButton(le.recupEmp(i+1).bouton()) ;
		JButton bouton3 = new JButton(le.recupEmp(i+2).bouton()) ;
		JButton bouton4 = new JButton(le.recupEmp(i+3).bouton()) ;
		JButton bouton5 = new JButton(le.recupEmp(i+4).bouton()) ;
		JButton bouton6 = new JButton(le.recupEmp(i+5).bouton()) ;
		JButton bouton7 = new JButton(le.recupEmp(i+6).bouton()) ;
		JButton bouton8 = new JButton(le.recupEmp(i+7).bouton()) ;
		
		
	    
	    centredroite.setLayout(null);
		this.setTitle("Gestion des Employes");
		this.setSize(LARGEUR,HAUTEUR);
		JButton ajouter = new JButton("Ajouter un Employé");
		JButton supprimer = new JButton("Supprimer un Employé");
		ajouter.addActionListener(new FraAjEmployeListener());
		bas.add(ajouter);
		bas.add(supprimer);
		this.add(gauche,BorderLayout.WEST);
		gauche.add(bas,BorderLayout.SOUTH);
		
		/*hautdroite.add(plushaut , BorderLayout.EAST) ;
		basdroite.add(plusbas , BorderLayout.EAST) ;*/
	
		/*this.add(hautdroite , BorderLayout.NORTH) ;
		this.add(basdroite , BorderLayout.SOUTH) ;*/
		
		bouton1.setBounds(330,70,180,30);
		bouton2.setBounds(330,120,180,30);
		bouton3.setBounds(330,170,180,30);
		bouton4.setBounds(330,220,180,30);
		bouton5.setBounds(330,270,180,30);
		bouton6.setBounds(330,320,180,30);
		bouton7.setBounds(330,370,180,30);
		bouton8.setBounds(330,420,180,30);
		
		centredroite.add(bouton1) ;
		centredroite.add(bouton2) ;
		centredroite.add(bouton3) ;
		centredroite.add(bouton4) ;
		centredroite.add(bouton5) ;
		centredroite.add(bouton6) ;
		centredroite.add(bouton7) ;
		centredroite.add(bouton8) ;
		
		centredroite.add(plushaut) ;
		plushaut.setBounds(400, 20, 50, 30);
		centredroite.add(plusbas) ;
		plusbas.setBounds(390 , 470 , 80 , 30);
		
		canvas.setBounds(0,0,1000,600);
		centredroite.add(canvas) ;
		
		this.add(centredroite , BorderLayout.CENTER) ;
	   
	   JLabel label = new JLabel() ;
	 
	   gauche.add(label , BorderLayout.CENTER) ;
	   this.add(gauche , BorderLayout.WEST) ; 
	   bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton1.getText() ;
				label.setText((le.recupEmp(i+0).toString()) );
				
			}
		});
	   
	   bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton2.getText() ;
				label.setText((le.recupEmp(i+1).toString() ));
				
			}
		});
	   bouton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton3.getText() ;
				label.setText((le.recupEmp(i+2).toString() ));
				
			}
		});
	   bouton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton4.getText() ;
				label.setText((le.recupEmp(i+3).toString() ));
				
			}
		});
	   bouton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton5.getText() ;
				label.setText((le.recupEmp(i+4).toString() ));
				
			}
		});
	   bouton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton6.getText() ;
				label.setText((le.recupEmp(i+5).toString()) );
				
			}
		});
	   bouton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton7.getText() ;
				label.setText((le.recupEmp(i+6).toString()) );
				
			}
		});
	   bouton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton8.getText() ;
				label.setText((le.recupEmp(i+7).toString() ));
				
			}
		});
	   
	  
	  plusbas.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  if (i < le.taille() - 8 ){
				  i = i + 1  ;
			  }
			  else {
				  i = i ;
			  }
			 
			    bouton1.setText(le.recupEmp(i+0).bouton());
				bouton2.setText(le.recupEmp(i+1).bouton());
				bouton3.setText(le.recupEmp(i+2).bouton());
				bouton4.setText(le.recupEmp(i+3).bouton());
				bouton5.setText(le.recupEmp(i+4).bouton());
				bouton6.setText(le.recupEmp(i+5).bouton());
				bouton7.setText(le.recupEmp(i+6).bouton());
				bouton8.setText(le.recupEmp(i+7).bouton());
				
			  revalidate() ;
		  }
	  }) ;
	  
	  plushaut.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  if (i > 0 ){
				  i = i - 1  ;
			  }
			  else {
				  i = i ;
			  }
			 
			    bouton1.setText(le.recupEmp(i+0).bouton());
				bouton2.setText(le.recupEmp(i+1).bouton());
				bouton3.setText(le.recupEmp(i+2).bouton());
				bouton4.setText(le.recupEmp(i+3).bouton());
				bouton5.setText(le.recupEmp(i+4).bouton());
				bouton6.setText(le.recupEmp(i+5).bouton());
				bouton7.setText(le.recupEmp(i+6).bouton());
				bouton8.setText(le.recupEmp(i+7).bouton());
				
			  revalidate() ;
		  }
	  }) ;
	  
	    this.setVisible(true) ;
		
	}
	
	protected Object getNextEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main (String[]args) {
		new FrameGestionEmploye() ;
	}
	
}
