package controleur;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameGestion.*;

public class ProjetListener implements ActionListener  {
	
	public ProjetListener() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new FrameGestionProjet();
	}
}
