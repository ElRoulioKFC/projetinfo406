package edt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Changer_mois_prec implements ActionListener {
	public Date date;
	public CalendrierCanvas cc;
	
	public Changer_mois_prec (Date date,CalendrierCanvas cc) {
		this.date=date;
		this.cc=cc;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		this.date=cc.mois_prec(this.date);		

	}

}