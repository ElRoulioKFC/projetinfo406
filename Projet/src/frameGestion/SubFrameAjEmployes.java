package frameGestion;
import FramePrincipale.FramePrincipale;
import java.awt.*;

public class SubFrameAjEmployes extends Frame {
	public SubFrameAjEmployes() {
		Dialog d = new Dialog(this,"Donn�es",false);
		d.setSize(200,300);
		d.setLayout(new FlowLayout());
		d.add(new Label("Nom : "));
		d.add(new TextField(10));
		d.add(new Label("Pr�nom : "));
		d.add(new TextField(10));
		d.setVisible(true);
	}

}
