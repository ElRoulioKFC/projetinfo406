package framePrincipale;

import java.awt.Window;
import frameGestion.SubFrameAjEmploye;
import java.awt.event.*;

public class WindowClosing extends WindowAdapter {

	private FramePrincipale fp;
	private SubFrameAjEmploye sf;
		
	public WindowClosing (FramePrincipale fp) {
		this.fp=fp;
	}
	
	public WindowClosing (SubFrameAjEmploye sf) {
		this.sf=sf;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		if (fp != null) {
			fp.dispose();
		}
		if (sf != null) {
			sf.dispose();
		}

	}



}
