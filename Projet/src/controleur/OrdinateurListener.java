package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameGestion.FrameGestionOrdinateur;

public class OrdinateurListener implements ActionListener {
	private FrameGestionOrdinateur fgo;
	
	public OrdinateurListener(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.fgo = new FrameGestionOrdinateur();

	}

}
