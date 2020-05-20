package controleur;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import frameGestion.*;

public class FraAjEmployeListener implements ActionListener{
	private FrameGestionEmployes fge;
	
	public FraAjEmployeListener(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new SubFrameAjEmployes();
	}
}
