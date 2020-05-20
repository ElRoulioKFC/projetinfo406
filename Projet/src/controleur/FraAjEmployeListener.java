package controleur;

import java.awt.event.*;
import frameGestion.SubFrameAjEmploye;

public class FraAjEmployeListener implements ActionListener{
	public FraAjEmployeListener(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new SubFrameAjEmploye();
	}
}
