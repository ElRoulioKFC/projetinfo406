package controleur;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameGestion.FrameGestionMateriel;

public class MaterielListener implements ActionListener {
	private FrameGestionMateriel fgo;
	
	public MaterielListener(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.fgo = new FrameGestionMateriel();

	}

}
