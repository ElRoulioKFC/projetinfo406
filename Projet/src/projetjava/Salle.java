package projetjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Salle extends JFrame implements ActionListener{
	private JComboBox  salle ;
	
	
	final static int HAUTEUR = 300 ;
	final static int LARGEUR = 300 ;
	
	public Salle() {
		setTitle("Ressources") ;
		setSize(LARGEUR,HAUTEUR) ;
		this.setBackground(Color.PINK);
		this.setLayout(new FlowLayout() );
		JButton back = new JButton ("BACK") ;
		this.add(back , BorderLayout.SOUTH) ;
		back.addActionListener(this);
		add(listederoulante() , BorderLayout.CENTER);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true) ;
	}
	
	public JPanel listederoulante() {
		JPanel panel = new JPanel() ;
		
		
		
		
		
		Object[] elements2 = new Object[] {"salle","ne salle" , "nombre de places "} ;
		salle = new JComboBox (elements2) ;
		salle.setBounds(10,30,220,40);
		panel.add(salle) ;
		JLabel label2 = new JLabel(" ") ;
		panel.add(label2) ;
		
		salle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s2 = (String) salle.getSelectedItem() ;
				label2.setText("Vous avez selectionne " + s2 );
				
			}
		});
		
		
		
		return panel ;
		
	}
	
	
	public JComboBox getsalle() {
		return salle ;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Ressources ress = new Ressources() ;
	}
	
    
}
