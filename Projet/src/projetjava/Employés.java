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

public class Employ�s extends JFrame implements ActionListener{
	private JComboBox  employ�s ;
	
	final static int HAUTEUR = 300 ;
	final static int LARGEUR = 300 ;
	
	public Employ�s() {
		setTitle("Employ�s") ;
		setSize(LARGEUR,HAUTEUR) ;
		this.setBackground(Color.PINK);
		add(listed�roulante() , BorderLayout.CENTER);
		JButton back = new JButton ("BACK") ;
		this.add(back , BorderLayout.SOUTH) ;
		back.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true) ;
	}
	
	public JPanel listed�roulante() {
		JPanel panel = new JPanel() ;
		/* panel.setLayout(new FlowLayout() ); */
		
		Object[] elements1 = new Object[] {"employ�1","employ�2","employ�3","employ�4",} ;
		employ�s = new JComboBox (elements1) ;
		employ�s.setBounds(10,10,200,40);
		panel.add(employ�s) ;
		JLabel label = new JLabel(" ") ;
		panel.add(label) ;
		label.setBounds(10,100,200,40);
		employ�s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = (String) employ�s.getSelectedItem() ;
				label.setText("Vous avez s�lectionn� " + s1 );
				
			}
		});
		
		
		
		return panel ;
		
	}
	
	public JComboBox getemploy�s() {
		return employ�s ;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Ressources ress = new Ressources() ;
		
	}
	

    
}
