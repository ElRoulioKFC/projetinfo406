package framePrincipale;

import java.awt.Window;
import frameGestion.SubFrameAjEmployes;
import java.awt.event.*;

public class WindowClosing extends WindowAdapter {

	private FramePrincipale fp;
	private SubFrameAjEmployes sf;
		
	public WindowClosing (FramePrincipale fp) {
		this.fp=fp;
	}
	
	public WindowClosing (SubFrameAjEmployes sf) {
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
