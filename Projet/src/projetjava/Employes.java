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

public class Employes extends JFrame implements ActionListener{
	private JComboBox  employes ;
	
	final static int HAUTEUR = 300 ;
	final static int LARGEUR = 300 ;
	
	public Employes() {
		setTitle("Employes") ;
		setSize(LARGEUR,HAUTEUR) ;
		this.setBackground(Color.PINK);
		add(listederoulante() , BorderLayout.CENTER);
		JButton back = new JButton ("BACK") ;
		this.add(back , BorderLayout.SOUTH) ;
		back.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true) ;
	}
	
	public JPanel listederoulante() {
		JPanel panel = new JPanel() ;
		/* panel.setLayout(new FlowLayout() ); */
		
		Object[] elements1 = new Object[] {"employe1","employe2","employe3","employe4",} ;
		employes = new JComboBox (elements1) ;
		employes.setBounds(10,10,200,40);
		panel.add(employes) ;
		JLabel label = new JLabel(" ") ;
		panel.add(label) ;
		label.setBounds(10,100,200,40);
		employes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				String s1 = (String) employes.getSelectedItem() ;
				label.setText("Vous avez selectionne " + s1 );
				
			}
		});
		
		
		
		return panel ;
		
	}
	
	public JComboBox getemployes() {
		return employes ;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Ressources ress = new Ressources() ;
		
	}
	

    
}
