package FramePrincipale;

import java.awt.*;
import java.awt.event.*;

public class DialogClosing extends WindowAdapter{
	
	private Dialog d;
	
	public DialogClosing(Dialog d) {
		this.d = d;
	}
	
	public void dialogClosing(WindowEvent e) {
		d.dispose();

	}

}
