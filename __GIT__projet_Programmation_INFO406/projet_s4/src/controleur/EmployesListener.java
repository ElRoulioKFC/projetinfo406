package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gestion.FrameGestionEmployes;


public class EmployesListener implements ActionListener  {
	private FrameGestionEmployes fge;
	
	public EmployesListener() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.fge = new FrameGestionEmployes();
	}
}
