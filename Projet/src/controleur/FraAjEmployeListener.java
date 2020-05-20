package controleur;

import java.awt.event.*;
import frameGestion.SubFrameAjEmployes;

public class FraAjEmployeListener implements ActionListener{
	public FraAjEmployeListener(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new SubFrameAjEmployes();
	}
}
