package frameGestion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SubFrameAjProjets extends Frame{
	JTextField nom = new JTextField("",15);
	JTextField client = new JTextField("",15);
	JTextField nbh = new JTextField("",15);
	JTextField date = new JTextField("",15);
	JTextField chef = new JTextField("0",15);
	JDialog d = new JDialog(this,"Information du projet",false);
}
