package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameGestion.SubFrameAjMateriel;

public class FraAjMaterielListener implements ActionListener {
	public FraAjMaterielListener() {
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		new SubFrameAjMateriel();

	}

}
