package controleur;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameGestion.*;

public class EmployeListener implements ActionListener  {
	
	public EmployeListener() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new FrameGestionEmployes();
	}
}
