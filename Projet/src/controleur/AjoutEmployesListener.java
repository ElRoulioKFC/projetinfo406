package controleur;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dialog;

import frameGestion.*;

public class AjoutEmployesListener implements ActionListener{
	
	public AjoutEmployesListener(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new SubFrameAjEmployes();
	}
}
