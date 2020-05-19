package projetjava;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloser extends WindowAdapter {
	private Frame f ;
	public WindowCloser(Frame Ressources) {
		this.f = f ;
	}
	public void WindowClosing(WindowEvent e) {
		f.dispose();
	}
}
