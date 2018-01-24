package revision;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class labe extends JFrame {
private JLabel l1;

labe(){
	super("the Title");
	l1 = new JLabel("the sentance will appear here");
	l1.setToolTipText("hover text will aperar here");
	add(l1);
	
	
	
}

}
