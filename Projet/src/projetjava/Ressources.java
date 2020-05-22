package projetjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Ressources extends JFrame implements ActionListener{
	
	final static int HAUTEUR = 400 ;
	final static int LARGEUR = 400 ;
	
	public Ressources() {
		
		setTitle("Ressources") ;
		setSize(LARGEUR,HAUTEUR) ;
		this.setLayout(new BorderLayout()) ;
		this.setLayout(new FlowLayout()) ;
		this.setBackground(Color.PINK);  
		
		JButton employes = new JButton ("EMPLOYES") ;
		JButton salle = new JButton ("SALLE") ;
		JButton ordinateur = new JButton ("ORDINATEUR") ;
		this.add(employes , BorderLayout.WEST) ; 	
		this.add(salle , BorderLayout.CENTER) ; 	
		this.add(ordinateur , BorderLayout.EAST) ; 
		
		employes.setPreferredSize(new Dimension(100,100));	
		salle.setPreferredSize(new Dimension(100,100));	
		ordinateur.setPreferredSize(new Dimension(110,100));
		
		employes.setBackground(Color.cyan) ;
		salle.setBackground(Color.cyan) ;
		ordinateur.setBackground(Color.cyan) ;
		
		/*employes.setBounds(200,150,300,200); */
		
		employes.addActionListener(this) ;
		salle.addActionListener(this) ;
		ordinateur.addActionListener(this) ;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true) ;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		        new Employes() ;
	}
	
	public void actionPerformed1(ActionEvent arg1) {
		        new Salle() ;
	}
	
	public void actionPerformed2(ActionEvent arg2) {
		        new Ordinateur() ;
	}
	   
}
