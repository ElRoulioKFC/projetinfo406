package controleur;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameGestion.*;

public class EmployeListener implements ActionListener  {
	private FrameGestionEmployes fge;
	
	public EmployeListener() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.fge = new FrameGestionEmployes();
	}
}
