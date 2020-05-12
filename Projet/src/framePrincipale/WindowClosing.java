package framePrincipale;

import java.awt.Window;
import java.awt.event.*;

public class WindowClosing extends WindowAdapter {

	private FramePrincipale fp;
		
	public WindowClosing (FramePrincipale fp) {
		this.fp=fp;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		fp.dispose();

	}



}