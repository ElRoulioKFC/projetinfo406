package frameGestion;
import FramePrincipale.FramePrincipale;
import java.awt.*;

public class SubFrameAjEmployes extends Frame {
	public SubFrameAjEmployes() {
		Dialog d = new Dialog(this,"Données",false);
		d.setSize(220,230);
		d.setLayout(new GridLayout(6,2));
		d.add(new Label("Nom : "));
		d.add(new TextField(20));
		d.add(new Label("Prénom : "));
		d.add(new TextField(20));
		d.add(new Label("Métier : "));
		d.add(new TextField(20));
		d.add(new Label("Salaire : "));
		d.add(new TextField(5));
		d.add(new Label("Nb H/Sem : "));
		d.add(new TextField(3));
		d.add(new Label("Mail : "));
		d.add(new TextField(30));
		d.setVisible(true);
	}

}
