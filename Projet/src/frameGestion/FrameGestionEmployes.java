package frameGestion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import controleur.*;
import framePrincipale.FramePrincipale;

public class FrameGestionEmployes extends JFrame {
	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	
	private ListeEmployes le = new ListeEmployes() ;
	private CanvasEmployés canvas = new CanvasEmployés() ; 
	/*private ImageIcon monimage ;*/
	
	Employes employe1 = new Employes(1,"Massag","Paule Cadrelle",7000,40,"Data Scientist","massagcadrelle@gmail.com" ) ; 
	Employes employe2 = new Employes(2,"Brivet","Brivet",5000,45,"Data Ingeneer","alexisbrivet@gmail.com") ;
	Employes employe3 = new Employes(3,"Geyer","jules",5000,45,"Data Analyst","geyerjules@gmail.com") ;
	Employes employe4 = new Employes(4,"El ouali","ines",5000,45,"Developpeur web","elouali@gmail.com") ;
	Employes employe5 = new Employes(5,"signorina","bianca",5000,45,"Data Ingeneer","signorinabianca@gmail.com") ;
	Employes employe6 = new Employes(6,"maulet","morgane",8000,45,"Prof de maths","mauletmorgane@gmail.com") ;
	Employes employe7 = new Employes(7,"Kenny","davila",5000,45,"Data Ingeneer","geyerjules@gmail.com") ;
	Employes employe8 = new Employes(8,"Plassass","Alexia",8000,45,"Data Scientist","alexiaplassass@gmail.com") ;
	
	JPanel gauche = new JPanel(new BorderLayout());
	JPanel bas = new JPanel(new GridLayout(1,2));
	
	JButton plushaut = new JButton ("haut") ;
	JButton plusbas = new JButton("bas") ;
	
	JPanel hautdroite = new JPanel(new BorderLayout()) ;
	JPanel basdroite = new JPanel(new BorderLayout()) ;
	
	JPanel centredroite = new JPanel(new BorderLayout()) ;
	
	JButton bouton1 = new JButton("EMPLOYE NUMERO 1") ;
	JButton bouton2 = new JButton("EMPLOYE NUMERO 2") ;
	JButton bouton3 = new JButton("EMPLOYE NUMERO 3") ;
	JButton bouton4 = new JButton("EMPLOYE NUMERO 4") ;
	JButton bouton5 = new JButton("EMPLOYE NUMERO 5") ;
	JButton bouton6 = new JButton("EMPLOYE NUMERO 6") ;
	JButton bouton7 = new JButton("EMPLOYE NUMERO 7") ;
	JButton bouton8 = new JButton("EMPLOYE NUMERO 8") ;

	
   
	public FrameGestionEmployes() {
		
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
	    
	    centredroite.setLayout(null);
		this.setTitle("Gestion des Employes");
		this.setSize(LARGEUR,HAUTEUR);
		JButton ajouter = new JButton("Ajouter un Employé");
		JButton supprimer = new JButton("Supprimer un Employé");
		ajouter.addActionListener(new AjoutEmployesListener());
		bas.add(ajouter);
		bas.add(supprimer);
		this.add(gauche,BorderLayout.WEST);
		gauche.add(bas,BorderLayout.SOUTH);
		
		
		
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
				label.setText(employe1.toString() );
				
			}
		});
	   
	   bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton2.getText() ;
				label.setText(employe2.toString() );
				
			}
		});
	   bouton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton3.getText() ;
				label.setText(employe3.toString() );
				
			}
		});
	   bouton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton4.getText() ;
				label.setText(employe4.toString() );
				
			}
		});
	   bouton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton5.getText() ;
				label.setText(employe5.toString() );
				
			}
		});
	   bouton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton6.getText() ;
				label.setText(employe6.toString() );
				
			}
		});
	   bouton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton7.getText() ;
				label.setText(employe7.toString() );
				
			}
		});
	   bouton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = bouton8.getText() ;
				label.setText(employe8.toString() );
				
			}
		});
	  
	  
	 
	    this.setVisible(true) ;
		
	}
	
}
