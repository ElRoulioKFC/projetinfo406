package frameGestion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameGestionOrdinateur extends JFrame {

	final static int HAUTEUR = 600;
	final static int LARGEUR = 1000;
	JPanel gauche = new JPanel(new BorderLayout());
	JPanel bas = new JPanel(new GridLayout(1,2));
	JPanel liste = new JPanel ( new BorderLayout());
	
	public FrameGestionOrdinateur() {
		this.setTitle("Gestion des Ordinateurs");
		this.setSize(LARGEUR,HAUTEUR);
		

		JButton ajouter = new JButton("Ajouter un Ordinateur");
		JButton supprimer = new JButton("Supprimer un Ordinateur");
		bas.add(ajouter);
		bas.add(supprimer);
		this.add(gauche,BorderLayout.WEST);
		gauche.add(bas,BorderLayout.SOUTH);

		
		Object[] elements3 = new Object[] {"ordinateur","date d'achat" , "puissance de calcul"} ;
		JComboBox ordinateur = new JComboBox (elements3) ;
		ordinateur.setBounds(10,10,200,50); 
		liste.add(ordinateur) ;
		JLabel label3 = new JLabel(" ") ;
		liste.add(label3) ;
		label3.setBounds(10,100,300,50); 
		ordinateur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s3 = (String) ordinateur.getSelectedItem() ;
				label3.setText("Vous avez sélectionné " + s3 );
				
			}
		});
		
		this.add(liste , BorderLayout.NORTH) ; 
		this.setVisible(true) ;
		
	}
	
}
