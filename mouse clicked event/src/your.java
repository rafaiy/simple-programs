import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class your extends JFrame {
private JLabel status;
private String info;

public your(){
	super("mouse clicked");
	status = new JLabel("click");
	add(status, BorderLayout.SOUTH);
	
	addMouseListener(new mouse());
	
}

public class mouse extends MouseAdapter{
	public void Mouseclicked(MouseEvent e){
	info = String.format("you clickd the mouse %d times ", e.getClickCount());
		if(e.isMetaDown())
			info += "is meta down mostly right";
			else if(e.isAltDown())
				info += "press alt and the clicked";
			else 
				info += "you clicked left";
		status.setText(info);
		}
	}
}

