package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gestion.FrameGestionProjet;


public class ProjetListener implements ActionListener  {
	private FrameGestionProjet fgp;
	
	public ProjetListener() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.fgp = new FrameGestionProjet();
	}
}
