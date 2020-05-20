package controleur;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameGestion.*;

public class SalleListener implements ActionListener {
	
	public SalleListener() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new FrameGestionSalle();
	}
}
