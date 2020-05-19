package projetjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Employés extends JFrame implements ActionListener{
	private JComboBox  employés ;
	
	final static int HAUTEUR = 300 ;
	final static int LARGEUR = 300 ;
	
	public Employés() {
		setTitle("Employés") ;
		setSize(LARGEUR,HAUTEUR) ;
		this.setBackground(Color.PINK);
		add(listedéroulante() , BorderLayout.CENTER);
		JButton back = new JButton ("BACK") ;
		this.add(back , BorderLayout.SOUTH) ;
		back.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true) ;
	}
	
	public JPanel listedéroulante() {
		JPanel panel = new JPanel() ;
		/* panel.setLayout(new FlowLayout() ); */
		
		Object[] elements1 = new Object[] {"employé1","employé2","employé3","employé4",} ;
		employés = new JComboBox (elements1) ;
		employés.setBounds(10,10,200,40);
		panel.add(employés) ;
		JLabel label = new JLabel(" ") ;
		panel.add(label) ;
		label.setBounds(10,100,200,40);
		employés.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = (String) employés.getSelectedItem() ;
				label.setText("Vous avez sélectionné " + s1 );
				
			}
		});
		
		
		
		return panel ;
		
	}
	
	public JComboBox getemployés() {
		return employés ;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Ressources ress = new Ressources() ;
		
	}
	

    
}
