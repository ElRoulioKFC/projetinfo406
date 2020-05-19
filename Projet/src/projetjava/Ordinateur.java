package projetjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ordinateur extends JFrame implements ActionListener{
	
	private JComboBox  ordinateur ;
	
	final static int HAUTEUR = 300 ;
	final static int LARGEUR = 300 ;
	
	public Ordinateur() {
		setTitle("Ressources") ;
		setSize(LARGEUR,HAUTEUR) ;
		this.setBackground(Color.PINK);
		this.setLayout(new BorderLayout()) ;
		this.setLayout(new FlowLayout()) ;
		add(listedéroulante() , BorderLayout.CENTER);
		JButton back = new JButton ("BACK") ;
		this.add(back , BorderLayout.SOUTH) ;
		back.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true) ;
	}
	
	public JPanel listedéroulante() {
		JPanel panel = new JPanel() ;

		Object[] elements3 = new Object[] {"ordinateur","date d'achat" , "puissance de calcul"} ;
		ordinateur = new JComboBox (elements3) ;
		ordinateur.setBounds(10,50,200,40);
		panel.add(ordinateur) ;
		JLabel label3 = new JLabel(" ") ;
		panel.add(label3) ;
		label3.setBounds(10,100,200,40);
		ordinateur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s3 = (String) ordinateur.getSelectedItem() ;
				label3.setText("Vous avez sélectionné " + s3 );
				
			}
		});
		
		
		return panel ;
		
	}
	
	
	public JComboBox getordinateur() {
		return ordinateur ;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Ressources ress = new Ressources() ;
	}
	
    
}
