package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import frameGestion.SubFrameAjSalle;

public class FraAjSalleListener implements ActionListener{
	public FraAjSalleListener() {
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		new SubFrameAjSalle();
	}
}
