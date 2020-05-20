package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameGestion.SubFrameAjProjets;

public class FraAjProjetListener implements ActionListener{
	public FraAjProjetListener(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new SubFrameAjProjets();
	}

}
