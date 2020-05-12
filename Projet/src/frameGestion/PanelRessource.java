package frameGestion;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controleur.*;

public class PanelRessource {
	
	JPanel ressources = new JPanel(new GridLayout(3,7));
	
	JButton employe = new JButton("Employés");
	JButton ordinateur = new JButton("Ordinateur");
	JButton salle = new JButton("Salles");
	
	public JPanel PanelRess() {
		
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		
		ressources.add(employe);
		
		ressources.add(new Label(" "));
		
		ressources.add(ordinateur);
		
		ressources.add(new Label(" "));
		
		ressources.add(salle);
		
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		ressources.add(new Label(" "));
		
		employe.addActionListener(new EmployesListener());
		ordinateur.addActionListener(new OrdinateurListener());
		salle.addActionListener(new SalleListener());
		
		return ressources;
	}

}
