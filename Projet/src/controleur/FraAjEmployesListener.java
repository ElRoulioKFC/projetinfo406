package controleur;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import frameGestion.*;

public class FraAjEmployesListener implements ActionListener{
	private FrameGestionEmployes fge;
	
	public FraAjEmployesListener(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new SubFrameAjEmployes();
	}
}
