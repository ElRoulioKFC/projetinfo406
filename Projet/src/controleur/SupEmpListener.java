package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frameGestion.SupEmp;

public class SupEmpListener implements ActionListener {
	private ListeEmploye liste;
	public SupEmpListener(ListeEmploye liste){
		this.liste = liste;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		new SupEmp(this.liste);
		
	}

}
