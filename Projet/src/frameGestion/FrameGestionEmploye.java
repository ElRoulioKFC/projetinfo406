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
	/*private ImageIcon monimage ;*/
	
	Employe employe1 = new Employe(1,"Massag","Paule Cadrelle",7000,40,"Data Scientist","massagcadrelle@gmail.com" ) ; 
	Employe employe2 = new Employe(2,"Brivet","Alexis",5000,45,"Data Ingeneer","alexisbrivet@gmail.com") ;
	Employe employe3 = new Employe(3,"Geyer","Jules",5000,45,"Data Analyst","geyerjules@gmail.com") ;
	Employe employe4 = new Employe(4,"El ouali","Ines",5000,45,"Developpeur web","elouali@gmail.com") ;
	Employe employe5 = new Employe(5,"Signorina","Bianca",5000,45,"Data Ingeneer","signorinabianca@gmail.com") ;
	Employe employe6 = new Employe(6,"Maulet","Morgane",8000,45,"Prof de maths","mauletmorgane@gmail.com") ;
	Employe employe7 = new Employe(7,"Kenny","Davila",5000,45,"Data Ingeneer","geyerjules@gmail.com") ;
	Employe employe8 = new Employe(8,"Plassass","Alexia",8000,45,"Data Scientist","alexiaplassass@gmail.com") ;
	
	JPanel gauche = new JPanel(new BorderLayout());
	JPanel bas = new JPanel(new GridLayout(1,2));
	
	JButton plushaut = new JButton ("haut") ;
	JButton plusbas = new JButton("bas") ;
	
	JPanel hautdroite = new JPanel(new BorderLayout()) ;
	JPanel basdroite = new JPanel(new BorderLayout()) ;
	
	JPanel centredroite = new JPanel(new BorderLayout()) ;
	
    


	
   
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
	    
		JButton bouton1 = new JButton(le.recupEmp(0).bouton()) ;
		JButton bouton2 = new JButton(le.recupEmp(1).bouton()) ;
		JButton bouton3 = new JButton(le.recupEmp(2).bouton()) ;
		JButton bouton4 = new JButton(le.recupEmp(3).bouton()) ;
		JButton bouton5 = new JButton(le.recupEmp(4).bouton()) ;
		JButton bouton6 = new JButton(le.recupEmp(5).bouton()) ;
		JButton bouton7 = new JButton(le.recupEmp(6).bouton()) ;
		JButton bouton8 = new JButton(le.recupEmp(7).bouton()) ;
	    
	    centredroite.setLayout(null);
		this.setTitle("Gestion des Employes");
		this.setSize(LARGEUR,HAUTEUR);
		JButton ajouter = new JButton("Ajouter un Employé");
		JButton supprimer = new JButton("Supprimer un Employé");
		ajouter.addActionListener(new FraAjEmployeListener());
		supprimer.addActionListener(new SupEmpListener(le));
		bas.add(ajouter);
		bas.add(supprimer);
		this.add(gauche,BorderLayout.WEST);
		gauche.add(bas,BorderLayout.SOUTH);

		this.setVisible(true);

		
		
		
		hautdroite.add(plushaut , BorderLayout.EAST) ;
		basdroite.add(plusbas , BorderLayout.EAST) ;
	
		this.add(hautdroite , BorderLayout.NORTH) ;
		this.add(basdroite , BorderLayout.SOUTH) ;
		
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
		
		canvas.setBounds(0 , 0 , 1000,600);
		centredroite.add(canvas) ;
		
		this.add(centredroite , BorderLayout.CENTER) ;
	   
	   JLabel label = new JLabel() ;
	   
	 
	   gauche.add(label , BorderLayout.CENTER) ;
	   this.add(gauche , BorderLayout.WEST) ; 
	   bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton1.getText() ;
				label.setText(le.recupEmp(0).toString() );
				
			}
		});
	   
	   bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton2.getText() ;
				label.setText(le.recupEmp(1).toString() );
				
			}
		});
	   bouton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton3.getText() ;
				label.setText(le.recupEmp(2).toString() );
				
			}
		});
	   bouton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton4.getText() ;
				label.setText(le.recupEmp(3).toString() );
				
			}
		});
	   bouton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton5.getText() ;
				label.setText(le.recupEmp(4).toString() );
				
			}
		});
	   bouton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton6.getText() ;
				label.setText(le.recupEmp(5).toString() );
				
			}
		});
	   bouton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton7.getText() ;
				label.setText(le.recupEmp(6).toString() );
				
			}
		});
	   bouton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton8.getText() ;
				label.setText(le.recupEmp(7).toString() );
				
			}
		});
	  
	  
	 
	    this.setVisible(true) ;
		
	}
	
}
